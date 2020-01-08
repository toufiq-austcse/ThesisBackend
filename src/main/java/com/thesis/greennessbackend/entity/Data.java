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
	
	@Column(name = "greennessValue")
	private String greennessValue;
	
	@Column(name = "avgNdvi")
	private String avgNdvi;
	
	@Column(name = "image")
	private String image;

	public Data() {
	}

	public Data(String district, String dataset, String greennessValue, String avgNdvi, String image) {
		this.district = district;
		this.dataset = dataset;
		this.greennessValue = greennessValue;
		this.avgNdvi = avgNdvi;
		this.image = image;
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

	public String getGreennessValue() {
		return greennessValue;
	}

	public void setGreennessValue(String greennessValue) {
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
