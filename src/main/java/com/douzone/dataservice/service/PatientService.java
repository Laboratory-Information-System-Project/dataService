package com.douzone.dataservice.service;


import com.douzone.dataservice.domain.PatientInfoDto;

import java.util.List;

public interface PatientService {
    List<PatientInfoDto> getPatientInfoByPatientNo(Long patientNo);
}
