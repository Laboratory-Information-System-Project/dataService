package com.douzone.dataservice.domain;

import lombok.Data;
import java.sql.Date;

@Data
public class ResultDTO {
    private Integer resultNo;
    private Integer patientNo;
    private String patientName;
    private String patientPhoneNumber;
    private String registerDt;
    private String sampleName;
    private String prescribeDt;
    private String inspectionName;
    private Long figures;
    private Integer baseline;
    private String unit;
    private String note;
}


