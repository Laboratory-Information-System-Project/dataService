package com.douzone.dataservice.service.patient;


import com.douzone.dataservice.domain.PatientDTO;
import com.douzone.dataservice.domain.PatientInfoDto;
import com.douzone.dataservice.domain.patientdomain.PatientDomainDTO;

import java.util.List;

public interface PatientService {
    List<PatientInfoDto> getPatientInfoByPatientNo(Long patientNo);

    List<PatientDomainDTO>patientData(String barcode);

    List<PatientDTO> patientList();

}
