package com.csxh.eshop.model;
// Generated 2015-11-19 16:57:11 by Hibernate Tools 4.3.1.Final

/**
 * Shipping generated by hbm2java
 */
public class Shipping implements java.io.Serializable {

	private Integer id;
	private String name;
	private Double fee;

	public Shipping() {
	}

	public Shipping(String name, Double fee) {
		this.name = name;
		this.fee = fee;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getFee() {
		return this.fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

}
