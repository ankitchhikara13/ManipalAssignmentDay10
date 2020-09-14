package com.manipal.service;

import java.util.List;

import com.manipal.model.Flight;

public interface IFlightService {

	void addFlight(Flight flight);
	Flight getFlightById(int id);
	
	void modifyFlight(Flight flight);
	
	void deleteFlight(int id);
	
}
