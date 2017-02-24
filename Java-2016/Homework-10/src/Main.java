
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		AccomodationDAO accomodationDAO = new AccomodationDAO();
		List<Accomodation> accomodations = accomodationDAO.getAll();
		System.out.println(accomodations);
		
		Accomodation acc = new Accomodation();
		acc.setType("standard");
		acc.setBedType("double");
		acc.setMaxGuests(2);
		acc.setDescription("This is a room with sea view!");
	    accomodationDAO.add(acc);	
	
	    
	    accomodations = accomodationDAO.getAll();
		System.out.println(accomodations);
		

	}

}
