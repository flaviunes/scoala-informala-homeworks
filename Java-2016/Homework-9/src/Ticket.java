
public class Ticket {

	private TicketType ticketType;
	private boolean isValid;

	public static Ticket createRandomTicket() {
		return new Ticket(TicketType.randomTicketType());
	}

	public Ticket(TicketType ticketType) {
		this.ticketType = ticketType;
	}

	public TicketType getTicketType() {
		return ticketType;
	}

	public void setIsValid(boolean isValid) {
		this.isValid = isValid;
	}

	public boolean isValid() {
		return isValid;
	}

}