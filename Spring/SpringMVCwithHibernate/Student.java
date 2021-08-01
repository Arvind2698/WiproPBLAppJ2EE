package com.arvind.wipro.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	
	@Id
	@Column(name = "regno")
	private String regno;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;

	public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student() {
		super();
	}
	public Student(String regno, String name, String email) {
		super();
		this.regno = regno;
		this.name = name;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [regno=" + regno + ", name=" + name + ", email=" + email + "]";
	}
	
}
