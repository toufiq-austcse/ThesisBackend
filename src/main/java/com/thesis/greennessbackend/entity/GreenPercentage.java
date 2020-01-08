package com.thesis.greennessbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GreenPercentage")
public class GreenPercentage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "district")
	private String district;
	
	@Column(name = "year")
	private String year;
	
	@Column(name = "month")
	private String month;
	
	@Column(name = "green_percentage")
	private String green_percentage;
	
	

	public GreenPercentage() {
		super();
	}

	public GreenPercentage(String district, String year, String month, String green_percentage) {
		super();
		this.district = district;
		this.year = year;
		this.month = month;
		this.green_percentage = green_percentage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getGreen_percentage() {
		return green_percentage;
	}

	public void setGreen_percentage(String green_percentage) {
		this.green_percentage = green_percentage;
	}
	
	
	
}
