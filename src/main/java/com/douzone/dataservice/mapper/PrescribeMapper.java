package com.douzone.dataservice.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PrescribeMapper {
    List<Map<String, Object>> findPrescribeByVisitNo(Long visitNo);
}
