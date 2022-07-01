package com.cg.placementmanagement;



import java.io.Serializable;

import javax.persistence.Entity;
import  javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="college")
public class College implements Serializable{
	private static final long serialVersionUID=1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long id;
	private String collegeAdmin;
	private String collegeName;
	private String location;
	
	public College() {
		super();
		
	}

	public College(long id, String collegeAdmin, String collegeName, String location) {
		super();
		this.id = id;
		this.collegeAdmin = collegeAdmin;
		this.collegeName = collegeName;
		this.location = location;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCollegeAdmin() {
		return collegeAdmin;
	}

	public void setCollegeAdmin(String collegeAdmin) {
		this.collegeAdmin = collegeAdmin;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
}
