package com.survay.survay.dto;

import jakarta.persistence.OneToOne;

public class ResponseDataDTO {
	private Long responseDataID;
	private String data;
	@OneToOne
	private ResponseDTO response;

	public ResponseDataDTO() {
		super();
		// TODO Auto-generated constructor stub
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
