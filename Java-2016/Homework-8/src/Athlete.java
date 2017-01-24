
import java.util.Date;

/**
 * This is the Athlete class , where all parameters are added for an athlete
 * 
 * @author Flaviu
 *
 */
public class Athlete implements Comparable<Athlete> {
	private int athleteNumber;
	private String athleteName;
	private String countryCode;
	private Date skiTimeResult;
	private String firstShootingRange;
	private String secondShootingRange;
	private String thirdShootingRange;

	public Athlete(int athleteNumber, String athleteName, String countryCode, Date skiTimeResult,
			String firstShootingRange, String secondShootingRange, String thirdShootingRange) {
		super();
		this.athleteNumber = athleteNumber;
		this.athleteName = athleteName;
		this.countryCode = countryCode;
		this.skiTimeResult = skiTimeResult;
		this.firstShootingRange = firstShootingRange;
		this.secondShootingRange = secondShootingRange;
		this.thirdShootingRange = thirdShootingRange;
	}

	public int getAthleteNumber() {
		return athleteNumber;
	}

	public String getAthleteName() {
		return athleteName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public Date getSkiTimeResult() {
		return skiTimeResult;
	}

	public String getFirstShootingRange() {
		return firstShootingRange;
	}

	public String getSecondShootingRange() {
		return secondShootingRange;
	}

	public String getThirdShootingRange() {
		return thirdShootingRange;
	}

	public void setAthleteNumber(int athleteNumber) {
		this.athleteNumber = athleteNumber;
	}

	public void setAthleteName(String athleteName) {
		this.athleteName = athleteName;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public void setSkiTimeResult(Date skiTimeResult) {
		this.skiTimeResult = skiTimeResult;
	}

	public void setFirstShootingRange(String firstShootingRange) {
		this.firstShootingRange = firstShootingRange;
	}

	public void setSecondShootingRange(String secondShootingRange) {
		this.secondShootingRange = secondShootingRange;
	}

	public void setThirdShootingRange(String thirdShootingRange) {
		this.thirdShootingRange = thirdShootingRange;
	}

	/**
	 * toString method returns athlete parameters and skiTimeResult as minutes
	 * and seconds.
	 */
	@Override
	public String toString() {
		return athleteNumber + " " + athleteName + " " + countryCode + " " + skiTimeResult.getMinutes() + ":"
				+ skiTimeResult.getSeconds() + " " + firstShootingRange + " " + secondShootingRange + " "
				+ thirdShootingRange;
	}

	/**
	 * This is the compare method implemented form Compareble class.
	 */
	@Override
	public int compareTo(Athlete athlete) {
		return this.skiTimeResult.compareTo(athlete.getSkiTimeResult());
	}
}
