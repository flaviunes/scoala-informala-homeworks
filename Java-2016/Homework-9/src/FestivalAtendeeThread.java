
public class FestivalAtendeeThread implements Runnable {

	public FestivalAtendeeThread(TicketType ticketType) {

	}

	@Override
	public void run() {
		Ticket ticket = new Ticket(TicketType.randomTicketType());
		System.out.println(ticket.getTicketType());

	}


}
