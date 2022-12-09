package com.douzone.dataservice.service;

import com.douzone.dataservice.domain.ConclusionDTO;
import com.douzone.dataservice.domain.InspectionTypeDTO;
import com.douzone.dataservice.domain.RegisterDTO;
import com.douzone.dataservice.domain.SearchDTO;

import java.util.List;

public interface InspectionService {

    List<RegisterDTO> getUnregistered();

    List<RegisterDTO> getSearchRegister(SearchDTO search);


    List<InspectionTypeDTO> getSearchInspectionType(String orderCode);

    List<ConclusionDTO> getSelectConclusion(SearchDTO search);

}
