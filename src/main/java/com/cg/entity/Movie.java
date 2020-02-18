package com.cg.entity;

public class Movie {
	private String movieId;
	private String movieName;
	private String movieLength;
	public Movie(String movieId, String movieName, String movieLength) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieLength = movieLength;
	}
	public String getMovieId() {
		return movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public String getMovieLength() {
		return movieLength;
	}
	

}
