package com.survay.survay.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Survay {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long survayId;

	@OneToOne(mappedBy = "survay", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JsonIgnoreProperties(value = { "survay" }, allowSetters = true)
	private SurvayData survayData;

	@OneToOne(mappedBy = "survay", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JsonIgnoreProperties(value = { "survay" }, allowSetters = true)
	private Publish publish;

	@OneToMany(mappedBy = "survay", cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JsonIgnoreProperties(value = { "survay" }, allowSetters = true)
	private List<Response> response;

	@OneToMany(mappedBy = "survay", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JsonIgnoreProperties(value = { "survay" }, allowSetters = true)
	private List<SurvayURL> survayUrl;

	@OneToOne(mappedBy = "survay", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JsonIgnoreProperties(value = { "survay" }, allowSetters = true)
	private SurvayPassword survayPassword;

	public Survay() {
		super();
	}

	public Survay(Long survayId, SurvayData survayData, Publish publish, List<Response> response,
			List<SurvayURL> survayUrl, SurvayPassword survayPassword) {
		super();
		this.survayId = survayId;
		this.survayData = survayData;
		this.publish = publish;
		this.response = response;
		this.survayUrl = survayUrl;
		this.survayPassword = survayPassword;
	}

	public Long getSurvayId() {
		return survayId;
	}

	public void setSurvayId(Long survayId) {
		this.survayId = survayId;
	}

	public SurvayData getSurvayData() {
		return survayData;
	}

	public void setSurvayData(SurvayData survayData) {
		this.survayData = survayData;
	}

	public Publish getPublish() {
		return publish;
	}

	public void setPublish(Publish publish) {
		this.publish = publish;
	}

	public List<Response> getResponse() {
		return response;
	}

	public void setResponse(List<Response> response) {
		this.response = response;
	}

	public List<SurvayURL> getSurvayUrl() {
		return survayUrl;
	}

	public void setSurvayUrl(List<SurvayURL> survayUrl) {
		this.survayUrl = survayUrl;
	}

	public SurvayPassword getSurvayPassword() {
		return survayPassword;
	}

	public void setSurvayPassword(SurvayPassword survayPassword) {
		this.survayPassword = survayPassword;
	}

	@Override
	public String toString() {
		return "Survay [survayId=" + survayId + ", survayData=" + survayData + ", publish=" + publish + ", response="
				+ response + ", survayUrl=" + survayUrl + ", survayPassword=" + survayPassword + "]";
	}

}
