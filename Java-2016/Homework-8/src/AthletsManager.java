import java.util.List;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import java.util.Date;

public class AthletsManager {

	private String fileName;

	private List<Athlete> athletes;

	public AthletsManager(String filename) {
		this.fileName = filename;
		athletes = new ArrayList<>();
	}

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

	private Athlete parseLine(String sCurrentLine) {
		// TODO Auto-generated method stub
		String[] words = sCurrentLine.split(",");

		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		Date date = null;
		try {
			date = sdf.parse(words[3]);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new Athlete(Integer.parseInt(words[0]), words[1], words[2], date, words[4], words[5], words[6]);
	}

	public void printAthlets() {
		// TODO Auto-generated method stub
		for (Athlete athlete : athletes) {
			System.out.println(athlete.toString());
		}
	}

	public void calculateFinalTime() {
		for (Athlete athlete : athletes) {

			int missed = countMissed(athlete);

			Calendar cal = Calendar.getInstance();
			cal.setTime(athlete.getSkiTimeResult());
			cal.add(Calendar.SECOND, missed * 10);
			athlete.setSkiTimeResult(cal.getTime());
		}

	}

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

		// TODO Auto-generated method stub
		return count;
	}

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