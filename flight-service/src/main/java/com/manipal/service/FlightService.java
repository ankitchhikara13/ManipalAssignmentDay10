package com.manipal.service;


import org.springframework.beans.factory.annotation.Autowired;


import com.manipal.model.Flight;

import com.manipal.repository.IFlightRepository;


public class FlightService implements IFlightService {
	@Autowired
	IFlightRepository repository;
	
	
	
	@Override
	public void addFlight(Flight flight) {
		  repository.save(flight);
		
	}


	@Override
	public void modifyFlight(Flight flight) {
			Flight obj = this.getFlightById(flight.getId());
		if(obj!=null) {
			obj.setId(flight.getId());
			obj.setDepartureLocation(flight.getDepartureLocation());
			obj.setFleet(flight.getFleet());
			obj.setFlightStatus(flight.getFlightStatus());
			obj.setDepartureTime(flight.getDepartureTime());
			obj.setArrivalTime(flight.getArrivalTime());
			
		}
			repository.save(obj);
		
		
			
				
		
	}

	@Override
	public void deleteFlight(int id) {
		if(repository.existsById(id)) {
			repository.deleteById(id);
			
		}
		
	}
	
	@Override
	public Flight getFlightById(int id) {
		return repository.findById(id).orElse(null);
	}


	
}


