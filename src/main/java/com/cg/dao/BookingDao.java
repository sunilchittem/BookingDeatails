package com.cg.dao;

import java.util.List;

import com.cg.entity.Booking;
import com.cg.exception.BookingNotFound;

public interface BookingDao {

	public Booking getBooking(String bookingID) throws BookingNotFound;
	public List<Booking> getBookingByUserID(String userID) throws BookingNotFound;
}
