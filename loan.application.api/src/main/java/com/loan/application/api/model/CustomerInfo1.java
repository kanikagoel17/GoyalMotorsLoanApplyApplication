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
@Table(name="Customer_Info")
public class CustomerInfo1 {
	@Id
	@Column(name="CUSTOMER_ID")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long customerId;
    
	@Column(name="FIRST_NAME", length=32)
	private String firstName;
	@Column(name="LAST_NAME", length=32)
	private String lastName;
	@Column(name="PHONE_NUM", length=10)
	private int phoneNum;
	@Column(name="CONTACT_EMAIL", length=50)
	private String email;	

	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "LOAN_ID") private
	 * LoanApplication loanApplication;
	 */
	
	public CustomerInfo1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * public CustomerInfo(String firstName, String lastName, int phoneNum, String
	 * email, LoanApplication loanApplication) { super(); this.firstName =
	 * firstName; this.lastName = lastName; this.phoneNum = phoneNum; this.email =
	 * email; this.loanApplication = loanApplication; }
	 * 
	 */

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
	/*
	 * public LoanApplication getLoanApplication() { return loanApplication; }
	 * 
	 * public void setLoanApplication(LoanApplication loanApplication) {
	 * this.loanApplication = loanApplication; }
	 * 
	 */
	

}
