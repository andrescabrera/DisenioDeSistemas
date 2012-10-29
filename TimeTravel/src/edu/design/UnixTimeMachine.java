package edu.design;

import java.util.Date;

public class UnixTimeMachine {

	public void timejump(long ticks) {
		Date date = new Date();
		date.setTime(ticks);
		System.out.println("Viaje a " +  date.toGMTString() + ", hora local: " + date );
		
	}
	
}
