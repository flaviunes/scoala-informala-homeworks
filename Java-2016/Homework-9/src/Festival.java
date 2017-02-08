import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Festival {
	private static final int NUMBER_OF_TICKETS = 100;
	private long counter;
	private long counterForFull;
	private long counterForFullVIP;
	private long counterForFreePass;
	private long counterForOneDay;
	private long counterForOneDayVIP;

	private boolean ticketValidation = false;

	public static void main(String[] args) {
		// Thread a1 = new Thread(new
		// FestivalAtendeeThread(TicketType.randomTicketType()));
		//
		// a1.start();
		Festival gate = new Festival();
		
		
		
		Thread festivalAtendees[] = new Thread[100];

		for (int i = 0; i < 100; i++) {
			festivalAtendees[i] = new Thread(new FestivalAtendeeThread(TicketType.randomTicketType()));
			festivalAtendees[i].start();
			festivalAtendees[i].setName("Festival Atendee" + (1 + i));
			System.out.println("\n" + festivalAtendees[i].getName());

			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		

		}
		
		

		// Festival gate = new Festival();
		// List<Thread> festivalAtendees = new LinkedList<>();
		//
		// for (int i = 0; i < 10; i++) {
		// Thread thread = new Thread(gate.new CounterIncrementer());
		// // thread.setDaemon(true);
		// festivalAtendees.add(thread);
		// thread.start();
		// }
		//
		// for (Thread thread : festivalAtendees) {
		// try {
		// thread.join();
		// } catch (Exception ex) {
		//
		// }
		// }

		// TicketType ticketType = TicketType.randomTicketType();
		//
		// ArrayList<Ticket> tickets = new ArrayList<>();
		//
		// for (int i = 0; i < NUMBER_OF_TICKETS; i++) {
		// Ticket ticket = new Ticket(TicketType.randomTicketType());
		// ticket.validateTicket();
		// tickets.add(ticket);
		// System.out.println(ticket);
		// }

	}

	synchronized long getCounter() {
		return counter;
	}

	void increment() {
		synchronized (this) {
			counter = counter + 1;
		}
	}

	public synchronized boolean validateTicket() {
		return ticketValidation = true;
	}

	class CounterIncrementer implements Runnable {

		@Override
		public void run() {
			try {
				Thread.sleep(1000);
			} catch (Exception ex) {

			}
			System.out.println(Thread.currentThread().getName() + ":" + getCounter());
			increment();
			System.out.println(Thread.currentThread().getName() + ":" + getCounter());

		}

	}
}
