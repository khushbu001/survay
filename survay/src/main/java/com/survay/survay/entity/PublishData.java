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

	public PublishData(Long id, String data, Publish publish) {
		super();
		this.id = id;
		this.data = data;
		this.publish = publish;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
		return "PublishData [publishId=" + id + ", data=" + data + "]";
	}

}
