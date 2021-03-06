package com.csxh.eshop.model;
// Generated 2015-11-19 16:57:11 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * Review generated by hbm2java
 */
public class Review implements java.io.Serializable {

	private Integer id;
	private String productId;
	private String name;
	private String email;
	private String content;
	private Date time;

	public Review() {
	}

	public Review(Date time) {
		this.time = time;
	}

	public Review(String productId, String name, String email, String content, Date time) {
		this.productId = productId;
		this.name = name;
		this.email = email;
		this.content = content;
		this.time = time;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}
