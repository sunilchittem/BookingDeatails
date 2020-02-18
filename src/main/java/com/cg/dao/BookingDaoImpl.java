package com.cg.dao;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.cg.entity.Booking;
import com.cg.exception.BookingNotFound;
import com.cg.util.MovieRepo;

public class BookingDaoImpl implements BookingDao{
	
   Map<String,Booking> bmap= MovieRepo.bookingMap;
   
	@Override
	public Booking getBooking(String bookingID) throws BookingNotFound {
		if(!bmap.containsKey(bookingID))
			throw new BookingNotFound("No Booking ID Is Found");
		return bmap.get(bookingID);
	}

	@Override
	public List<Booking> getBookingByUserID(String userID) throws BookingNotFound {
		
		boolean checkID = bmap.values().stream().anyMatch(b -> b.getUser().getUserId() == userID);
		if(!checkID) 
			throw new BookingNotFound("No Booking ID Is Found");
			
		List<Booking> booking = bmap.values().stream().filter(b -> b.getUser().getUserId() == userID)
				.collect(Collectors.toList());
		
		return booking;
	}
	

}
