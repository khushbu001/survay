package com.survay.survay.dto;

import java.util.List;

import org.mapstruct.Mapper;

import com.survay.survay.entity.SurvayData;

@Mapper(componentModel = "spring")
public interface SurvayDataMapper {

	SurvayDataDTO toSurvayDataDTO(SurvayData survayData);

	List<SurvayDataDTO> toSurvayDataDTOs(List<SurvayData> survayData);

	SurvayData toSurvayData(SurvayDataDTO survayDataDTO);

}
