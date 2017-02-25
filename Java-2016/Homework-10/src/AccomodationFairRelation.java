/**
 * setters and getters for accommodation fair relation table 
 * @author Flaviu
 *
 */
public class AccomodationFairRelation {
	
	private int id;
	private int idAccomodation;
	private int idRoomFair;
	
	
	public int getId() {
		return id;
	}
	public int getIdAccomodation() {
		return idAccomodation;
	}
	public int getIdRoomFair() {
		return idRoomFair;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setIdAccomodation(int idAccomodation) {
		this.idAccomodation = idAccomodation;
	}
	public void setIdRoomFair(int idRoomFair) {
		this.idRoomFair = idRoomFair;
	}
	
	
	
//	- accomodation_fair_relation: cu urmatoarele coloane:
//	    -- id: int (primary key)
//	    -- id_accomodation: int (foreign key of accomodation)
//	    -- id_room_fair: int (foreign key of room fair)

}
