import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

import org.junit.Test;

import com.sun.swing.internal.plaf.metal.resources.metal_zh_TW;



public class AthleteCSVTesting {
	
	@Test
	public void whenParsingCSVList_withOneAthlete_shouldReturnAthleteList_ofOneAthlete() throws IOException {
		String csv = "11,Umar Jorgson,SK,00:30:27,xxxox,xxxxx,xxoxo";
		FileReader fr = new FileReader(csv);
		BufferedReader br = new BufferedReader(fr);
		try (AthletesManager manager = new AthletesManager("src\\AthletesList.csv")) {
			List<Athlete> athletes = manager.readFromFile();
			assertEquals(1, athletes.size());
			Athlete expected = new Athlete(11,"Umar Jorgson","SK","00:30:27","xxxox","xxxxx","xxoxo");
			assertEquals(expected, athletes.get(0));
		}
	}

}
