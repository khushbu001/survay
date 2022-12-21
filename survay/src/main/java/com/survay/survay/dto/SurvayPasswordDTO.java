package com.survay.survay.dto;

public class SurvayPasswordDTO {

	private Long passwordId;

	private String password;

	private SurvayDTO survay;

	public SurvayPasswordDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SurvayPasswordDTO(Long passwordId, String password, SurvayDTO survay) {
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

	public SurvayDTO getSurvay() {
		return survay;
	}

	public void setSurvay(SurvayDTO survay) {
		this.survay = survay;
	}

	@Override
	public String toString() {
		return "SurvayPassword [passwordId=" + passwordId + ", password=" + password + ", survay=" + survay + "]";
	}

}
