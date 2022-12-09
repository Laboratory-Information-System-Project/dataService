package com.douzone.dataservice.service.collectservice;

import java.util.List;
import java.util.Map;

public interface BarcodeService {
    List<Map<String, Object>> getBarcodeByPrescribeCodeList(List<String> prescribeCodeList);
}
