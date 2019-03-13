package com.cts.grizzly.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {
	@Id
	private String productId;
	private String productName;
	private int productPrice;
	private int quantity;
	private String productCategory;
	private String productBrand;
	
	
	
	public String getProductCategory() {
		return productCategory;
	}


	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}


	public String getProductBrand() {
		return productBrand;
	}


	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}




	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getPrice() {
		return productPrice;
	}


	public void setPrice(int price) {
		this.productPrice = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", quantity=" + quantity + ", productCategory=" + productCategory + ", productBrand=" + productBrand
				+ "]";
	}





	
	
	
}
