package com.thesis.greennessbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.thesis.greennessbackend.entity.Data;

public interface DataRepository extends JpaRepository<Data,Integer>{
	  @Query(value = "SELECT dataset FROM Data WHERE district = :district", nativeQuery = true)
	    public List<String> getDataSetTitle(String district);
	  
	  @Query(value = "SELECT * FROM Data WHERE district =:district AND year = :year AND month =:month AND day=:day", nativeQuery = true)
	    public List<Data> getData(String district,String year,String month,String day);
	  @Query(value ="SELECT * FROM data WHERE district = :district AND year BETWEEN :year1 AND :year2 ORDER BY greenness_value ASC", nativeQuery = true)
	  public List<Data> getMaximumParcentageData(String district,String year1,String year2);

}
