package com.survay.survay.dto;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Component
public class ResponseDTO {

	private Long responseId;
	
	@JsonIgnore
	private SurvayDTO survay;

	public ResponseDTO() {
		super();
	}

	public ResponseDTO(Long responseId, SurvayDTO survay) {
		super();
		this.responseId = responseId;
		this.survay = survay;
	}

	public Long getResponseId() {
		return responseId;
	}

	public void setResponseId(Long responseId) {
		this.responseId = responseId;
	}

	

	public SurvayDTO getSurvay() {
		return survay;
	}

	public void setSurvay(SurvayDTO survay) {
		this.survay = survay;
	}

	@Override
	public String toString() {
		return "Response [responseId=" + responseId + ", survay=" + survay + "]";
	}

}
