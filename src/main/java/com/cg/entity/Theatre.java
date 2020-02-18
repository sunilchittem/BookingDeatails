package com.cg.entity;

import java.util.List;

public class Theatre {
	private String theatreId;
	private String theatreName;
	private String theatreCity;
	private List<Show> show;
	
	public Theatre(String theatreId, String theatreName, String theatreCity, List<Show> show) {
		super();
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.theatreCity = theatreCity;
		this.show = show;
	}
	public String getTheatreId() {
		return theatreId;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public String getTheatreCity() {
		return theatreCity;
	}
	public List<Show> getShow() {
		return show;
	}
	
	
	
	
	
}
