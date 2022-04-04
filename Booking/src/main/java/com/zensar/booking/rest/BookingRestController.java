package com.zensar.booking.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.booking.bean.Booking;
import com.zensar.booking.service.BookingService;

@RestController
public class BookingRestController {

	@Autowired
	BookingService service;

	@PostMapping("/booking")
	public Booking addBooking(@RequestBody Booking booking) {
		return this.service.addBooking(booking);
	}
}
