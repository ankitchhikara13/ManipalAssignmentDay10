package com.manipal.service;


import com.manipal.model.Location;

public interface ILocationService {

	void addLocation(Location location);
	Location getLocationById(int id);
	
	void modifyLocation(Location location);
	
	void deleteLocation(int id);
	
}
