package com.douzone.dataservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterDTO {
    private Long registerCode;
    private String userId;
    private Long barcode;
    private LocalDateTime registerDt;
    private String orderCode;
    private Long resultNo;
    private String statusCode;
    private Long patientNo;
}
