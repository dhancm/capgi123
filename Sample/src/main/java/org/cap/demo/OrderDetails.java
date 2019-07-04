package org.cap.demo;

public class OrderDetails {
	private int OrderNumber;
	private String productname;
	private double price;
	private int quantity;


	public int getOrderNumber() {
		return OrderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		OrderNumber = orderNumber;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "OrderDetails [OrderNumber=" + OrderNumber + ", productname=" + productname + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
	

}
