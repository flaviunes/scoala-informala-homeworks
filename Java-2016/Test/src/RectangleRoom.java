/**
 * This is a sub-class for Room , where we have certain shape of room.
 * 
 * @author Flaviu
 *
 */

public class RectangleRoom extends Room {
	private double width = 12;
	private double height = 17;

	public RectangleRoom(int width, int height) {
		this.width = width;
		this.height = height;
	}

	/**
	 * This method calculates the surface for Rectangle
	 */
	public double getSurface() {
		return width * height;
	}

	public String toString() {
		return "Rectangle Room's sides are " + width + " " + height + " ";
	}

}
