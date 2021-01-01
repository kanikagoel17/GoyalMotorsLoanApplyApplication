package com.loan.application.api.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {
	
	@Id
	@Column(name="ADDRESS_ID")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long addressId;
	@Column(name="ADDRESS_LINE1")
	private String addressLine1;
	@Column(name="CITY")
	private String city;
	@Column(name="STATE")
	private String State;
	@Column(name="PINCODE")
	private String pinCode;	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String addressLine1, String city, String state, String pinCode) {
		super();
		this.addressLine1 = addressLine1;
		this.city = city;
		State = state;
		this.pinCode = pinCode;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	
	
	

}
