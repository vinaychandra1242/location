package com.vinay.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinay.location.entity.LocationEntity;
import com.vinay.location.repo.LocationRepo;

@Service
public class LocationService {

	@Autowired
	LocationRepo repo;
	
	public LocationEntity saveLocation(LocationEntity entity)
	{
		return repo.save(entity);
	}
	
	public LocationEntity updateLocation(LocationEntity entity)
	{
		return repo.save(entity);
	}
	
	public void deleteLocation(LocationEntity entity)
	{
		repo.delete(entity);
	}
	
	public LocationEntity findById(int id)
	{
		return repo.findById(id).get();
	}
	
	public List<LocationEntity> getall(){
		return repo.findAll();
	}
}
