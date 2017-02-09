/**
 * This class is used to create a thread which reads statistics from the
 * festival gate.
 * 
 * @author Flaviu
 *
 */
public class Statistics implements Runnable {

	private static final long READING_INTERVAL = 3000;

	private FestivalGate gate;

	private boolean running;

	public Statistics(FestivalGate gate) {
		this.gate = gate;
		running = true;
	}

	@Override
	public void run() {
		while (running) {
			try {
				Thread.sleep(READING_INTERVAL);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			gate.printStatistics();
		}
	}

	/**
	 * This method tells the statistics thread to stop . It is used in the main
	 * method after all festival attendees entered through the festival gate.
	 */
	public void stop() {
		running = false;
	}

}