import java.util.ArrayList;

/**
 * This is the main class , where we calculate surface for rooms , and wattage.
 * 
 * @author Flaviu
 *
 */
public class HouseHeating {

	public static void main(String[] args) {
		double neededWattage;

		House myHouse = new House();

		Room room1 = new SquareRoom(12);
		room1.getSurface();
		System.out.println("Room 1 surface is:" + room1.getSurface());

		Room room2 = new RectangleRoom(12, 13);
		room2.getSurface();
		System.out.println("Room 2 surface is:" + room2.getSurface());

		Room room3 = new RightTriangleRoom(7, 8, 13);
		room1.getSurface();
		System.out.println("Room 3 surface is:" + room3.getSurface());

		myHouse.addRoom(room1);
		myHouse.addRoom(room2);
		myHouse.addRoom(room3);

		neededWattage = (room1.getSurface()) * 33;
		System.out.println("Room 1 needed wattage is " + neededWattage + " W");
		neededWattage = (room2.getSurface()) * 33;
		System.out.println("Room 2 needed wattage is " + neededWattage + " W");
		neededWattage = (room3.getSurface()) * 33;
		System.out.println("Room 3 needed wattage is " + neededWattage + " W");
		double totalWattage;
		totalWattage = (room1.getSurface()) * 33 + (room2.getSurface()) * 33 + (room3.getSurface()) * 33;
		System.out.println("The total wattage the house needs is " + totalWattage);

		myHouse.listRooms();

	}

}
