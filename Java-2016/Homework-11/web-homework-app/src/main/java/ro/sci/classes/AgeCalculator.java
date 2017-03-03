package ro.sci.classes;

import java.sql.Date;

public class AgeCalculator {

	private long days;

	public long daysBetween(Date one, Date two) {
		days = (one.getTime() - two.getTime()) / (1000 * 60 * 60 * 24);
		// milliseconds in a day
		return Math.abs(days);
	}

}
