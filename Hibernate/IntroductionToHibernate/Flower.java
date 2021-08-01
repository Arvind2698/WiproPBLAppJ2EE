package com.arvind.wipro.IntroToHibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flower")
public class Flower {
	
	@Id
	@Column(name = "flower_id")
	private String flower_id;
	
	@Column(name = "flower_name")
	private String flower_name;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "price")
	private double price;

	public Flower(String flower_id, String flower_name, String color, double price) {
		super();
		this.flower_id = flower_id;
		this.flower_name = flower_name;
		this.color = color;
		this.price = price;
	}

	public String getFlower_id() {
		return flower_id;
	}

	public void setFlower_id(String flower_id) {
		this.flower_id = flower_id;
	}

	public String getFlower_name() {
		return flower_name;
	}

	public void setFlower_name(String flower_name) {
		this.flower_name = flower_name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Flower [flower_id=" + flower_id + ", flower_name=" + flower_name + ", color=" + color + ", price="
				+ price + "]";
	}
	
}
