package com.douzone.dataservice.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientInfoDto {
    private Long patientNo;
    private String patientName;
    private Integer patientAge;
    private String patientBloodType;
    private Integer patientHeight;
    private Integer patientWeight;
    private String patientAddress;
    private String patientPhoneNumber;
    private String patientResidentNumber;
    private String patientGender;
    private Long visitCode;
    private LocalDate visitDt;
    private String visitStatus;
    private String userName;
    private String departmentName;
}
