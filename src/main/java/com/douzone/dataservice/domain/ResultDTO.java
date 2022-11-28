package com.douzone.dataservice.domain;

import lombok.Data;
import java.sql.Date;

@Data
public class ResultDTO {
    private int resultNo;
    private int patientNo;
    private String patientName;
    private String patientPhoneNumber;
    private String registerDt;
    private String sampleName;
    private String prescribeDt;
    private String inspectionName;
    private int figures;
    private int baseline;
    private String unit;
    private String note;
}


