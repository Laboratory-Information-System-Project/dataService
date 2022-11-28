package com.douzone.dataservice.domain;

import lombok.*;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class SendSmsResponseDTO {
    private String requestId;
    private Timestamp requestTime;
    private String statusCode;
    private String statusName;
}
