package com.douzone.dataservice.mapper.patientmapper;

import com.douzone.dataservice.domain.PatientDTO;
import com.douzone.dataservice.domain.PatientInfoDto;
import com.douzone.dataservice.domain.patientdomain.PatientDomainDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PatientMapper {
    List<PatientDomainDTO> patientData(String barcode);

    List<PatientDTO> patientAll();
    List<PatientInfoDto> findPatientInfoByPatientNo(Long patientNo, String visitStatus);
}
