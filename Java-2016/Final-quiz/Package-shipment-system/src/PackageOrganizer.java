import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		Map<String, List<Package>> organizedPackages = organizePackages();
		for (List<Package> packages : organizedPackages.values()) {
			PackageDeliverer packageDeliverer = new PackageDeliverer(packages);
			new Thread(packageDeliverer).start();
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * This method creates a new map with a string as a key , the string is made
	 * of targetLocation + deliveryDate , and the value is an array of packages.
	 * 
	 */
	private Map<String, List<Package>> organizePackages() {
		Map<String, List<Package>> organizedPackages = new HashMap<>();
		for (Package currentPackage : packages) {
			String packageKey = getPackageKey(currentPackage);
			List<Package> currentDatePackages = organizedPackages.get(packageKey);
			if (currentDatePackages == null) {
				currentDatePackages = new ArrayList<>();
				organizedPackages.put(packageKey, currentDatePackages);
			}
			currentDatePackages.add(currentPackage);
		}
		return organizedPackages;
	}

	/**
	 * This method merges the location and date in a String , and it will be
	 * used as a key in the map.
	 * 
	 * @param p
	 * @return
	 */
	private String getPackageKey(Package p) {
		return p.getTargetLocation() + p.getDeliveryDate().toEpochDay();
	}

}
