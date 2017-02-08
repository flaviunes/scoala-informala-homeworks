
public class Ticket {
	private TicketType ticketType;
	private boolean ticketValidation = false;

	public Ticket(TicketType ticketType) {
		this.ticketType = ticketType;

	}

	@Override
	public String toString() {

		return ticketType.toString();
	}

	public TicketType getTicketType() {
		return ticketType;
	}

	public boolean validateTicket() {
		return ticketValidation = true;
	}

}
