
public class Main {
	/**
	 * This is the main method , where each method is called on an
	 * AthletesManager object.
	 */
	private static final String FILENAME = "src\\AthletesList.csv";

	public static void main(String[] args) {

		AthletesManager manager = new AthletesManager(FILENAME);

		manager.readFromFile();
		manager.printAthlets();
		manager.calculateFinalTime();
		System.out.println();
		manager.printAthlets();
		manager.printAthletsInOrder();
	}
}
