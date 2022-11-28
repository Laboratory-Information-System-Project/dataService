package com.douzone.dataservice.mapper;

import com.douzone.dataservice.domain.ConclusionDTO;
import com.douzone.dataservice.domain.InspectionTypeDTO;
import com.douzone.dataservice.domain.RegisterDTO;
import com.douzone.dataservice.domain.SearchDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InspectionMapper {

    List<RegisterDTO> getTodayRegisterMapper();

    List<RegisterDTO> getSearchRegisterMapper(SearchDTO search);

    List<InspectionTypeDTO> getSearchInspectionTypeMapper(SearchDTO search);

    List<ConclusionDTO> getSelectConclusionMapper(SearchDTO search);

}
