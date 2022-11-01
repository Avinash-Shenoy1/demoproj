package com.gl.Product.bean;

public class ProductsDTO{
	
	private String productId;
	private String productName;
	private Double wholesaleRate;
	private Double retailRate;
	private Double stock;
	public ProductsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductsDTO(String ProductId,String ProductName, Double wholesaleRate, Double retailRate, Double stock) {
		super();
		this.productId = ProductId;
		this.productName = ProductName;
		this.wholesaleRate = wholesaleRate;
		this.retailRate = retailRate;
		this.stock = stock;
	}
	public ProductsDTO(Products products) {
		super();
		this.productId = products.getProductId();
		this.productName = products.getProductName();
		this.wholesaleRate = products.getWholesaleRate();
		this.retailRate = products.getRetailRate();
		this.stock = products.getStock();
	}
	
	public String getProductId() {
		return productId;
	}
	
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductName() {
		return productName;

	}
	public double getWholesaleRate() {
		return wholesaleRate;
	}
	public void setWholesaleRate(double wholesaleRate) {
		this.wholesaleRate = wholesaleRate;
	}
	public double getRetailRate() {
		return retailRate;
	}
	public void setRetailRate(double retailRate) {
		this.retailRate = retailRate;
	}
	public double getStock() {
		return stock;
	}
	public void setStock(double stock) {
		this.stock = stock;
	}
	
	

	

}
