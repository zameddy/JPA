package com.demo.domaine;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String area;
	private String city;
	private String pincode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
