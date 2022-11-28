package com.douzone.dataservice.domain;

import lombok.Data;
import java.sql.Date;

@Data
public class ResultDTO {
    private String registerDt;
    private int patientNo;
    private String sampleName;
    private String prescribeDt;
    private String inspectionName;
    private int figures;
    private int baseline;
    private String unit;
    private String note;
    private String sampleNote;
}


