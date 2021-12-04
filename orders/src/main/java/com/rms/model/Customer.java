package com.rms.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.criteria.Order;

@Entity
public class Customer {
	@Id
	private String userName;
	private String password;
	private String customerName;
	private int mobileNo;
	private String address;
	
	@ManyToMany(mappedBy = "customer")
	private List<Orders> orders;

	
	public Customer() {
		super();
	}
	public Customer(String userName, String password, String customerName, int mobileNo, String address) {
		super();
		this.userName = userName;
		this.password = password;
		this.customerName = customerName;
		this.mobileNo = mobileNo;
		this.address = address;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}