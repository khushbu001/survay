package com.survay.survay.dto;

import java.util.List;

import org.mapstruct.Mapper;

import com.survay.survay.entity.SurvayPassword;

@Mapper(componentModel = "spring")
public interface SurvayPasswordMapper {

	SurvayPasswordDTO toSurvayPasswordDTO(SurvayPassword survay);

	List<SurvayPasswordDTO> toSurvayPasswordDTOs(List<SurvayPassword> survay);

	SurvayPassword toSurvayPassword(SurvayPasswordDTO survayDTO);

}
