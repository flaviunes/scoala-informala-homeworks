import static org.junit.Assert.assertArrayEquals;
import java.io.IOException;
import java.io.StringReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.Test;

import junit.framework.Assert;

public class AthleteCSVTesting {

	@Test
	public void correcltyParseCSV() throws IOException {

		try {
			String s = "11,Umar Jorgson,SK,00:30:27,xxxox,xxxxx,xxoxo\n1,Jimmy Smiles,UK,00:29:15,xxoox,xooxo,xxxxo\n27,Piotr Smitzer,CZ,00:30:10,xxxxx,xxxxx,xxxxx";
			StringReader sr = new StringReader(s);
			AthletesManager manager = new AthletesManager(sr);

			List<Athlete> athletes = new ArrayList<>();
			manager.readFromReader();
			manager.calculateFinalTime();
			Athlete expected1 = new Athlete(11, "Umar Jorgson", "SK", getDateFromString("00:30:57"), "xxxox", "xxxxx",
					"xxoxo");
			Athlete expected2 = new Athlete(1, "Jimmy Smiles", "UK", getDateFromString("00:30:15"), "xxoox", "xooxo",
					"xxxxo");
			Athlete expected3 = new Athlete(27, "Piotr Smitzer", "CZ", getDateFromString("00:30:10"), "xxxxx", "xxxxx",
					"xxxxx");
			athletes.add(expected1);
			athletes.add(expected2);
			athletes.add(expected3);

			Assert.assertEquals(manager.getAthletsList().equals(athletes), true);
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
		String s = "11,Umar Jorgson,SK,00:30:27,xxxox,xxxxx,xxoxo\n1,Jimmy Smiles,UK,00:29:15,xxoox,xooxo,xxxxo\n27,Piotr Smitzer,CZ,00:30:10,xxxxx,xxxxx,xxxxx";
		StringReader sr = new StringReader(s);
		AthletesManager manager = new AthletesManager(sr);
		manager.readFromReader();

		Athlete ex1 = new Athlete(11, "Umar Jorgson", "SK", getDateFromString("00:30:27"), "xxxox", "xxxxx", "xxoxo");
		Athlete ex2 = new Athlete(1, "Jimmy Smiles", "UK", getDateFromString("00:29:15"), "xxoox", "xooxo", "xxxxo");
		Athlete ex3 = new Athlete(27, "Piotr Smitzer", "CZ", getDateFromString("00:30:10"), "xxxxx", "xxxxx", "xxxxx");

		Athlete[] expected = new Athlete[] { ex1, ex2, ex3 };
		Athlete[] actual = new Athlete[3];
		manager.getAthletsList().toArray(actual);

		assertArrayEquals(expected, actual);

	}

}