package com.douzone.dataservice.mapper.collectmapper;

import com.douzone.dataservice.domain.collectdomain.CollectDomainDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface CollectMapper {
    List<CollectDomainDTO> colletData(String barcode);
}
