package com.springboot.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@Column(name = "productid")
	private int productId;

	@Column(name = "items")
	private String items;

	@Column(name = "amount")
	private double totalBill;

	public Product() {
	}

	public Product(int productId, String items, double totalBill) {
		super();
		this.productId = productId;
		this.items = items;
		this.totalBill = totalBill;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public double getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}

}
