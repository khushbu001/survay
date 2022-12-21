package com.survay.survay.dto;

import java.util.List;

import org.mapstruct.Mapper;

import com.survay.survay.entity.PublishData;

@Mapper(componentModel = "spring")
public interface PublishDataMapper {

	PublishDataDTO toPublishDataDTO(PublishData publishData);

	List<PublishDataDTO> toPublishDataDTOs(List<PublishData> publishData);

	PublishData toPublishData(PublishDataDTO publishDataDTO);

}
