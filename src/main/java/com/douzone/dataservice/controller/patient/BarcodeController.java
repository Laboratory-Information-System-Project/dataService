package com.douzone.dataservice.controller.patient;

import com.douzone.dataservice.service.collectservice.BarcodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/data-service")
@RequiredArgsConstructor
public class BarcodeController {
    private final BarcodeService barcodeService;

    @GetMapping("/barcode")
    public List<Map<String,Object>> getBarcode(@RequestParam List<String> prescribeCodeList){
        return barcodeService.getBarcodeByPrescribeCodeList(prescribeCodeList);
    }
}
