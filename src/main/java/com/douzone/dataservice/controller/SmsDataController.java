package com.douzone.dataservice.controller;

import com.douzone.dataservice.domain.ResultDTO;
import com.douzone.dataservice.domain.SmsDataDTO;
import com.douzone.dataservice.service.SmsDataService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/data-service")
@RequiredArgsConstructor
@Slf4j
public class SmsDataController {
    private final SmsDataService service;

    @GetMapping("/smsData/all")
    public List<SmsDataDTO> smsDataList(){
        return service.SmsAllList();
    }

    @PostMapping("/smsData")
    void insertSmsData(@RequestBody SmsDataDTO smsData) {
        service.insert(smsData);
        System.out.println("유저 DB 저장 성공");
    }

    @PutMapping("/smsData/{smsNo}")
    public void update(@PathVariable int smsNo, @RequestBody SmsDataDTO smsData) {
        SmsDataDTO update = smsData;
        System.out.println("업데이트유저 => " + update);

        update.setSmsTitle(smsData.getSmsTitle());
        update.setSmsContent(smsData.getSmsContent());
        service.update(smsData);
    }

    @DeleteMapping("/smsData/{smsNo}")
    public void delete(@PathVariable int smsNo) {
        service.delete(smsNo);
    }
}
