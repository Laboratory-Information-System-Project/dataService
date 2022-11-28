package com.douzone.dataservice.controller;

import com.douzone.dataservice.domain.collectdomain.CollectDomainDTO;
import com.douzone.dataservice.domain.patientdomain.PatientDomainDTO;
import com.douzone.dataservice.service.collectservice.CollectService;
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
public class DataController {
    private final PatientService patientService;
    private final CollectService collectService;

    @GetMapping("/patient/{barcode}")
    public List<PatientDomainDTO>patientData(@PathVariable String barcode){
        return patientService.patientData(barcode);
    }
    @GetMapping("/collect/{barcode}")
    public List<CollectDomainDTO>colletData(@PathVariable String barcode){
        return collectService.colletData(barcode);
    }

}
