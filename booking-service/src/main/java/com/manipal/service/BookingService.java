package com.manipal.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manipal.model.Booking;
import com.manipal.repository.IBookingRepository;

@Service
public class BookingService implements IBookingService {
	@Autowired
	IBookingRepository repository;
	
	
	
	@Override
	public boolean addBooking(Booking booking) {
		// if statement ki agar seat_type k hisab se flight status remaining seats!=0  no of seats != 0 hai tabhi add hoga warna throw exception
		// aur save karne se pehle seattype k hisab se total economy/premium/business seats-- 
		booking.setTotalFare(getFare(booking));
		repository.save(booking);
		
	}


	@Override
	public boolean deleteBooking(long bookingId) {
		if(repository.existsById(bookingId)) {
			repository.deleteById(bookingId);
			return true;
			
			}
		return false;
		
	}
	
	public double getFare(Booking booking) {
		// if booking.seattype ke hisab se fare ki value milegi
		
		int tickets=booking.getNooftickets();
		
		return tickets* //fare
	}
	
	@Override
	public Booking getBookingById(long personId) {
		return repository.findById(personId);
	}

	
}


