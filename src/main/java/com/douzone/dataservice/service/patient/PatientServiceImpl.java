package com.douzone.dataservice.service.patient;

import com.douzone.dataservice.domain.PatientInfoDto;
import com.douzone.dataservice.mapper.PatientMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService{

    private final PatientMapper patientMapper;

    @Override
    public List<PatientInfoDto> getPatientInfoByPatientNo(Long patientNo) {

        return patientMapper.findPatientInfoByPatientNo(patientNo);
    }
}
