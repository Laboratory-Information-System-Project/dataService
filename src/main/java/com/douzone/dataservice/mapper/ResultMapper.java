package com.douzone.dataservice.mapper;

import com.douzone.dataservice.domain.ResultDTO;
import com.douzone.dataservice.domain.ResultSearchDTO;
import com.douzone.dataservice.domain.SmsDataDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ResultMapper {
    List<ResultDTO> selectAll();
    List<ResultDTO> getSearchResultMapper(ResultSearchDTO resultSearch);
    List<ResultDTO> searchNotDate(int text);

    List<SmsDataDTO> smsSelectAll();

    void insert(SmsDataDTO smsData);
    void update(SmsDataDTO smsData);
    void delete(@Param("smsNo") int smsNo);
}
