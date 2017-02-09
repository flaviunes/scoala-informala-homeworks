/**
 * This is a class from which 100 threads are created in the main method , and
 * represents people attending to the festival , each people has a ticket and
 * interacts with a festival gate
 * 
 * @author Flaviu
 *
 */
public class FestivalAttendee implements Runnable {

	private FestivalGate gate;
	private Ticket ticket;

	public FestivalAttendee(FestivalGate gate, Ticket ticket) {
		this.gate = gate;
		this.ticket = ticket;
	}

	@Override
	public void run() {
		validateTicket(ticket);
		if (ticket.isValid()) {
			gate.allowAttendee(ticket);
		}
	}

	/**
	 * This method takes a ticket as parameter and then validates it. The
	 * validation in used in the run method.
	 * 
	 * @param ticket
	 */
	public synchronized void validateTicket(Ticket ticket) {
		ticket.setIsValid(true);
	}

}