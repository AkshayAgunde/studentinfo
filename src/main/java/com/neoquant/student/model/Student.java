package com.neoquant.student.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String address;
	private int std;
	private String bloodGroup;
	
	@OneToMany(targetEntity = StudentAddress.class,cascade = CascadeType.ALL)
	@JoinColumn(name="ad_fk",referencedColumnName = "id")
	private List<StudentAddress> add;
	
	public Student(int id, String name, String address, int std, String bloodGroup, List<StudentAddress> add) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.std = std;
		this.bloodGroup = bloodGroup;
		this.add = add;
	}

	public Student(int id, String name, String address, int std, String bloodGroup) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.std = std;
		this.bloodGroup = bloodGroup;
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<StudentAddress> getAdd() {
		return add;
	}

	public void setAdd(List<StudentAddress> add) {
		this.add = add;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	

}
