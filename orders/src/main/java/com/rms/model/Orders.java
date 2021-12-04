package com.rms.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
public class Orders {
	@Id
	@GeneratedValue
	@Column(name="Order_Id")
	private int ordersId;
	@Column(name="Date & Time")
	private LocalDateTime orderDateTime;
	private String billNo;
	private int quantity;
	private String orderedTime;
	
	@ManyToMany
	@JoinTable(name="customer_order_details", joinColumns=@JoinColumn(name = "Order_Id"),inverseJoinColumns = @JoinColumn(name="menu_id"))
	private List<Menu> menu;
	
	@ManyToMany
	private List<Customer> customer;

	public Orders() {
		super();
	}

	public Orders(int ordersId, LocalDateTime orderDateTime, String billNo, int quantity, String orderedTime,
			Menu menu, Customer customer) {
		super();
		this.ordersId = ordersId;
		this.orderDateTime = orderDateTime;
		this.quantity = quantity;
	}

	public long getOrdersId() {
		return ordersId;
	}

	public void setOrdersId(int ordersId) {
		this.ordersId = ordersId;
	}

	public LocalDateTime getOrderDateTime() {
		return orderDateTime;
	}

	public void setOrderDateTime(LocalDateTime orderDateTime) {
		this.orderDateTime = orderDateTime;
	}

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getOrderedTime() {
		return orderedTime;
	}

	public void setOrderedTime(String orderedTime) {
		this.orderedTime = orderedTime;
	}


	public List<Menu> getMenu() {
		return menu;
	}

	public void setMenu(List<Menu> menu) {
		this.menu = menu;
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Orders [ordersId=" + ordersId + ", orderDateTime=" + orderDateTime + ", billNo=" + billNo
				+ ", quantity=" + quantity + ", orderedTime=" + orderedTime + ", menu=" + menu + ", customer="
				+ customer + "]";
	}
	
	


}