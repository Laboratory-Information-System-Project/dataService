package com.douzone.dataservice.mapper;

import com.douzone.dataservice.domain.ConclusionDTO;
import com.douzone.dataservice.domain.InspectionTypeDTO;
import com.douzone.dataservice.domain.RegisterDTO;
import com.douzone.dataservice.domain.SearchDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface InspectionMapper {

    List<RegisterDTO> getUnregisteredMapper();

    List<RegisterDTO> getSearchRegisterMapper(SearchDTO search);

    List<InspectionTypeDTO> getSearchInspectionTypeMapper(String orderCode);

    List<ConclusionDTO> getSelectConclusionMapper(SearchDTO search);

   String getPrescribeCode(Map<String, Object> barcode);
}
