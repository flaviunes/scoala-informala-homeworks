import java.time.LocalDate;

/**
 * This is the main class with main method.
 * 
 * @author Flaviu
 *
 */
public class Main {

	public static void main(String[] args) {

		PackageOrganizer po = new PackageOrganizer();

		Package package1 = new Package("Cluj-Napoca", 18.5, 20, LocalDate.of(2017, 3, 10));
		Package package2 = new Package("Turda", 30.44, 150.7, LocalDate.of(2017, 3, 11));
		Package package3 = new Package("Brasov", 250.5, 208, LocalDate.of(2017, 3, 12));
		Package package4 = new Package("Cluj-Napoca", 13, 88, LocalDate.of(2017, 3, 10));
		Package package5 = new Package("Timisoara", 310, 60.99, LocalDate.of(2017, 3, 11));
		Package package6 = new Package("Cluj-Napoca", 20, 31, LocalDate.of(2017, 3, 20));
		Package package7 = new Package("Oradea", 156.6, 47.8, LocalDate.of(2017, 3, 25));

		po.addPackage(package1);
		po.addPackage(package2);
		po.addPackage(package3);
		po.addPackage(package4);
		po.addPackage(package5);
		po.addPackage(package6);
		po.addPackage(package7);

		po.deliverPackages();

	}

}
