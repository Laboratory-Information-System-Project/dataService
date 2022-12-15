package com.douzone.dataservice.service;

import com.douzone.dataservice.domain.*;
import com.douzone.dataservice.domain.patientdomain.PatientDomainDTO;
import com.douzone.dataservice.mapper.InspectionMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InspectionServiceImpl implements InspectionService{

    private final InspectionMapper mapper;

    @Override
    public List<RegisterDTO> getUnregistered(){
        return mapper.getUnregisteredMapper();
    }

    @Override
    public List<RegisterDTO> getSearchRegister(SearchDTO search){
        return mapper.getSearchRegisterMapper(search);
    }


    @Override
    public List<InspectionTypeDTO> getSearchInspectionType(String orderCode){
        return mapper.getSearchInspectionTypeMapper(orderCode);
    }

    @Override
    public List<ConclusionDTO> getSelectConclusion(SearchDTO search){
        return mapper.getSelectConclusionMapper(search);
    }


    public List<UnsuitableStatusDTO> getUnsuitableStatus(){
        return mapper.getUnsuitableStatus();
    }

}
