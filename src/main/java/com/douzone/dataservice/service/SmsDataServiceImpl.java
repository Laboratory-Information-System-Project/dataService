package com.douzone.dataservice.service;


import com.douzone.dataservice.domain.SmsDataDTO;
import com.douzone.dataservice.mapper.ResultMapper;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SmsDataServiceImpl implements SmsDataService {
    private final ResultMapper mapper;

    @Override
    public List<SmsDataDTO> SmsAllList(){
        return mapper.smsSelectAll();
    }

    @Override
    public void insert(SmsDataDTO smsData) {
        mapper.insert(smsData);
    }

    @Override
    public void update(SmsDataDTO smsData) {
        mapper.update(smsData);
    }

    @Override
    public void delete(int smsNo) {
        mapper.delete(smsNo);
    }
}
