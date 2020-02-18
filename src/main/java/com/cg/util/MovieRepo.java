package com.cg.util;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.entity.Booking;
import com.cg.entity.Movie;
import com.cg.entity.Show;
import com.cg.entity.Theatre;
import com.cg.entity.User;

public class MovieRepo {
	public static Map<String, Theatre> theatreMap= new HashMap<>();
	public static Map<String, Booking> bookingMap= new HashMap<>();

	static {

		Movie movie1 = new Movie("1001","hello","3 hour");
		Movie movie2 = new Movie("1002","temper","2 hour");
		Movie movie3 = new Movie("1003","DJ","2.30 hour");

		Show show1 = new Show(
				"101",
				"MORNING",
				LocalDateTime.of(2020, 2, 17, 9, 30),
				LocalDateTime.of(2020, 2, 17, 12, 30),
				350,
				movie1
				);

		Show show2 = new Show(
				"102",
				"NIGHT",
				LocalDateTime.of(2020, 2, 17, 9, 30),
				LocalDateTime.of(2020, 2, 17, 11, 30),
				300,
				movie2
				);
		Show show3 = new Show(
				"103",
				"EVENING",
				LocalDateTime.of(2020, 2, 17, 9, 30),
				LocalDateTime.of(2020, 2, 17, 12, 00),
				250,
				movie3
				);


		List<Show> showlst1 = new ArrayList<>();
		showlst1.add(show1);
		showlst1.add(show2);
		
		List<Show> showlst2 = new ArrayList<>();
		showlst1.add(show3);
		
		Theatre theatre1 = new Theatre("1", "Viva", "jalandhar", showlst1);
		Theatre theatre2 = new Theatre("2", "PVR", "Phawgra", showlst2);
		
		theatreMap.put("1", theatre1);
		theatreMap.put("2", theatre2);
		
		User user1 = new User("1223", "Ram");
		User user2 = new User("1224", "Sam");
		
		Booking booking1 = new Booking("1110", user1, 5,show1);
		Booking booking2 = new Booking("1111", user2, 2,show2);
		Booking booking3 = new Booking("1112", user1, 9,show2);
		Booking booking4 = new Booking("1113", user2, 1,show3);
		
		
		bookingMap.put("1110", booking1);
		bookingMap.put("1111", booking2);
		bookingMap.put("1112", booking3);
		bookingMap.put("1113", booking4);


	}
}
