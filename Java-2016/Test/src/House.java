import java.util.*;

/**
 * This is a class where we create an array of rooms , called myHouse
 * 
 * @author Flaviu
 *
 */
public class House {

	private ArrayList<Room> rooms;

	public House() {
		rooms = new ArrayList<Room>();
	}

	public void addRoom(Room n) {
		rooms.add(n);
	}

	public void listRooms() {
		for (int i = 0; i <= rooms.size() - 1; i++) {
			Room room = rooms.get(i);
			System.out.println(room.toString());
		}

	}

}
