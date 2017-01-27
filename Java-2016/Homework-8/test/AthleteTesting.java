import java.io.BufferedReader;
import java.io.File;
import java.io.Reader;
import java.io.StringReader;
import java.nio.file.Files;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;
import sun.util.BuddhistCalendar;

public class AthleteTesting {

	// @Test
	// public void stringQuicksort() {
	// // given
	// String[] strInput = { "eight", "ten", "twelve", "four", "fifty-three",
	// "twelve number two" };
	// GenericQuickSort genericSorter = new GenericQuickSort();
	// // when
	// String[] givenStringarray = (String[])
	// genericSorter.genericSort(strInput);
	// // then
	// String[] correctStringarray = { "eight", "fifty-three", "four", "ten",
	// "twelve", "twelve number two" };
	// Assert.assertEquals(correctStringarray, givenStringarray);
	//

	@Test
	public void athletesOrderisCorrect() {
		// given
		List<Athlete> athletes = new ArrayList<>();
		String s = "11,Umar Jorgson,SK,00:30:27,xxxox,xxxxx,xxoxo";
		StringReader sr = new StringReader(s);
		AthletesManager manager = new AthletesManager(sr);
		Athlete a1 = new Athlete(11, "Umar Jorgson", "SK", getDateFromString("00:30:27"), "xxxox", "xxxxx", "xxoxo");
		Athlete a2 = new Athlete(1, "Jimmy Smiles", "UK", getDateFromString("00:29:15"), "xxoox", "xooxo", "xxxxo");
		Athlete a3 = new Athlete(11, "Piotr Smitzer", "CZ", getDateFromString("00:30:10"), "xxxxx", "xxxxx", "xxxxx");

		athletes.add(a1);
		athletes.add(a2);
		athletes.add(a3);
		manager.setAthlets(athletes);

		// when
		List<Athlete> finalStandingsAthletes = manager.athletesInOrder();
		// then
		List<Athlete> correctlySortedAthletes = new ArrayList<>();
		correctlySortedAthletes.add(a2);
		correctlySortedAthletes.add(a3);
		correctlySortedAthletes.add(a1);
		Assert.assertEquals(finalStandingsAthletes.equals(correctlySortedAthletes), true);
		// manager.calculateFinalTime();
		// firstAthlete.

	}

	@Test
	public void correcltyCalculatedTimeWithPenalties() {
		// given
		ArrayList<Athlete> athletes = new ArrayList<>();
		Athlete a1 = new Athlete(11, "Umar Jorgson", "SK", getDateFromString("00:30:27"), "xxxox", "xxxxx", "xxoxo");
		String s = "11,Umar Jorgson,SK,00:30:27,xxxox,xxxxx,xxoxo";
		StringReader sr = new StringReader(s);
		AthletesManager manager = new AthletesManager(sr);
		athletes.add(a1);
		manager.setAthlets(athletes);
		manager.calculateFinalTime();
		manager.getAthletsList().get(0);
		Athlete a1withPenalties = new Athlete(11, "Umar Jorgson", "SK", getDateFromString("00:30:57"), "xxxox", "xxxxx",
				"xxoxo");
		Assert.assertEquals(manager.getAthletsList().get(0), a1withPenalties);

	}

	private Date getDateFromString(String string) {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		Date date = null;
		try {
			date = sdf.parse(string);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

}
