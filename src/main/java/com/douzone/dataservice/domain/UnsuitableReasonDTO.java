package com.douzone.dataservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UnsuitableReasonDTO {
    private String unsuitableReasonCode;
    private String unsuitableReasonName;
    private String unsuitableStatusCode;
}
