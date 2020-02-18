package com.cg.service;

import java.util.List;

import com.cg.entity.Booking;
import com.cg.exception.BookingNotFound;

public interface BookingService {
	public Booking getBooking(String bookingID) throws BookingNotFound;
	public List<Booking> getBookingByUserID(String userID) throws BookingNotFound;
}
