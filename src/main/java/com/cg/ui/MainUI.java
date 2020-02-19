package com.cg.ui;

import com.cg.entity.Booking;
import com.cg.exception.BookingNotFound;
import com.cg.service.BookingService;
import com.cg.service.BookingServiceImpl;

public class MainUI {

	public static void main(String[] args) {
		
		BookingService ser = new BookingServiceImpl();
		Booking boking;
		try {
			boking = ser.getBooking("1110");
			System.out.println(boking.getBookingId());
			System.out.println(boking.getNoOfSeats());
			System.out.println(boking.getShow().getShowName());
			System.out.println(boking.getShow().getMovieFair());
			System.out.println(boking.getShow().getMovie().getMovieName());
			System.out.println(boking.getShow().getMovie().getMovieLength());
		} catch (BookingNotFound e) {
			System.out.println(e.getMessage());
		}
		

	}

}
