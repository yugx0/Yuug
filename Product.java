package com;

public class Product {
	private Integer id;
	private String productname;
	private String productcompany;
	private String productmodel;
	//constructor
	public Product() {
		super();
	}
	//paramaterize constructor
	public Product(Integer id, String productname,String productcompany,String productmodel) {
		super();
		this.id = id;
		this.productname =productname;
		this.productcompany=productcompany;
		this.productmodel = productmodel;
	}


	//id
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
//name
	public String getProductName() {
		return productname;
	}
	public void setProductName(String productname) {
		this.productname = productname;
	}
	//email
	public String getProductCompany() {
		return productcompany;
	}
	public void setProductCompany(String productcompany) {
		this.productcompany = productcompany;
	}

	//addres
	public String getProductModel() {
		return productmodel;
	}
	public void setProductModel(String productmodel) {
		this.productmodel = productmodel;
	}

}