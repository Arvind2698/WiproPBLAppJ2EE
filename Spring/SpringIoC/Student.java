package com.arvind.wipro.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	private String studentId;
	private String studentName;
	
	private Test studentTest;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Test getStudentTest() {
		return studentTest;
	}

	public void setStudentTest(Test studentTest) {
		this.studentTest = studentTest;
	}

	public Student(String studentId, String studentName, Test studentTest) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentTest = studentTest;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentTest=" + studentTest
				+ "]";
	}
	
		
}
