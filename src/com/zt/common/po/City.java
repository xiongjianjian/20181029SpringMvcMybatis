package com.zt.common.po;

public class City {
	private int id;
	private String name;
	private Province province;
	private String status;
	
	public City() {
		
	}
	
	public City(String name, Province province, String status) {
		
		this.name = name;
		this.province = province;
		this.status = status;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Province getProvince() {
		return province;
	}
	public void setProvince(Province province) {
		this.province = province;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
