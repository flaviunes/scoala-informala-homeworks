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

	private int value = 0;
	private int profit = 0;

	public PackageDeliverer(List<Package> packages) {
		this.packages = packages;
	}

	@Override
	public void run() {
		for (Package currentPackage : packages) {
			if (currentPackage.isDelivered() == false) {
				deliverPackage(currentPackage);
			}
			this.profit += currentPackage.calculateMerchediseProfit();
			this.value += currentPackage.getMerchendiseValue();
			System.out.println("The value of delivered packages for " + packages.get(0).getTargetLocation()
					+ " by " + Thread.currentThread().getName() + " is: " + value + "RON");
			System.out.println("The profit of delivered packages for " + packages.get(0).getTargetLocation()
					+ " by " + Thread.currentThread().getName() + " is: " + profit + "RON");

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
