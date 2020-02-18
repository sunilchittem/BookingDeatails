package com.cg.test;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.cg.exception.BookingNotFound;
import com.cg.service.BookingService;
import com.cg.service.BookingServiceImpl;

public class TestAddBooking {
	@Test
	public void bookingTest1() throws BookingNotFound{
		BookingServiceImpl ser = new BookingServiceImpl();
		assertThrows(BookingNotFound.class, ()-> ser.getBooking("22"));
	}
	@Test
	public void bookingTest2() throws BookingNotFound{
		BookingServiceImpl ser = new BookingServiceImpl();
		assertThrows(BookingNotFound.class, ()-> ser.getBookingByUserID("22"));
	}
}
