import java.util.List;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import java.util.Date;

/**
 * This is the manager class for reading files , print athletes , calculating
 * time , adding time based on target shooting.
 * 
 * @author Flaviu
 *
 */
public class AthletesManager {

	private String fileName;

	private List<Athlete> athletes;

	public AthletesManager(String filename) {
		this.fileName = filename;
		athletes = new ArrayList<>();
	}

	/**
	 * This method reads line by line from file with a while loop , then add the
	 * lines in athletes list.
	 */
	public void readFromFile() {
		BufferedReader br = null;
		FileReader fr = null;

		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);

			String sCurrentLine;

			br = new BufferedReader(new FileReader(fileName));

			while ((sCurrentLine = br.readLine()) != null) {
				Athlete athlete = parseLine(sCurrentLine);
				athletes.add(athlete);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();

				if (fr != null)
					fr.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	/**
	 * This method splits each line read from the CSV in an array of strings ,
	 * each string being separated by a comma , and parses the skiTimeResult
	 * into date format.
	 */
	private Athlete parseLine(String sCurrentLine) {
		String[] words = sCurrentLine.split(",");

		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		Date date = null;
		try {
			date = sdf.parse(words[3]);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return new Athlete(Integer.parseInt(words[0]), words[1], words[2], date, words[4], words[5], words[6]);
	}

	/**
	 * This method prints all Athletes read from the CSV file.
	 */
	public void printAthlets() {
		for (Athlete athlete : athletes) {
			System.out.println(athlete.toString());
		}
	}

	/**
	 * This method calculates the final time of each athlete based on shooting
	 * ranges.
	 */
	public void calculateFinalTime() {
		for (Athlete athlete : athletes) {

			int missed = countMissed(athlete);

			Calendar cal = Calendar.getInstance();
			cal.setTime(athlete.getSkiTimeResult());
			cal.add(Calendar.SECOND, missed * 10);
			athlete.setSkiTimeResult(cal.getTime());
		}

	}

	/**
	 * This method counts how many missed targets each athlete has
	 */
	private int countMissed(Athlete athlete) {
		int count = 0;

		for (int i = 0; i < athlete.getFirstShootingRange().length(); i++) {
			if (athlete.getFirstShootingRange().charAt(i) == 'o') {
				count++;
			}
		}

		for (int i = 0; i < athlete.getSecondShootingRange().length(); i++) {
			if (athlete.getSecondShootingRange().charAt(i) == 'o') {
				count++;
			}
		}

		for (int i = 0; i < athlete.getThirdShootingRange().length(); i++) {
			if (athlete.getThirdShootingRange().charAt(i) == 'o') {
				count++;
			}
		}

		return count;
	}

	/**
	 * This method prints every athlete sorted by the final timer.
	 */
	public void printAthletsInOrder() {
		System.out.println();
		for (int i = 0; i <= athletes.size() - 1; i++) {
			for (int j = i + 1; j < athletes.size(); j++) {
				if (athletes.get(i).compareTo(athletes.get(j)) > 0) {
					Athlete aux = athletes.get(i);
					athletes.set(i, athletes.get(j));
					athletes.set(j, aux);
				}
			}
		}

		printAthlets();
	}

}