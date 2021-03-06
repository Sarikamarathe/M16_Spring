package com.cg.placementmanagement;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student1")
public class Student implements Serializable
{
	private static final long serialVersionUID=1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	//@Column(name="ID")
	private long id;
	private String name;
	private String college;
	private long roll;
	private String qualification;
	private String course;
	private int year;
	private String certificate;
	private long hallticketno;
	
	public Student() {
		super();
		
	}
	public Student(long id, String name, String college, long roll, String qualification, String course, int year,
			String certificate, long hallticketno) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.roll = roll;
		this.qualification = qualification;
		this.course = course;
		this.year = year;
		this.certificate = certificate;
		this.hallticketno = hallticketno;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public long getRoll() {
		return roll;
	}
	public void setRoll(long roll) {
		this.roll = roll;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCertificate() {
		return certificate;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	public long getHallTicketNo() {
		return hallticketno;
	}
	public void setHallTicketNo(long hallticketno) {
		this.hallticketno = hallticketno;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
}