package com.douzone.dataservice.mapper;

import com.douzone.dataservice.domain.ResultDTO;
import com.douzone.dataservice.domain.ResultSearchDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ResultMapper {
    List<ResultDTO> selectAll();
    List<ResultDTO> selectOne(ResultSearchDTO search);
    List<ResultDTO> searchNotDate(int text);
}
