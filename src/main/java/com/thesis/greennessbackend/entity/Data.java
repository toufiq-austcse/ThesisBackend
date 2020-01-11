package com.thesis.greennessbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "data")
public class Data {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "district")
	private String district;
	
	@Column(name = "dataset")
	private String dataset;
	
	@Column(name = "greennessValue",precision=10, scale=2)
	private Double greennessValue;
	
	@Column(name = "avgNdvi")
	private String avgNdvi;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "year")
	private String year;
	
	@Column(name = "month")
	private String month;
	
	@Column(name = "day")
	private String day;

	public Data() {
	}
	
	


	public Data(int id, String district, String dataset, Double greennessValue, String avgNdvi, String image,
			String year, String month, String day) {
		super();
		this.id = id;
		this.district = district;
		this.dataset = dataset;
		this.greennessValue = greennessValue;
		this.avgNdvi = avgNdvi;
		this.image = image;
		this.year = year;
		this.month = month;
		this.day = day;
	}




	public Data(String district, String dataset, Double greennessValue, String avgNdvi, String image, String year,
			String month, String day) {
	
		this.district = district;
		this.dataset = dataset;
		this.greennessValue = greennessValue;
		this.avgNdvi = avgNdvi;
		this.image = image;
		this.year = year;
		this.month = month;
		this.day = day;
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


	public String getDay() {
		return day;
	}


	public void setDay(String day) {
		this.day = day;
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

	public String getDataset() {
		return dataset;
	}

	public void setDataset(String dataset) {
		this.dataset = dataset;
	}

	public Double getGreennessValue() {
		return greennessValue;
	}

	public void setGreennessValue(Double greennessValue) {
		this.greennessValue = greennessValue;
	}

	public String getAvgNdvi() {
		return avgNdvi;
	}

	public void setAvgNdvi(String avgNdvi) {
		this.avgNdvi = avgNdvi;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Data [id=" + id + ", district=" + district + ", dataset=" + dataset + ", greennessValue="
				+ greennessValue + ", avgNdvi=" + avgNdvi + ", image=" + image + "]";
	}
	
	

	
	
	
	
	
	

}
