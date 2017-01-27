
public class Main {
	/**
	 * This is the main method , where each method is called on an
	 * AthletesManager object.
	 */
	private static final String FILENAME = "src\\AthletesList.csv"; //asta e private...

	public static void main(String[] args) {

		AthletesManager manager = new AthletesManager(FILENAME);

		manager.readFromFile();
		System.out.println("Athteles final timers before penalty :\n");
		manager.printAthletes();
		manager.calculateFinalTime();
		System.out.println();
		System.out.println("Athteles final timers after penalty :\n");
		manager.printAthletes();

		System.out.println("\nAthteles final standings :");
		manager.printAthletesInOrder();
	}
}
