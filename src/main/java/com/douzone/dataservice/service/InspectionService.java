package com.douzone.dataservice.service;

import com.douzone.dataservice.domain.*;

import java.util.List;

public interface InspectionService {

    List<RegisterDTO> getUnregistered();

    List<RegisterDTO> getSearchRegister(SearchDTO search);


    List<InspectionTypeDTO> getSearchInspectionType(String orderCode);

    List<ConclusionDTO> getSelectConclusion(SearchDTO search);

    List<UnsuitableStatusDTO> getUnsuitableStatus();

}
