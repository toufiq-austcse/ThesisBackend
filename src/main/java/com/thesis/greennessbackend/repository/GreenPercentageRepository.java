package com.thesis.greennessbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.thesis.greennessbackend.entity.GreenPercentage;

public interface GreenPercentageRepository extends JpaRepository<GreenPercentage, Integer> {
	@Query(value = "SELECT * FROM green_percentage WHERE district = :district AND year = :year", nativeQuery = true)
    public List<GreenPercentage> getGreenPercentage(String district,String year);
	
	@Query(value = "SELECT * FROM green_percentage WHERE district = :district AND year BETWEEN :year1 AND :year2", nativeQuery = true)
	public List<GreenPercentage> getPercentageForYearRange(String district,String year1,String year2);
}
