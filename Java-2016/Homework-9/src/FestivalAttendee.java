
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

	public synchronized void validateTicket(Ticket ticket) {
		ticket.setIsValid(true);
	}

}