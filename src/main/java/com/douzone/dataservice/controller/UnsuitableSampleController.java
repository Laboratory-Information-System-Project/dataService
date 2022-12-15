package com.douzone.dataservice.controller;

import com.douzone.dataservice.domain.PrescribeDTO;
import com.douzone.dataservice.domain.SampleDTO;
import com.douzone.dataservice.domain.UnsuitableReasonDTO;
import com.douzone.dataservice.domain.UserDTO;
import com.douzone.dataservice.service.UnsuitableSampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/data-service")
public class UnsuitableSampleController {

    private final UnsuitableSampleService service;

    @GetMapping("/sample/search")
    public List<Map<String, Object>> getSampleInfo(Long barcode, String authority) { return service.getSampleInfo(barcode, authority); }

    @GetMapping("/prescribe/search")
    public List<Map<String, Object>>  getPrescribeInfo(Long barcode, String authority)  {return service.getPrescribeInfo(barcode, authority); }

    @GetMapping("/user/search/{userName}")
    public List<Map<String, Object>> getUsersInfo(@PathVariable String userName) { return service.getUsersInfo(userName); }

    @GetMapping("/unsuitable-reason")
    public List<UnsuitableReasonDTO> getUnsuitableReason() { return service.getUnsuitableReason(); }

    @GetMapping("/unsuitable/{barcode}")
    public List<Map<String, Object>> getUnsuitInfo(@PathVariable Long barcode) { return service.getUnsuitInfo(barcode); }


}
