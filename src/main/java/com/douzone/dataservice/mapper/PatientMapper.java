package com.douzone.dataservice.mapper;

import com.douzone.dataservice.domain.PatientDTO;
import com.douzone.dataservice.domain.PatientInfoDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PatientMapper {

    List<PatientDTO> patientAll();
    List<PatientInfoDto> findPatientInfoByPatientNo(Long patientNo);
}
