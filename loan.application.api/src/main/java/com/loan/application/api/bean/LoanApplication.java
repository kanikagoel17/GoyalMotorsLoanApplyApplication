package com.loan.application.api.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="LOAN_APPLICATION", schema="LOAN_APPLICATION_DB")
public class LoanApplication {
	
	@Id
	@Column(name="LOAN_ID")
    private Long loanId;	
	@OneToOne
    @JoinColumn(name="CUSTOMER_ID", nullable=false)
	CustomerInfo customerInfo;
	@OneToOne
    @JoinColumn(name="ADDRESS_ID", nullable=false)	
	Address address;
	@Column(name="ADHARCARD_NUMBER")
	String adharCardNo;
	@Column(name="PANCARD_NUMBER")
	String panCardNo;
	@OneToOne
    @JoinColumn(name="GAURANTER_ID", nullable=false)
	GuaranterInfo guaranterInfo;
	//File electricityBill;
	
	public CustomerInfo getCustomerInfo() {
		return customerInfo;
	}
	public Long getLoanId() {
		return loanId;
	}
	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}
	public void setCustomerInfo(CustomerInfo customerInfo) {
		this.customerInfo = customerInfo;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getAdharCardNo() {
		return adharCardNo;
	}
	public void setAdharCardNo(String adharCardNo) {
		this.adharCardNo = adharCardNo;
	}
	public String getPanCardNo() {
		return panCardNo;
	}
	public void setPanCardNo(String panCardNo) {
		this.panCardNo = panCardNo;
	}
	public GuaranterInfo getGuaranterInfo() {
		return guaranterInfo;
	}
	public void setGuaranterInfo(GuaranterInfo guaranterInfo) {
		this.guaranterInfo = guaranterInfo;
	}
	
	

}
