package com.survay.survay.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class SurvayURL {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long survayUrlId;

	private String data;
	@ManyToOne
	@JsonIgnoreProperties(value = { "survayURL" }, allowSetters = true)
	private Survay survay;

	public SurvayURL() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SurvayURL(Long survayUrlId, String data, Survay survay) {
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

	public Survay getSurvay() {
		return survay;
	}

	public void setSurvay(Survay survay) {
		this.survay = survay;
	}

	/*
	 * @Override public String toString() { return "SurvayURL [survayUrlId=" +
	 * survayUrlId + ", data=" + data + ", survay=" + survay + "]"; }
	 */

}
