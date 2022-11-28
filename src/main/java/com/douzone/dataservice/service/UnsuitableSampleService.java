package com.douzone.dataservice.service;


import com.douzone.dataservice.domain.PrescribeDTO;
import com.douzone.dataservice.domain.SampleDTO;
import com.douzone.dataservice.domain.UnsuitableReasonDTO;
import com.douzone.dataservice.domain.UserDTO;

import java.util.List;
import java.util.Map;

public interface UnsuitableSampleService {
    Map<String, Object> getSampleInfo(Long barcode);
    Map<String, Object> getPrescribeInfo(Long barcode);
    List<Map<String, Object>> getUsersInfo(String userName);
    List<UnsuitableReasonDTO> getUnsuitableReason();
}
