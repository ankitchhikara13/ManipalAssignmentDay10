package com.manipal.service;


import org.springframework.beans.factory.annotation.Autowired;


import com.manipal.model.Location;
import com.manipal.repository.ILocationRepository;


public class LocationService implements ILocationService {
	@Autowired
	ILocationRepository repository;



	@Override
	public void addLocation(Location location) {
		repository.save(location);

	}


	@Override
	public void modifyLocation(Location location) {
		Location obj = this.getLocationById(location.getId());
		if(obj!=null) {
			obj.setId(location.getId());
			obj.setName(location.getName());
			obj.setCode(location.getCode());
			obj.setCountry(location.getCountry());
			obj.setAirportName(location.getAirportName());


		}
		repository.save(obj);





	}

	@Override
	public void deleteLocation(int id) {
		if(repository.existsById(id)) {
			repository.deleteById(id);

		}

	}

	@Override
	public Location getLocationById(int id) {
		return repository.findById(id).orElse(null);
	}



}


