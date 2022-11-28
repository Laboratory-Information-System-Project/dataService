package com.douzone.dataservice.service;

import com.douzone.dataservice.domain.PatientDTO;
import com.douzone.dataservice.mapper.PatientMapper;
import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService{
    private final PatientMapper mapper;

    @Override
    public List<PatientDTO> patientList(){
        return mapper.patientAll();
    }
}
