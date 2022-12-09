package com.douzone.dataservice.service.patient;

import com.douzone.dataservice.domain.PatientDTO;
import com.douzone.dataservice.domain.patientdomain.PatientDomainDTO;
import com.douzone.dataservice.mapper.patientmapper.PatientMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService{

    private final PatientMapper patientMapper;

    @Override
    public List<HashMap<String, Object>> getPatientInfoByPatientNo(String patientInfo, String visitStatus, String searchCon) {
        List<HashMap<String,Object>> patientInfos = new ArrayList<>();
        if("환자번호".equals(searchCon)) {
            patientInfos = patientMapper.findPatientInfoByPatientNo(patientInfo,visitStatus);
        }
        if("이름".equals(searchCon)) {
            patientInfos = patientMapper.findPatientInfoByPatientName(patientInfo,visitStatus);
        }

        return patientInfos;
    }

    @Override
    public List<PatientDomainDTO> patientData(String barcode) {
        return patientMapper.patientData(barcode);
    }

    @Override
    public List<PatientDTO> patientList(){
        return patientMapper.patientAll();
    }

    @Override
    public List<HashMap<String, Object>> getVisitDataByPatientNo(String patientNo) {
        return patientMapper.findVisitDataByPatientNo(patientNo);
    }
}
