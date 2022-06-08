package com.zensar.beans;

public class Product {

	private int productId;
	private String productName;
	private int productCost;

	public Product() {
		super();
		System.out.println("Inside Product Bean !!!");
	}

	

	public Product(int productId, String productName, int productCost) {
		super();
		System.out.println("Inside Product(int productId, String productName, int productCost)");
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
	}
	
	public Product(String productId, String productName, String productCost) {
		System.out.println("Inside Product(String productId, String productName, String productCost)");
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		System.out.println("Inside public void setProductId(int productId)");
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		System.out.println("Inside setProductName(String productName)");
		this.productName = productName;
	}

	public int getProductCost() {
		return productCost;
	}

	public void setProductCost(int productCost) {
		System.out.println("Inside setProductCost(int productCost)");
		this.productCost = productCost;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost
				+ "]";
	}

}
