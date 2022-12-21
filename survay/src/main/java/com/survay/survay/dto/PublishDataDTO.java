package com.survay.survay.dto;

import org.springframework.stereotype.Component;

@Component
public class PublishDataDTO {

	private Long id;

	private String data;
	
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
