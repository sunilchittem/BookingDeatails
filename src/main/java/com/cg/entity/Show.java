package com.cg.entity;

import java.time.LocalDateTime;

public class Show {
	private String showId;
	private String showName;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private double movieFair;
	private Movie movie;
	public Show(String showId, String showName, LocalDateTime startTime, LocalDateTime endTime, double movieFair,
			Movie movie) {
		super();
		this.showId = showId;
		this.showName = showName;
		this.startTime = startTime;
		this.endTime = endTime;
		this.movieFair = movieFair;
		this.movie = movie;
	}
	public String getShowId() {
		return showId;
	}
	public String getShowName() {
		return showName;
	}
	public LocalDateTime getStartTime() {
		return startTime;
	}
	public LocalDateTime getEndTime() {
		return endTime;
	}
	public double getMovieFair() {
		return movieFair;
	}
	public Movie getMovie() {
		return movie;
	}

	

}
