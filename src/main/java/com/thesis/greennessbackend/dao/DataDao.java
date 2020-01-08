package com.thesis.greennessbackend.dao;

import java.util.List;

import com.thesis.greennessbackend.entity.*;

public interface DataDao {
	public List<Data> findAll();
	public List<String> getDatasetsTitle(String district);
	public List<Data> getData(String district,String datasetTitle);
}
