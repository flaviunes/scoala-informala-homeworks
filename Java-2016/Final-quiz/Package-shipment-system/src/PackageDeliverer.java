import java.util.List;

/**
 * This is a class which implements runnable , and this class is used to deliver
 * packages with different deliverer.
 * 
 * @author Flaviu
 *
 */
public class PackageDeliverer implements Runnable {

	private List<Package> packages;

	public PackageDeliverer(List<Package> packages) {
		this.packages = packages;
	}

	@Override
	public void run() {
		for (Package currentPackage : packages) {
			if (currentPackage.isDelivered() == false) {
				deliverPackage(currentPackage);
			}
		}
	}

	/**
	 * This method is called in the run method of this class.
	 * 
	 * @param p
	 */
	public void deliverPackage(Package p) {
		System.out.println(p.toString());
		p.setDelivered(true);
	}

}
