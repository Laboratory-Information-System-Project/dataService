package com.douzone.dataservice.controller;

import com.douzone.dataservice.domain.ResultDTO;
import com.douzone.dataservice.domain.ResultSearchDTO;
import com.douzone.dataservice.service.ResultService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/result")
@RequiredArgsConstructor
@Slf4j
public class ResultController {

    private final ResultService service;

    @GetMapping("/all")
    public List<ResultDTO> resultList(){
        return service.allList();
    }

    @GetMapping
    public List<ResultDTO> getResult(ResultSearchDTO search){
        return service.getResult(search);
    }

    @GetMapping("/{text}")
    public List<ResultDTO> searchNotDate(@PathVariable int text){
        return service.searchNotDate(text);
    }


}

