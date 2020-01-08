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
	public List<Data> getData(@RequestParam String dataset1Title,@RequestParam String dataset2Title,@RequestParam String district){
		System.out.println(dataset1Title);
		System.out.println(dataset2Title);
		
		Data data1 = dataDao.getData(district,dataset1Title).get(0);
		Data data2 = dataDao.getData(district,dataset2Title).get(0);
		
		List<Data> list = new ArrayList<Data>();
		list.add(data1);
		list.add(data2);
		System.out.println(list.size());

		return list;
	}

}
