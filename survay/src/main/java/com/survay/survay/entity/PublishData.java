package com.survay.survay.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class PublishData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String data;
	@OneToOne
	@JsonIgnore
	private Publish publish;

	public PublishData() {
		super();
	}

	public PublishData(Long publishId, String data, Publish publish) {
		super();
		this.id = publishId;
		this.data = data;
		this.publish = publish;
	}

	public Long getPublishId() {
		return id;
	}

	public void setPublishId(Long publishId) {
		this.id = publishId;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Publish getPublish() {
		return publish;
	}

	public void setPublish(Publish publish) {
		this.publish = publish;
	}

	@Override
	public String toString() {
		return "PublishData [publishId=" + id + ", data=" + data + ", publish=" + publish + "]";
	}

}
