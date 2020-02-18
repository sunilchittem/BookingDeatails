package com.cg.entity;

public class Booking {
	private String bookingId;
	private User user;
	private int noOfSeats;
	private Show show;
	public Booking(String bookingId, User user, int noOfSeats, Show show) {
		super();
		this.bookingId = bookingId;
		this.user = user;
		this.noOfSeats = noOfSeats;
		this.show = show;
	}
	public String getBookingId() {
		return bookingId;
	}
	public User getUser() {
		return user;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public Show getShow() {
		return show;
	}
	
}
