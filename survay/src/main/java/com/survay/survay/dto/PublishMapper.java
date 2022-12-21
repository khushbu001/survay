package com.survay.survay.dto;

import java.util.List;

import org.mapstruct.Mapper;

import com.survay.survay.entity.Publish;

@Mapper(componentModel = "spring")
public interface PublishMapper {

	PublishDTO toPublishDTO(Publish publish);

	List<PublishDTO> toPublishDTOs(List<Publish> publish);

	Publish toPublish(PublishDTO publishDTO);

}
