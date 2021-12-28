package com.example.productmanagementdetail;

public class ProductView {
	private String productid;
	private String productname;
	private int unitcost;
	public ProductView() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductView(String productid, String productname, int unitcost) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.unitcost = unitcost;
	}
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getUnitcost() {
		return unitcost;
	}
	public void setUnitcost(int unitcost) {
		this.unitcost = unitcost;
	}

}
