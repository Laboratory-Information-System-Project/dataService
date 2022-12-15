package com.douzone.dataservice.mapper.conclusion;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SmsMapper {
    void smsDelete(Object smsNo);
}

