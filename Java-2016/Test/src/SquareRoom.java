/**
 * 
 * @author Flaviu
 *
 */
public class SquareRoom extends Room {
	private double side;

	public SquareRoom(int side) {
		this.side = side;
	}

	/**
	 * This method calculates the surface for Square
	 */
	public double getSurface() {
		return side * side;

	}

	public String toString() {
		return "Square Room's side is " + side + " ";
	}

}
