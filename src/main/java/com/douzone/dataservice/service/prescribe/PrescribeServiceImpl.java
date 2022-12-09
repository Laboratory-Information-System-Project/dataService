package com.douzone.dataservice.service.prescribe;

import com.douzone.dataservice.mapper.PrescribeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class PrescribeServiceImpl implements PrescribeService{

    private final PrescribeMapper prescribeMapper;

    @Override
    public List<Map<String, Object>> getPrescribeInfoByVisitNo(Long visitNo) {

        List<Map<String, Object>> prescribeInfo = prescribeMapper.findPrescribeByVisitNo(visitNo);
        prescribeInfo.forEach((data)-> {
            data.put("Bool", false);
            String time = data.get("prescribe_dt").toString();
            data.put("prescribe_dt",time.replace('T',' '));

        });
        return prescribeInfo;
    }
}
