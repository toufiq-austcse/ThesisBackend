package com.thesis.greennessbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.thesis.greennessbackend.entity.Data;

public interface DataRepository extends JpaRepository<Data,Integer>{
	  @Query(value = "SELECT dataset FROM Data WHERE district = :district", nativeQuery = true)
	    public List<String> getDataSetTitle(String district);
	  
	  @Query(value = "SELECT * FROM Data WHERE district =:district AND dataset = :dataset", nativeQuery = true)
	    public List<Data> getData(String district,String dataset);

}
