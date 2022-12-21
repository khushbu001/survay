package com.survay.survay.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class SurvayDataDTO {

	private Long survayDataId;
	private String data;
	private SurvayDTO survay;

	public SurvayDataDTO() {
		super();
	}

	public SurvayDataDTO(Long survayDataId, String data, SurvayDTO survay) {
		super();
		this.survayDataId = survayDataId;
		this.data = data;
		this.survay = survay;
	}

	public Long getSurvayDataId() {
		return survayDataId;
	}

	public void setSurvayDataId(Long survayDataId) {
		this.survayDataId = survayDataId;
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
		return "SurvayData [survayDataId=" + survayDataId + ", data=" + data + ", survay=" + survay + "]";
	}

}
