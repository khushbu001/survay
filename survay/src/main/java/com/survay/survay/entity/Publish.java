package com.survay.survay.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Publish {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long publishId;
	@OneToOne(mappedBy = "publish", cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JsonIgnoreProperties("publish")
	private PublishData publishData;
	@OneToOne
	@JsonIgnore
	private Survay survay;

	public Publish() {
		super();
	}

	public Publish(Long publishId, PublishData publishData, Survay survay) {
		super();
		this.publishId = publishId;
		this.publishData = publishData;
		this.survay = survay;
	}

	public Long getPublishId() {
		return publishId;
	}

	public void setPublishId(Long publishId) {
		this.publishId = publishId;
	}

	public PublishData getPublishData() {
		return publishData;
	}

	public void setPublishData(PublishData publishData) {
		this.publishData = publishData;
	}

	public Survay getSurvay() {
		return survay;
	}

	public void setSurvay(Survay survay) {
		this.survay = survay;
	}

	@Override
	public String toString() {
		return "Publish [publishId=" + publishId + ", publishData=" + publishData + ", survay=" + survay + "]";
	}

}
