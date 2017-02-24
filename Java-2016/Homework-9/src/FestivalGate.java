/**
 * This class represents the festival gate in which all data about attendees and
 * tickets are hold into.
 * 
 * @author Flaviu
 *
 */
public class FestivalGate {

	private long counterAll;
	private long counterFull;
	private long counterFullVIP;
	private long counterFreePass;
	private long counterOneDay;
	private long counterOneDayVIP;

	/**
	 * This method increments counters , depending on the ticket type ,
	 * counterAll is always incremented with any type of ticket.
	 * 
	 * @param ticket
	 */
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

	/**
	 * This method prints how many festival attendees entered through the
	 * festival gate.
	 */
	public synchronized void printStatistics() {
		System.out.println("\n" + counterAll + " people entered !");
		System.out.println("\n" + counterFreePass + " have free pass !");
		System.out.println("\n" + counterFull + " people have full access !");
		System.out.println("\n" + counterFullVIP + " people have full VIP access !");
		System.out.println("\n" + counterOneDay + " people have one day access !");
		System.out.println("\n" + counterOneDayVIP + " people have one day VIP access !");
	}

	public long getCounterAll() {
		return counterAll;

	}

	public long getCounterFull() {
		return counterFull;
	}

	public long getCounterFullVIP() {
		return counterFullVIP;
	}

	public long getCounterFreePass() {
		return counterFreePass;
	}

	public long getCounterOneDay() {
		return counterOneDay;
	}

	public long getCounterOneDayVIP() {
		return counterOneDayVIP;
	}


}