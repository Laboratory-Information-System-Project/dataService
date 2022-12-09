package com.douzone.dataservice.mapper;

import com.douzone.dataservice.domain.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UnsuitableSampleMapper {
    List<Map<String, Object>>  findSampleByBarcode(Long barcode);
    List<Map<String, Object>>  findPrescribeByBarcode(Long barcode);
    List<UnsuitableSampleDTO> findUnsuitableSample(Long barcode);
    List<Map<String, Object>> findUsersByUsername(String userName);
    List<UnsuitableReasonDTO> findAllUnsuitableReason();
}
