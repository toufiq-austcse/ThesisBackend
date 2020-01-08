package com.thesis.greennessbackend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thesis.greennessbackend.dao.DataDaoImpl;
import com.thesis.greennessbackend.dao.GreenPercentageDaoImpl;
import com.thesis.greennessbackend.entity.GreenPercentage;


@RestController
@CrossOrigin
@RequestMapping("/api/percentage")
public class GreenPercentageController {
	private GreenPercentageDaoImpl percentageDaoImpl;
	@Autowired
	public GreenPercentageController(GreenPercentageDaoImpl percentageDaoImpl) {
		this.percentageDaoImpl = percentageDaoImpl;
	}
	
	@GetMapping("/district")
	public List<GreenPercentage> getDataSetTitle(@RequestParam String district,@RequestParam String year){
		GreenPercentage ob1 = new GreenPercentage(district, year, null, null);
		return this.percentageDaoImpl.getPercentageOfTwoZila(ob1);

	}
	
	@GetMapping("/year/range")
	public List<GreenPercentage> getPercentageOfYearRange(@RequestParam String district,@RequestParam String startYear,@RequestParam String endYear){
		return this.percentageDaoImpl.getPercentageForYearRange(district, startYear, endYear);

	}

}
