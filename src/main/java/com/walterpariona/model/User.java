package com.walterpariona.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	private String fname;
	private String lname;
	
	public User() {
		super();
	}
	public User(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
	}
	
}
