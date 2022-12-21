package com.survay.survay.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class SurvayData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long survayDataId;
	private String data;
	@OneToOne
	private Survay survay;

	public SurvayData() {
		super();
	}

	public SurvayData(Long survayDataId, String data, Survay survay) {
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

	public Survay getSurvay() {
		return survay;
	}

	public void setSurvay(Survay survay) {
		this.survay = survay;
	}

	@Override
	public String toString() {
		return "SurvayData [survayDataId=" + survayDataId + ", data=" + data + ", survay=" + survay + "]";
	}

}
