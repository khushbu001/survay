package com.survay.survay.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class SurvayPassword {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long passwordId;

	private String password;
	@OneToOne
	private Survay survay;
	public SurvayPassword() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SurvayPassword(Long passwordId, String password, Survay survay) {
		super();
		this.passwordId = passwordId;
		this.password = password;
		this.survay = survay;
	}
	public Long getPasswordId() {
		return passwordId;
	}
	public void setPasswordId(Long passwordId) {
		this.passwordId = passwordId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Survay getSurvay() {
		return survay;
	}
	public void setSurvay(Survay survay) {
		this.survay = survay;
	}
	@Override
	public String toString() {
		return "SurvayPassword [passwordId=" + passwordId + ", password=" + password + ", survay=" + survay + "]";
	}
	
	

}
