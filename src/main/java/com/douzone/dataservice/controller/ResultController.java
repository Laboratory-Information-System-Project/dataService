package com.douzone.dataservice.controller;

import com.douzone.dataservice.domain.*;
import com.douzone.dataservice.service.ResultService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/data-service")
@RequiredArgsConstructor
@Slf4j
public class ResultController {

    private final ResultService service;

    @GetMapping("/result/all")
    public List<ResultDTO> resultList(){
        return service.allList();
    }

    @GetMapping("/result/search")
    public List<ResultDTO> getResult(ResultSearchDTO resultSearch){
        return service.getSearchResult(resultSearch);
    }

    @GetMapping("/result/{text}")
    public List<ResultDTO> searchNotDate(@PathVariable int text){
        return service.searchNotDate(text);
    }


}

