package com.douzone.dataservice.service.collectservice;

import com.douzone.dataservice.domain.collectdomain.CollectDomainDTO;
import com.douzone.dataservice.mapper.collectmapper.CollectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CollectServiceImpl implements CollectService{

    private final CollectMapper collectMapper;
    @Override
    public List<CollectDomainDTO> colletData(String barcode) {
        return collectMapper.colletData(barcode);
    }
}
