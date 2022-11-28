package com.douzone.dataservice.service.prescribe;

import java.util.List;
import java.util.Map;

public interface PrescribeService {

    List<Map<String, Object>> getPrescribeInfoByVisitNo(Long visitNo);
}
