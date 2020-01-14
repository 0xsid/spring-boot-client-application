package com.deloitte.springbootclient.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


//@JsonIgnoreProperties({"hibernatelazyInitializer","handler"})
public class Product {

    int productId;
	String productName;
	float price;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	LocalDate releaseDate;
	
	public Product() {
		
	}
	
	
	
	public Product( String productName, float price, LocalDate releaseDate) {
		
		
		this.productName = productName;
		this.price = price;
		this.releaseDate = releaseDate;
	}



	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}



	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", releaseDate=" + releaseDate + "]";
	}
	
	
}
