package com.thesis.greennessbackend.dao;

import java.util.List;

import javax.persistence.EntityManager;


import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.thesis.greennessbackend.entity.Data;
import com.thesis.greennessbackend.repository.DataRepository;

@Repository
public class DataDaoImpl implements DataDao{
	private DataRepository dataRepository;
	
	@Autowired
	public  DataDaoImpl(DataRepository theDataRepository) {
		// TODO Auto-generated constructor stub
		this.dataRepository = theDataRepository;
	}

	@Override
	@Transactional
	public List<Data> findAll() {
		// TODO Auto-generated method stub
		return dataRepository.findAll();
		
	}
	
	@Override
	@Transactional
	public List<String> getDatasetsTitle(String district) {
		// TODO Auto-generated method stub
		return dataRepository.getDataSetTitle(district);
		
	}
	
	@Override
	@Transactional
	public List<Data> getData(String district,String datasetTitle) {
		// TODO Auto-generated method stub
		return dataRepository.getData(district,datasetTitle);
		
	}


}
