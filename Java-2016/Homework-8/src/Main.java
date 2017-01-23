
public class Main {

	private static final String FILENAME = "src\\test.csv";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AthletsManager manager = new AthletsManager(FILENAME);
		manager.readFromFile();
		manager.printAthlets();
		manager.calculateFinalTime();
		System.out.println();
		manager.printAthlets();
		manager.printAthletsInOrder();
	}
}
