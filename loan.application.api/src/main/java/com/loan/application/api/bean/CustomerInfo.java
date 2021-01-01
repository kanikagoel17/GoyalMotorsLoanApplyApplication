package com.loan.application.api.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer_Info")
public class CustomerInfo {
	@Id
	@Column(name="CUSTOMER_ID")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long customerId;
    
	@Column(name="FIRST_NAME", length=32, nullable=false)
	private String firstName;
	@Column(name="LAST_NAME", length=32, nullable=false)
	private String lastName;
	@Column(name="PHONE_NUM", length=10, nullable=false)
	private int phoneNum;
	@Column(name="CONTACT_EMAIL", length=50)
	private String email;	
	
	public CustomerInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerInfo(String firstName, String lastName, int phoneNum, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	

}
