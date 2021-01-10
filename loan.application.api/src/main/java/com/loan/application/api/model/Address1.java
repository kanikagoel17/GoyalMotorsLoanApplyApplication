package com.loan.application.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address1 {
	
	@Id
	@Column(name="ADDRESS_ID")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long addressId;
	@Column(name="ADDRESS_LINE1")
	private String addressLine1;
	@Column(name="CITY")
	private String city;
	@Column(name="STATE")
	private String state;
	@Column(name="PINCODE")
	private String pinCode;	
	
	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "ADDRESS_ID", referencedColumnName = "LOAN_ID") private
	 * LoanApplication loanApplication;
	 */
	public Address1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/*
	 * public Address(String addressLine1, String city, String state, String
	 * pinCode, LoanApplication loanApplication) { super(); this.addressLine1 =
	 * addressLine1; this.city = city; this.state = state; this.pinCode = pinCode;
	 * this.loanApplication = loanApplication; }
	 * 
	 */



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
		return state;
	}
	public void setState(String state) {
		this.state = state;
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


	/*
	 * public LoanApplication getLoanApplication() { return loanApplication; }
	 * 
	 * 
	 * public Address setLoanApplication(LoanApplication loanApplication) {
	 * this.loanApplication = loanApplication; return this; }
	 */

	
	
	

}
