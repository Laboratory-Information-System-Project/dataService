package com.douzone.dataservice.service.patient;


import com.douzone.dataservice.domain.PatientInfoDto;

import java.util.List;

public interface PatientService {
    List<PatientInfoDto> getPatientInfoByPatientNo(Long patientNo);
}
