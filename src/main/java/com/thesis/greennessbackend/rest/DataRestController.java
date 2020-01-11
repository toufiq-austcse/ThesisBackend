package com.thesis.greennessbackend.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thesis.greennessbackend.dao.DataDaoImpl;
import com.thesis.greennessbackend.entity.Data;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class DataRestController {
	private DataDaoImpl dataDao;
	
	@Autowired
	public DataRestController(DataDaoImpl dataDao) {
		this.dataDao = dataDao;
	}
	
	@GetMapping("/dataset")
	public List<String> getDataSetTitle(@RequestParam String district){
		return this.dataDao.getDatasetsTitle(district);
	}
	
	@GetMapping("/data")
	public Data getData(@RequestParam String district,@RequestParam String year,@RequestParam String month,@RequestParam String day){
		
		Data aData = new Data();
		aData.setDistrict(district);
		aData.setYear(year);
		aData.setMonth(month);
		aData.setDay(day);
		return this.dataDao.getData(aData).get(0);
	}
	
	@GetMapping("/data/maxmin")
	public List<Data> getData(@RequestParam String district,@RequestParam String year1,@RequestParam String year2){
		
		List<Data> myList = new ArrayList<Data>();
		List<Data> result = this.dataDao.getMinAndMaxData(district, year1, year2);
		myList.add(result.get(0));
		myList.add(result.get(result.size() -1));
		return myList;
	}
	

}
