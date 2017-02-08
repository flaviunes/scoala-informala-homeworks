
public class FestivalGate implements Runnable {
	private boolean ticketValidation = false;
	private long counter;

	public synchronized boolean validateTicket() {
		return ticketValidation = true;
	}
	
	public synchronized long getCounter() {
		return counter;
	}

	public synchronized long incrementCounter() {
		return counter = counter + 1;
	}

	@Override
	public void run() {

		validateTicket();
		incrementCounter();
	}
}
