package com.douzone.dataservice.controller;

import com.douzone.dataservice.domain.ConclusionDTO;
import com.douzone.dataservice.domain.InspectionTypeDTO;
import com.douzone.dataservice.domain.RegisterDTO;
import com.douzone.dataservice.domain.SearchDTO;
import com.douzone.dataservice.service.InspectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/data-service")
@RequiredArgsConstructor
public class InspectionController {

    private final InspectionService service;

    @GetMapping("/inspection-service/register/today")
    public List<RegisterDTO> getTodayRegister(){
        return service.getTodayRegister();
    }

    @GetMapping("/inspection-service/register/search")
    public List<RegisterDTO> getSearchRegister(SearchDTO search){
        return service.getSearchRegister(search);
    }

    @GetMapping("/inspection-service/inspection-type/search")
    public List<InspectionTypeDTO> getSearchInspectionType(SearchDTO search){
        return service.getSearchInspectionType(search);
    }


    @GetMapping("/inspection-service/conclusion/search")
    public List<ConclusionDTO> getSelectConclusion(SearchDTO search){
        return service.getSelectConclusion(search);
    }
}
