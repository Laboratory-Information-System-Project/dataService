package com.douzone.dataservice.service;

import com.douzone.dataservice.domain.ResultDTO;
import com.douzone.dataservice.domain.ResultSearchDTO;;

import java.util.List;

public interface ResultService {
    List<ResultDTO> allList();

    List<ResultDTO> getResult(ResultSearchDTO search);

    List<ResultDTO> searchNotDate(int text);

}