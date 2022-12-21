package com.survay.survay.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class ResponseData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long responseDataID;
	private String data;
	@OneToOne
	private Response response;

	public ResponseData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseData(Long responseDataID, String data, Response response) {
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

	public Response getResponse() {
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "ResponseData [responseDataID=" + responseDataID + ", data=" + data + ", response=" + response + "]";
	}

}
