package com.arvind.wipro.Annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car_details")
public class Car_details {
	
	@Id
	private String regno;
	
	@Column(name = "model")
	private String model;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "manufacturer")
	private String manufacturer;

	public Car_details() {
		super();
	}

	public Car_details(String regno, String model, String color, String manufacturer) {
		super();
		this.regno = regno;
		this.model = model;
		this.color = color;
		this.manufacturer = manufacturer;
	}

	public String getRegno() {
		return regno;
	}

	public void setRegno(String regno) {
		this.regno = regno;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Car_details [regno=" + regno + ", model=" + model + ", color=" + color + ", manufacturer="
				+ manufacturer + "]";
	}

	public Car_details(String regno, String manufacturer) {
		super();
		this.regno = regno;
		this.manufacturer = manufacturer;
	}
	
}
