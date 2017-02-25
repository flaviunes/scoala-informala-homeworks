
import java.util.List;

/**
 * This is the main class with the main method , where we populate the tables
 * with data through accommodation and room fair objects
 * 
 * @author Flaviu
 *
 */
public class Main {

	public static void main(String[] args) {

		AccomodationDAO accomodationDAO = new AccomodationDAO();
		RoomFairDAO rFairDAO = new RoomFairDAO();
		List<Accomodation> accomodations = accomodationDAO.getAll();
		List<RoomFair> roomFairs = rFairDAO.getAll();

		Accomodation acc = new Accomodation();
		acc.setType("single");
		acc.setBedType("1-person");
		acc.setMaxGuests(1);
		acc.setDescription("This is a room with garden view!");

		accomodationDAO.add(acc);
		accomodations = accomodationDAO.getAll();
		System.out.println(accomodations);

		RoomFair rf1 = new RoomFair();
		rf1.setValue(50);
		rf1.setSeason("Winter");

		rFairDAO.add(rf1);

		roomFairs = rFairDAO.getAll();

		System.out.println(roomFairs);

	}

}
