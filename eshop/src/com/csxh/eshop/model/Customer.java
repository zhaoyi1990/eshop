package com.csxh.eshop.model;
// Generated 2015-11-19 16:57:11 by Hibernate Tools 4.3.1.Final

/**
 * Customer generated by hbm2java
 */
public class Customer implements java.io.Serializable {

	private Integer id;
	private String realname;
	private String email;
	private String password;
	private String passwordQuestion;
	private String passwordAnswer;
	private String city;
	private String address;
	private String zip;
	private String phone;

	public Customer() {
	}

	public Customer(String realname, String email, String password, String passwordQuestion, String passwordAnswer,
			String city, String address, String zip, String phone) {
		this.realname = realname;
		this.email = email;
		this.password = password;
		this.passwordQuestion = passwordQuestion;
		this.passwordAnswer = passwordAnswer;
		this.city = city;
		this.address = address;
		this.zip = zip;
		this.phone = phone;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordQuestion() {
		return this.passwordQuestion;
	}

	public void setPasswordQuestion(String passwordQuestion) {
		this.passwordQuestion = passwordQuestion;
	}

	public String getPasswordAnswer() {
		return this.passwordAnswer;
	}

	public void setPasswordAnswer(String passwordAnswer) {
		this.passwordAnswer = passwordAnswer;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
