package com.survay.survay.dto;

import java.util.List;

import org.mapstruct.Mapper;

import com.survay.survay.entity.SurvayURL;

@Mapper(componentModel = "spring")
public interface SurvayURLMapper {

	SurvayURLDTO toSurvayURLDTO(SurvayURL survayURL);

	List<SurvayURLDTO> toSurvayURLDTOs(List<SurvayURL> survay);

	SurvayURL toSurvayURL(SurvayURLDTO survayDTO);

}
