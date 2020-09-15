package com.manipal.service;

import com.manipal.model.Booking;

public interface IBookingService {

	boolean addBooking(Booking booking);
	double getFare(Booking booking);
	Booking getBookingById(long personId);
	boolean deleteBooking(long bookingId);
	
}
