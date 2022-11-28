package com.douzone.dataservice.service;

import com.douzone.dataservice.domain.*;
import com.douzone.dataservice.mapper.UnsuitableSampleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class UnsuitableSampleServiceImpl implements UnsuitableSampleService {

    private final UnsuitableSampleMapper mapper;
    @Override
    public Map<String, Object> getSampleInfo(Long barcode) {
        Map<String, Object> message = new HashMap<>();
        // 부적합 검체 체크
        List<UnsuitableSampleDTO> result = mapper.findUnsuitableSample(barcode);

        if(result.isEmpty()) {
            Map<String, Object> sample = mapper.findSampleByBarcode(barcode);
            if(sample == null) {
                message.put("message", "존재하지 않는 바코드입니다.");
                return message;
            }
            return sample;
        } else {
            message.put("message", "부적합 검체로 등록되어 있는 바코드입니다.");
            return message;
        }
    }

    @Override
    public Map<String, Object> getPrescribeInfo(Long barcode) {
        Map<String, Object> message = new HashMap<>();
        List<UnsuitableSampleDTO> result = mapper.findUnsuitableSample(barcode);

        if(result.isEmpty()) {
            Map<String, Object> prescribe = mapper.findPrescribeByBarcode(barcode);
            if(prescribe == null) {
                message.put("message", "존재하지 않는 바코드입니다.");
                return message;
            }
            return prescribe;
        } else {
            message.put("message", "이미 부적합 검체로 등록되어 있는 바코드입니다.");
            return message;
        }
    }

    @Override
    public List<Map<String, Object>> getUsersInfo(String userName) {
        List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = new HashMap<String,Object>();

        List<Map<String, Object>> users = mapper.findUsersByUsername(userName);
        if(users.isEmpty()) {
            map.put("message", "존재하지 않은 사람입니다.");
            listMap.add(map);
            return listMap;
        }
        System.out.println(users);
        return users;
    }

    @Override
    public List<UnsuitableReasonDTO> getUnsuitableReason() {
        return mapper.findAllUnsuitableReason();
    }
}
