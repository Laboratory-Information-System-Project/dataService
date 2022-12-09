package com.douzone.dataservice.service.patient;


import com.douzone.dataservice.domain.PatientDTO;
import com.douzone.dataservice.domain.patientdomain.PatientDomainDTO;

import java.util.HashMap;
import java.util.List;

public interface PatientService {
    List<HashMap<String, Object>> getPatientInfoByPatientNo(String patientNo, String visitStatus, String searchCon);

    List<PatientDomainDTO>patientData(String barcode);

    List<PatientDTO> patientList();

    List<HashMap<String, Object>> getVisitDataByPatientNo(String patientNo);
}
