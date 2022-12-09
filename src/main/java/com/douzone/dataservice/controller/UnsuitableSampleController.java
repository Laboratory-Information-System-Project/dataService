package com.douzone.dataservice.controller;

import com.douzone.dataservice.domain.PrescribeDTO;
import com.douzone.dataservice.domain.SampleDTO;
import com.douzone.dataservice.domain.UnsuitableReasonDTO;
import com.douzone.dataservice.domain.UserDTO;
import com.douzone.dataservice.service.UnsuitableSampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/data-service")
public class UnsuitableSampleController {

    private final UnsuitableSampleService service;

    @GetMapping("/sample/search/{barcode}")
    public List<Map<String, Object>> getSampleInfo(@PathVariable Long barcode) { return service.getSampleInfo(barcode); }

    @GetMapping("/prescribe/search/{barcode}")
    public List<Map<String, Object>>  getPrescribeInfo(@PathVariable Long barcode)  {return service.getPrescribeInfo(barcode); }

    @GetMapping("/user/search/{userName}")
    public List<Map<String, Object>> getUsersInfo(@PathVariable String userName) { return service.getUsersInfo(userName); }

    @GetMapping("/unsuitable-reason")
    public List<UnsuitableReasonDTO> getUnsuitableReason() { return service.getUnsuitableReason(); }


}
