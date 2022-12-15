package com.douzone.dataservice.service;


import com.douzone.dataservice.domain.PrescribeDTO;
import com.douzone.dataservice.domain.SampleDTO;
import com.douzone.dataservice.domain.UnsuitableReasonDTO;
import com.douzone.dataservice.domain.UserDTO;

import java.util.List;
import java.util.Map;

public interface UnsuitableSampleService {
    List<Map<String, Object>> getSampleInfo(Long barcode, String authority);
    List<Map<String, Object>>  getPrescribeInfo(Long barcode, String authority);
    List<Map<String, Object>> getUsersInfo(String userName);
    List<Map<String, Object>> getUnsuitInfo(Long barcode);
    List<UnsuitableReasonDTO> getUnsuitableReason();
}
