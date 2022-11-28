package com.douzone.dataservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultSearchDTO {
    private int patientNo;
    private Date startDate;
    private Date endDate;
}
