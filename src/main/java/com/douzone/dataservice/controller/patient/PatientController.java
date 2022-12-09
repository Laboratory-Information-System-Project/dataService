package com.douzone.dataservice.controller.patient;

import com.douzone.dataservice.service.patient.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/data-service")
public class PatientController {

    private final PatientService patientService;

    @GetMapping("/patient/info/{patientInfo}/{visitStatus}/{searchCon}")
    public List<HashMap<String, Object>> getPatientInfo(@PathVariable String patientInfo,
                                                        @PathVariable String visitStatus,
                                                        @PathVariable String searchCon){
        return patientService.getPatientInfoByPatientNo(patientInfo, visitStatus, searchCon);
    }

    @GetMapping("/visit/{patientNo}")
    public List<HashMap<String,Object>> getVisitInfo(@PathVariable String patientNo){
        return patientService.getVisitDataByPatientNo(patientNo);
    }
}
