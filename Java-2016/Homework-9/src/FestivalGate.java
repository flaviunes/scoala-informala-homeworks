
public class FestivalGate {

	private long counterAll;
	private long counterFull;
	private long counterFullVIP;
	private long counterFreePass;
	private long counterOneDay;
	private long counterOneDayVIP;

	// TODO: Complete this switch with all ticket types, and remove the default case
	public synchronized void allowAttendee(Ticket ticket) {
		counterAll++;
		switch (ticket.getTicketType()) {
		case FULL:
			counterFull++;
			break;
		case FULLVIP:
			counterFullVIP++;
			break;
		case ONEDAY:
			counterOneDay++;
			break;
		case ONEDAYVIP:
			counterOneDayVIP++;
			break;
		case FREEPASS:
			counterFreePass++;
			break;
		}
	}
	
	public void printStatistics() {
		System.out.println("\n" + counterAll + " people entered !");
		System.out.println("\n" + counterFreePass + " have free pass !");
		System.out.println("\n" + counterFull + " people have full access !");
		System.out.println("\n" + counterFullVIP + " people have full VIP access !");
		System.out.println("\n" + counterOneDay + " people have one day access !");
		System.out.println("\n" + counterOneDayVIP + " people have one day VIP access !");
	}

}