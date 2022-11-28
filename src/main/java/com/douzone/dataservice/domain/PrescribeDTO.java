package com.douzone.dataservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrescribeDTO {
    private Long prescribeCode;
    private String userName;
    private String orderName;
    private String doctorId;
    private String visitStatus;
    private String statusName;
    private String prescribeContents;
    private Date prescribeDt;
}
