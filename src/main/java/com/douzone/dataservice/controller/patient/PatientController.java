package com.douzone.dataservice.controller.patient;

import com.douzone.dataservice.domain.PatientInfoDto;
import com.douzone.dataservice.service.patient.PatientService;
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

    @GetMapping("/patient/info/{patientNo}/{visitStatus}")
    public List<PatientInfoDto> getPatientInfo(@PathVariable Long patientNo, @PathVariable String visitStatus){
        return patientService.getPatientInfoByPatientNo(patientNo, visitStatus);
    }
}
