package com.survay.survay.dto;

import java.util.List;

import org.mapstruct.Mapper;

import com.survay.survay.entity.ResponseData;

@Mapper(componentModel = "spring")
public interface ResponseDataMapper{

	ResponseDataDTO toResponseDataDTO(ResponseData response);

	List<ResponseDataDTO> toResponseDataDTOs(List<ResponseData> response);

	ResponseData toResponseData(ResponseDataDTO responseDTO);

}
