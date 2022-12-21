package com.survay.survay.dto;

import java.util.List;

import org.mapstruct.Mapper;

import com.survay.survay.entity.Response;

@Mapper(componentModel = "spring")
public interface ResponseMapper {

	ResponseDTO toResponseDTO(Response response);

	List<ResponseDTO> toResponseDTOs(List<Response> response);

	Response toResponse(ResponseDTO responseDTO);

}
