package com.survay.survay.dto;

import com.survay.survay.entity.Publish;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

public class PublishDataDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String data;
	@OneToOne
	private PublishDTO publish;

	public PublishDataDTO() {
		super();
	}

	public PublishDataDTO(Long publishId, String data, PublishDTO publish) {
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

	public PublishDTO getPublish() {
		return publish;
	}

	public void setPublish(PublishDTO publish) {
		this.publish = publish;
	}

	@Override
	public String toString() {
		return "PublishData [publishId=" + id + ", data=" + data + ", publish=" + publish + "]";
	}

}
