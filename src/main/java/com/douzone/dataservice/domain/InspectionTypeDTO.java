package com.douzone.dataservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InspectionTypeDTO {
    private String inspectionCode;
    private String orderCode;
    private String inspectionName;
    private String unit;
    private Double baseline;
}
