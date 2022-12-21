package com.survay.survay.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Response {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long responseId;
	@OneToOne(mappedBy = "response", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JsonIgnoreProperties("responseData")
	private ResponseData responseData;
	@ManyToOne
	@JsonIgnoreProperties(value = { "response" }, allowSetters = true)
	private Survay survay;

	public Response() {
		super();
	}

	public Response(Long responseId, ResponseData responseData, Survay survay) {
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

	public ResponseData getResponseData() {
		return responseData;
	}

	public void setResponseData(ResponseData responseData) {
		this.responseData = responseData;
	}

	public Survay getSurvay() {
		return survay;
	}

	public void setSurvay(Survay survay) {
		this.survay = survay;
	}

	@Override
	public String toString() {
		return "Response [responseId=" + responseId + ", responseData=" + responseData + ", survay=" + survay + "]";
	}

}
