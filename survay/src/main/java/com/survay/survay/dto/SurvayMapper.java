package com.survay.survay.dto;

import java.util.List;

import org.mapstruct.Mapper;

import com.survay.survay.entity.Survay;

@Mapper(componentModel = "spring")
public interface SurvayMapper {

	SurvayDTO toSurvayDTO(Survay survay);

	List<SurvayDTO> toSurvayDTOs(List<Survay> survay);

	Survay toSurvay(SurvayDTO survayDTO);

}
