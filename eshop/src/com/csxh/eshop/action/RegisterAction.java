package com.csxh.eshop.action;

import java.io.Serializable;

import org.apache.struts2.ServletActionContext;

import com.csxh.eshop.model.Customer;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class RegisterAction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7239955804866817527L;

	Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String handle() {
		
		return Action.SUCCESS;
	}
}
