package com.arvind.wipro.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "coupons")
public class Coupon {
	
	@Id
	@Column(name = "code")
	private String code;
	
	@Column(name = "value")
	private int value;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Coupon [code=" + code + ", value=" + value + "]";
	}

	public Coupon(String code, int value) {
		super();
		this.code = code;
		this.value = value;
	}

	public Coupon() {
		super();
	}
	
	
}
