
public class Statistics implements Runnable {

	private static final long POLLING_INTERVAL = 3000;

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
				Thread.sleep(POLLING_INTERVAL);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			gate.printStatistics();
		}
	}

	public void stop() {
		running = false;
	}

}