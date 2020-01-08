package com.thesis.greennessbackend.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.thesis.greennessbackend.entity.GreenPercentage;
import com.thesis.greennessbackend.repository.DataRepository;
import com.thesis.greennessbackend.repository.GreenPercentageRepository;

@Repository
public class GreenPercentageDaoImpl implements GreenPercentageDao{
	private GreenPercentageRepository greenPercentageRepository;

	@Autowired
	public  GreenPercentageDaoImpl(GreenPercentageRepository greenPercentageRepository) {
		this.greenPercentageRepository = greenPercentageRepository;
	}

	@Override
	@Transactional
	public List<GreenPercentage> getPercentageOfTwoZila(GreenPercentage ob1) {
		return this.greenPercentageRepository.getGreenPercentage(ob1.getDistrict(), ob1.getYear());
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<GreenPercentage> getPercentageForYearRange(String district, String year1, String year2) {
		// TODO Auto-generated method stub
		return this.greenPercentageRepository.getPercentageForYearRange(district, year1, year2);
	}

}
