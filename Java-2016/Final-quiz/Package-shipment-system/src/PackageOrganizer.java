import java.util.ArrayList;
import java.util.List;

/**
 * This is the package organizer class , where we add all packages in an array
 * 
 * @author Flaviu
 *
 */
public class PackageOrganizer {

	List<Package> packages = new ArrayList<>();

	/**
	 * This method adds packages to the array.
	 * 
	 * @param p
	 */
	public void addPackage(Package p) {

		packages.add(p);
	}

	/**
	 * This method creates a new thread for each package to deliver it.
	 */
	public void deliverPackages() {

		for (Package p1 : packages) {
			PackageDeliverer packageDeliverer = new PackageDeliverer(p1);
			new Thread(packageDeliverer).start();
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(p1.toString());
		}
	}

}
