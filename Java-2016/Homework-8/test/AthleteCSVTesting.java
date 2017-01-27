import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.Test;

public class AthleteCSVTesting {

	@Test
	public void whenParsingCSVList_withOneAthlete_shouldReturnAthleteList_ofOneAthlete() throws IOException {

		try {
			AthletesManager manager = new AthletesManager("fake_url");

			List<Athlete> athletes = new ArrayList<>();
			athletes.add(
					new Athlete(11, "Umar Jorgson", "SK", getDateFromString("00:30:27"), "xxxox", "xxxxx", "xxoxo"));
			assertEquals(1, athletes.size());
			athletes.add(new Athlete(13, "Jorgson", "DK", getDateFromString("00:23:47"), "ooooo", "xxxxx", "xxoxo"));
			athletes.add(new Athlete(14, "Umar ", "EK", getDateFromString("00:12:27"), "xxxox", "xoxox", "xxoxo"));
			manager.setAthlets(athletes);
			manager.calculateFinalTime();
			Athlete expected1 = new Athlete(11, "Umar Jorgson", "SK", getDateFromString("00:30:57"), "xxxox", "xxxxx",
					"xxoxo");
			Athlete expected2 = new Athlete(13, "Jorgson", "DK", getDateFromString("00:24:57"), "ooooo", "xxxxx",
					"xxoxo");
			Athlete expected3 = new Athlete(14, "Umar ", "EK", getDateFromString("00:13:17"), "xxxox", "xoxox",
					"xxoxo");
			Athlete[] expected = new Athlete[] { expected1, expected2, expected3 };
			Athlete[] actual = new Athlete[3];
			manager.getAthletsList().toArray(actual);

			assertArrayEquals(expected, actual);
		} catch (Exception e) {
		}
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

	@Test
	public void csvParsing() throws Exception {
		AthletesManager manager = new AthletesManager("src\\AthletesList.csv");
		manager.readFromFile();

		Athlete ex1 = new Athlete(11, "Umar Jorgson", "SK", getDateFromString("00:30:27"), "xxxox", "xxxxx", "xxoxo");
		Athlete ex2 = new Athlete(1, "Jimmy Smiles", "UK", getDateFromString("00:29:15"), "xxoox", "xooxo", "xxxxo");
		Athlete ex3 = new Athlete(27, "Piotr Smitzer", "CZ", getDateFromString("00:30:10"), "xxxxx", "xxxxx", "xxxxx");

		Athlete[] expected = new Athlete[] { ex1, ex2, ex3 };
		Athlete[] actual = new Athlete[3];
		manager.getAthletsList().toArray(actual);

		assertArrayEquals(expected, actual);

	}

}