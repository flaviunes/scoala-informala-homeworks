import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;


public class Main {
	/**
	 * This is the main method , where each method is called on an
	 * AthletesManager object.
	 */
	private static final String FILENAME = "src\\AthletesList.csv";

	public static void main(String[] args) throws IOException {
		File file = new File(FILENAME);
		AthletesManager manager = new AthletesManager(Files.newBufferedReader(file.toPath()));

		manager.readFromReader();
		System.out.println("Athteles final timers before penalty :\n");
		manager.printAthletes();
		manager.calculateFinalTime();
		System.out.println();
		System.out.println("Athteles final timers after penalty :\n");
		manager.printAthletes();

		System.out.println("\nAthteles final standings :");
		System.out.println("Winner :" + manager.athletesInOrder().get(0));
		System.out.println(manager.athletesInOrder().get(1));
		System.out.println(manager.athletesInOrder().get(2));

	}
}
