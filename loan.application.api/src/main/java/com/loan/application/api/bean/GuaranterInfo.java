package com.loan.application.api.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GAURANTER_INFO")
public class GuaranterInfo {
	@Id
	@Column(name="GAURANTER_ID")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long guaranterId;
    
	@Column(name="GAURANTER_FIRST_NAME", length=32, nullable=false)
	private String guaranterFirstName;
	@Column(name="GAURANTER_LAST_NAME", length=32, nullable=false)
	private String guaranterLastName;
	@Column(name="GAURANTER_PHONE_NUM", length=10, nullable=false)
	private int guaranterPhoneNum;
	public Long getGuaranterId() {
		return guaranterId;
	}
	public void setGuaranterId(Long guaranterId) {
		this.guaranterId = guaranterId;
	}
	public String getGuaranterFirstName() {
		return guaranterFirstName;
	}
	public void setGuaranterFirstName(String guaranterFirstName) {
		this.guaranterFirstName = guaranterFirstName;
	}
	public String getGuaranterLastName() {
		return guaranterLastName;
	}
	public void setGuaranterLastName(String guaranterLastName) {
		this.guaranterLastName = guaranterLastName;
	}
	public int getGuaranterPhoneNum() {
		return guaranterPhoneNum;
	}
	public void setGuaranterPhoneNum(int guaranterPhoneNum) {
		this.guaranterPhoneNum = guaranterPhoneNum;
	}
		
	

}
