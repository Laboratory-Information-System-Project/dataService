package com.douzone.dataservice.service.collectservice;

import com.douzone.dataservice.domain.collectdomain.CollectDomainDTO;

import java.util.List;

public interface CollectService {
    List<CollectDomainDTO> colletData(String barcode);
}
