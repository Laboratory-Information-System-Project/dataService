package com.douzone.dataservice.controller;

import com.douzone.dataservice.domain.PatientInfoDto;
import com.douzone.dataservice.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/data-service")
public class PatientController {

    private final PatientService patientService;

    @GetMapping("/patient/{patientNo}")
    public List<PatientInfoDto> getPatientInfo(@PathVariable Long patientNo){
        return patientService.getPatientInfoByPatientNo(patientNo);
    }
}
