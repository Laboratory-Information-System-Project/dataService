package com.douzone.dataservice.controller;


import com.douzone.dataservice.domain.PatientDTO;
import com.douzone.dataservice.service.PatientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
@RequiredArgsConstructor
@Slf4j
public class PatientController {
    private final PatientService service;

    @GetMapping("/all")
    public List<PatientDTO> patientList(){
        return service.patientList();
    }
}
