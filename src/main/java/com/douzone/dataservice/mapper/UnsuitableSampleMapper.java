package com.douzone.dataservice.mapper;

import com.douzone.dataservice.domain.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UnsuitableSampleMapper {
    List<Map<String, Object>>  findSampleByBarcode(@Param("barcode") Long barcode, @Param("authority") String authority);
    List<Map<String, Object>>  findPrescribeByBarcode(@Param("barcode") Long barcode, @Param("authority") String authority);
    List<UnsuitableSampleDTO> findUnsuitableSample(Long barcode);
    List<Map<String, Object>> findUsersByUsername(String userName);
    List<UnsuitableReasonDTO> findAllUnsuitableReason();
}
