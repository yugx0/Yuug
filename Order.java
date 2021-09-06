package com;

public class Order {
	private Integer id;
	private String productordername;
	private String orderquantity;
	private String orderstatus;
	//constructor
	public Order() {
		super();
	}
	//paramaterize constructor
	public Order(Integer id, String productordername,String orderquantity,String orderstatus) {
		super();
		this.id = id;
		this.productordername =productordername;
		this.orderquantity=orderquantity;
		this.orderstatus = orderstatus;
	}


	//id
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
//name
	public String getProductOrderName() {
		return productordername;
	}
	public void setProductOrderName(String productordername) {
		this.productordername = productordername;
	}
	//email
	public String getOrderQuantity() {
		return orderquantity;
	}
	public void setOrderQuantity(String orderquantity) {
		this.orderquantity = orderquantity;
	}

	//addres
	public String getOrderStatus() {
		return orderstatus;
	}
	public void setOrderStatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}

}