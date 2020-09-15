package com.manipal.controller;

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

import com.manipal.model.Booking;
import com.manipal.service.IBookingService;

@RestController
@RequestMapping("/booking")
public class BookingController {
	
	@Autowired
	IBookingService service;
	
	@PostMapping("/addBooking")
	public boolean addBookingDetails(@RequestBody Booking booking) {
		if(service.addBooking(booking)) {
		return true;}
		else 
			return false;
	}
	@GetMapping("/getFare") 
		public double getFare(@RequestBody Booking booking) {
		double fare=service.getFare(booking);
		return fare;
	}
	
	
	@GetMapping("/getdetailsbyid/{personId}")
	public Booking getBookingDetails(@PathVariable long personId) {
		Booking booking = service.getBookingById(personId);
		return booking;
	}
	

	
	@DeleteMapping("/cancelbooking/{bookingId}")
	public boolean deleteBooking(@PathVariable long bookingId){
		boolean request=service.deleteBooking(bookingId);
		if(request==true) {
			return true;
		}
		return false;
		
	}
	
	

}
