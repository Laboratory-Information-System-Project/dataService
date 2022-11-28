package com.douzone.dataservice.mapper.patientmapper;

import com.douzone.dataservice.domain.patientdomain.PatientDomainDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PatientMapper {
    List<PatientDomainDTO> patientData(String barcode);
}
