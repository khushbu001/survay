package com.survay.survay.dto;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Component
public class ResponseDTO {

	private Long responseId;
	@JsonIgnore
	private ResponseDataDTO responseData;
	@JsonIgnore
	private SurvayDTO survay;

	public ResponseDTO() {
		super();
	}

	public ResponseDTO(Long responseId, ResponseDataDTO responseData, SurvayDTO survay) {
		super();
		this.responseId = responseId;
		this.responseData = responseData;
		this.survay = survay;
	}

	public Long getResponseId() {
		return responseId;
	}

	public void setResponseId(Long responseId) {
		this.responseId = responseId;
	}

	public ResponseDataDTO getResponseData() {
		return responseData;
	}

	public void setResponseData(ResponseDataDTO responseData) {
		this.responseData = responseData;
	}

	public SurvayDTO getSurvay() {
		return survay;
	}

	public void setSurvay(SurvayDTO survay) {
		this.survay = survay;
	}

	@Override
	public String toString() {
		return "Response [responseId=" + responseId + ", responseData=" + responseData + ", survay=" + survay + "]";
	}

}
