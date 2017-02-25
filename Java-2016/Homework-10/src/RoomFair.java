/**
 * This is the room fair class with setters and getters and toString methods
 * 
 * @author Flaviu
 *
 */
public class RoomFair {

	private int id;
	private double value;
	private String season;

	public int getId() {
		return id;
	}

	public double getValue() {
		return value;
	}

	public String getSeason() {
		return season;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	@Override
	public String toString() {
		return "RoomFair [id=" + id + ", value=" + value + ", season=" + season + "]";
	}

}
