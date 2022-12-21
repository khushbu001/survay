package com.survay.survay.dto;

import org.springframework.stereotype.Component;

import com.survay.survay.entity.Survay;
@Component
public class PublishDTO {

	private Long publishId;

	private PublishDataDTO publishDataDTO;

	private Survay survay;

	public PublishDTO() {
		super();
	}

	public PublishDTO(Long publishId, PublishDataDTO publishData, Survay survay) {
		super();
		this.publishId = publishId;
		this.publishDataDTO = publishData;
		this.survay = survay;
	}

	public Long getPublishId() {
		return publishId;
	}

	public void setPublishId(Long publishId) {
		this.publishId = publishId;
	}

	public PublishDataDTO getPublishData() {
		return publishDataDTO;
	}

	public void setPublishDataResponse(PublishDataDTO publishDataResponse) {
		this.publishDataDTO = publishDataResponse;
	}

	public Survay getSurvay() {
		return survay;
	}

	public void setSurvay(Survay survay) {
		this.survay = survay;
	}

	@Override
	public String toString() {
		return "Publish [publishId=" + publishId + ", publishDataDTO=" + publishDataDTO + ", survay=" + survay + "]";
	}

}
