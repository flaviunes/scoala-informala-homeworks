/**
 * This is the class with main method , where a gate of type festival gate is
 * created and 100 threads (festival atendees). There is also a statistics
 * thread created , which reads from festival gate.
 * 
 * @author Flaviu
 *
 */
public class Festival {

	private static final int NUMBER_OF_ATTENDEES = 100;

	/**
	 * In the main method , a gate is created , statistics thread starts , and
	 * for each festival attendee a random ticket type is given , then a thread
	 * is created and started.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		FestivalGate gate = new FestivalGate();

		Statistics statistics = new Statistics(gate);
		new Thread(statistics).start();

		for (int i = 0; i < NUMBER_OF_ATTENDEES; i++) {
			FestivalAttendee attendee = new FestivalAttendee(gate, Ticket.createRandomTicket());
			new Thread(attendee).start();
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		statistics.stop();
	}

}
