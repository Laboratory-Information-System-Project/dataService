package com.douzone.dataservice.service.patientservice;

import com.douzone.dataservice.domain.patientdomain.PatientDomainDTO;

import java.util.List;

public interface PatientService {
    List<PatientDomainDTO>patientData(String barcode);
}
