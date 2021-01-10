package com.loan.application.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "LOAN_APPLICATION", schema = "LOAN_APPLICATION_DB")
public class LoanApplication
{
    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer loan_id;
    @Column(name="ADHARCARD_NO")
    private String adharCardNo;
    @Column(name="PANCARD_NUM")
    private String panCardNo;

	/*
	 * private Integer address_id; private Integer customer_id; private Integer
	 * gauranter_id;
	 * 
	 * @JoinColumn(name = "LOAN_ID", referencedColumnName = "CUSTOMER_ID")
	 * CustomerInf customerInf;
	 * 
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "LOAN_ID", referencedColumnName = "ADDRESS_ID") Address
	 * address;
	 * 
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "LOAN_ID", referencedColumnName = "GAURANTER_ID")
	 * GuaranterInfo guaranterInfo;
	 */
    @Column(name="CONTACT_EMAIL")
    private String email;
    @Column(name="FIRST_NAME")
    private String firstName;
    @Column(name="LAST_NAME")
    private String lastName;
    @Column(name="PHONE_NUM")
    private String phoneNum;
   
    @Column(name="STATE")
    private String state;
    
    @Column(name="ADDRESS_LINE1")
    private String addressLine1;
    @Column(name="CITY")
    private String city;
    @Column(name="PINCODE")
    private String pincode;
    
 
    @Column(name="GAURANTER_FIRST_NAME")
    private String guaranterFirstName;
    @Column(name="GUARANTER_LAST_NAME")
    private String guaranterLastName;
    @Column(name="GUARANTER_PHONE_NUM")
    private Integer guaranterPhoneNum;
	public LoanApplication() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoanApplication(Integer loan_id, String adharCardNo, String panCardNo, String email, String firstName,
			String lastName, String phoneNum, String state, String addressLine1, String city, String pincode,
			String guaranterFirstName, String guaranterLastName, Integer guaranterPhoneNum) {
		super();
		this.loan_id = loan_id;
		this.adharCardNo = adharCardNo;
		this.panCardNo = panCardNo;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.state = state;
		this.addressLine1 = addressLine1;
		this.city = city;
		this.pincode = pincode;
		this.guaranterFirstName = guaranterFirstName;
		this.guaranterLastName = guaranterLastName;
		this.guaranterPhoneNum = guaranterPhoneNum;
	}
	public Integer getLoan_id() {
		return loan_id;
	}

	/*
	 * public void setLoan_id(Integer loan_id) { this.loan_id = loan_id; }
	 */
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
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
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
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
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
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
	public Integer getGuaranterPhoneNum() {
		return guaranterPhoneNum;
	}
	public void setGuaranterPhoneNum(Integer guaranterPhoneNum) {
		this.guaranterPhoneNum = guaranterPhoneNum;
	}
    
    
	

}