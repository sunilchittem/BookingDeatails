package com.cg.service;

import java.util.List;

import com.cg.dao.BookingDao;
import com.cg.dao.BookingDaoImpl;
import com.cg.entity.Booking;
import com.cg.exception.BookingNotFound;

public class BookingServiceImpl implements BookingService {

	BookingDao dao = new BookingDaoImpl();
	//BookingService ser = new BookingServiceImpl();
	
	@Override
	public Booking getBooking(String bookingID) throws BookingNotFound {
		return dao.getBooking(bookingID);
	}
     
	@Override
	public List<Booking> getBookingByUserID(String userID) throws BookingNotFound {
		return dao.getBookingByUserID(userID);
	}

}
