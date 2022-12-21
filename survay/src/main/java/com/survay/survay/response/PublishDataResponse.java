package com.survay.survay.response;

import com.survay.survay.entity.Publish;

public class PublishDataResponse {
	
	private Long id;

	private String data;
	private Publish publish;

	public PublishDataResponse() {
		super();
	}

	public PublishDataResponse(Long publishId, String data, Publish publish) {
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
