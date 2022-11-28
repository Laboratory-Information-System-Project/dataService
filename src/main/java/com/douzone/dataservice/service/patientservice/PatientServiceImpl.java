package com.douzone.dataservice.service.patientservice;

import com.douzone.dataservice.domain.patientdomain.PatientDomainDTO;
import com.douzone.dataservice.mapper.patientmapper.PatientMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService{
    private final PatientMapper patientMapper;
    @Override
    public List<PatientDomainDTO> patientData(String barcode) {
        return patientMapper.patientData(barcode);
    }

}
