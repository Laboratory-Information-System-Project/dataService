package com.douzone.dataservice.mapper;


import com.douzone.dataservice.domain.PatientDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PatientMapper {

    List<PatientDTO> patientAll();
}
