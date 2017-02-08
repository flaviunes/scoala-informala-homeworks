
public class Festival {

	private static final int NUMBER_OF_ATTENDEES = 100;

	public static void main(String[] args) {
		FestivalGate gate = new FestivalGate();

		Statistics statistics = new Statistics(gate);
		new Thread(statistics).start();

		for (int i = 0; i < NUMBER_OF_ATTENDEES; i++) {
			FestivalAttendee attendee = new FestivalAttendee(gate, Ticket.createRandomTicket());
			new Thread(attendee).start();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		statistics.stop();
	}

}
