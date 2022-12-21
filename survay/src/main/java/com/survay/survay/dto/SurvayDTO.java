package com.survay.survay.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
public class SurvayDTO {

	private Long survayId;

	private SurvayDataDTO survayData;

	private PublishDTO publish;
	@JsonIgnore
	private List<ResponseDTO> response;

	private List<SurvayURLDTO> survayUrl;

	private SurvayPasswordDTO survayPassword;

	public SurvayDTO() {
		super();
	}

	public SurvayDTO(Long survayId, SurvayDataDTO survayData, PublishDTO publishId, List<ResponseDTO> response,
			List<SurvayURLDTO> survayUrl, SurvayPasswordDTO survayPassword) {
		super();
		this.survayId = survayId;
		this.survayData = survayData;
		this.publish = publishId;
		this.response = response;
		this.survayUrl = survayUrl;
		this.survayPassword = survayPassword;
	}

	public Long getSurvayId() {
		return survayId;
	}

	public void setSurvayId(Long survayId) {
		this.survayId = survayId;
	}

	public SurvayDataDTO getSurvayData() {
		return survayData;
	}

	public void setSurvayData(SurvayDataDTO survayData) {
		this.survayData = survayData;
	}

	public PublishDTO getPublish() {
		return publish;
	}

	public void setPublish(PublishDTO publishId) {
		this.publish = publishId;
	}

	public List<ResponseDTO> getResponse() {
		return response;
	}

	public void setResponse(List<ResponseDTO> response) {
		this.response = response;
	}

	public List<SurvayURLDTO> getSurvayUrl() {
		return survayUrl;
	}

	public void setSurvayUrl(List<SurvayURLDTO> survayUrl) {
		this.survayUrl = survayUrl;
	}

	public SurvayPasswordDTO getSurvayPassword() {
		return survayPassword;
	}

	public void setSurvayPassword(SurvayPasswordDTO survayPassword) {
		this.survayPassword = survayPassword;
	}

	@Override
	public String toString() {
		return "Survay [survayId=" + survayId + ", survayData=" + survayData + ", publish=" + publish + ", response="
				+ response + ", survayUrl=" + survayUrl + ", survayPassword=" + survayPassword + "]";
	}

}
