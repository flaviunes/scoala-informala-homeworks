/**
 * This is a sub-class for Room , where we have certain shape of room.
 * 
 * @author Flaviu
 *
 */
public class RightTriangleRoom extends Room {
	private double side1 = 10;
	private double side2 = 15;
	private double side3 = 20;

	public RightTriangleRoom(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

	}

	/**
	 * This method calculates the surface for Right Triangle
	 */
	public double getSurface() {
		return (side1 * side2) / 2;
	}

	public String toString() {
		return "Right triangle Room's sides are " + side1 + " " + side2 + " " + side3 + " ";

	}

}
