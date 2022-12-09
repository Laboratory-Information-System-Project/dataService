package com.douzone.dataservice.mapper.patientmapper;

import com.douzone.dataservice.domain.PatientDTO;
import com.douzone.dataservice.domain.patientdomain.PatientDomainDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface PatientMapper {
    List<PatientDomainDTO> patientData(String barcode);

    List<PatientDTO> patientAll();
    List<HashMap<String, Object>> findPatientInfoByPatientNo(String patientInfo, String visitStatus);

    List<HashMap<String, Object>> findPatientInfoByPatientName(String patientInfo, String visitStatus);

    List<HashMap<String, Object>> findVisitDataByPatientNo(String patientNo);
}
