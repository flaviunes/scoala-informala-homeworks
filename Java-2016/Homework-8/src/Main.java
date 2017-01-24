
public class Main {
	/**
	 * This is the main method , where each method is called on a manager
	 * object.
	 */
	private static final String FILENAME = "src\\AthletsList.csv";

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
