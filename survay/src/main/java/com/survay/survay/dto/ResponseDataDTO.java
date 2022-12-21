package com.survay.survay.dto;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Component
public class ResponseDataDTO {
	private Long responseDataID;
	private String data;
	@JsonIgnore
	private ResponseDTO response;

	public ResponseDataDTO() {
		super();
	}

	public ResponseDataDTO(Long responseDataID, String data, ResponseDTO response) {
		super();
		this.responseDataID = responseDataID;
		this.data = data;
		this.response = response;
	}

	public Long getResponseDataID() {
		return responseDataID;
	}

	public void setResponseDataID(Long responseDataID) {
		this.responseDataID = responseDataID;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public ResponseDTO getResponse() {
		return response;
	}

	public void setResponse(ResponseDTO response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "ResponseData [responseDataID=" + responseDataID + ", data=" + data + ", response=" + response + "]";
	}

}
