package com.douzone.dataservice.service.patient;

import com.douzone.dataservice.domain.PatientDTO;
import com.douzone.dataservice.domain.PatientInfoDto;
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
    public List<PatientInfoDto> getPatientInfoByPatientNo(Long patientNo) {

        return patientMapper.findPatientInfoByPatientNo(patientNo);
    }

    @Override
    public List<PatientDomainDTO> patientData(String barcode) {
        return patientMapper.patientData(barcode);
    }

    @Override
    public List<PatientDTO> patientList(){
        return patientMapper.patientAll();
    }
}
