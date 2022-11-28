package com.douzone.dataservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SampleDTO {
        private Long barcode;
        private String statusName;
        private Date barcodeDt;
        private Date collectingDt;
        private String vesselCode;
        private String barcodePrinterId;
        private String collectorId;
        private Long prescribeCode;
        private Date cancelBarcodeDt;
        private Date cancelCollectingDt;

//    private Long barcode;
//    private String status_code;
//    private Date barcode_dt;
//    private Date collecting_dt;
//    private String user_name;
//    private String collector_id;
//    private Long prescribe_code;
//    private Date cancel_barcode_dt;
//    private Date cancel_collecting_dt;
}
