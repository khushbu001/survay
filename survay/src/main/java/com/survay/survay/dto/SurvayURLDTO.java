package com.survay.survay.dto;

import org.springframework.stereotype.Component;

@Component
public class SurvayURLDTO {
	private Long survayUrlId;

	private String data;

	private SurvayDTO survay;

	public SurvayURLDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SurvayURLDTO(Long survayUrlId, String data, SurvayDTO survay) {
		super();
		this.survayUrlId = survayUrlId;
		this.data = data;
		this.survay = survay;
	}

	public Long getSurvayUrlId() {
		return survayUrlId;
	}

	public void setSurvayUrlId(Long survayUrlId) {
		this.survayUrlId = survayUrlId;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public SurvayDTO getSurvay() {
		return survay;
	}

	public void setSurvay(SurvayDTO survay) {
		this.survay = survay;
	}

	@Override
	public String toString() {
		return "SurvayURL [survayUrlId=" + survayUrlId + ", data=" + data + ", survay=" + survay + "]";
	}

}
