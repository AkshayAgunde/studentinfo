package com.neoquant.student.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentAddress {
	@Id

	private String buildingNo;
	private String name;
	private String unit;
	private String town;
	private String city;
	private String country;
	private int pinCode;
	private int stuId;
	
	public StudentAddress(String buildingNo, String name, String unit, String town, String city, String country,
			int pinCode, int stuId) {
		super();
		this.buildingNo = buildingNo;
		this.name = name;
		this.unit = unit;
		this.town = town;
		this.city = city;
		this.country = country;
		this.pinCode = pinCode;
		this.stuId = stuId;
	}
	public StudentAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBuildingNo() {
		return buildingNo;
	}
	public void setBuildingNo(String buildingNo) {
		this.buildingNo = buildingNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
}
