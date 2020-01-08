package com.thesis.greennessbackend.dao;

import java.util.List;

import com.thesis.greennessbackend.entity.GreenPercentage;

public interface GreenPercentageDao {
	public List<GreenPercentage> getPercentageOfTwoZila(GreenPercentage ob1);
	public List<GreenPercentage> getPercentageForYearRange(String district,String year1,String year2);
	
}
