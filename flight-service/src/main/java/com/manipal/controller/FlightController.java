package com.manipal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.model.Location;
import com.manipal.model.Flight;
import com.manipal.service.IFlightService;

@RestController
@RequestMapping("/flight-service")
public class FlightController {
	@Autowired
	IFlightService flightService;

	@PostMapping("/addFlight")
	public String addFlightDetails(@RequestBody Flight flight) {
		flightService.addFlight(flight);
		return "Telephone Added Successfully";
	}

	@PutMapping("/modifyFlight")
	public String modifyFlight(@RequestBody Flight flight){
		flightService.modifyFlight(flight);
		return "Flight modified successfully";
	}
	
	@DeleteMapping("/detete/id/{id}")
	public String deleteCustomer(@PathVariable int id){
		flightService.deleteFlight(id);
		return("Flight deleted successfully!");
	} 
	
	@Autowired
	ILocationService location;
	@PostMapping("/addLocation") 
	public String addLocation(@RequestBody Location location) {
		locationService.addLocation(location);
		locationService.addLocation(location)
	}
}	