package com.douzone.dataservice.domain;

import lombok.Data;
import java.sql.Date;

@Data
public class PatientDTO {
    private int patientNo;
    private String patientName;
    private String patientPhoneNumber;
};