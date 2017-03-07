/**
 * This is a class which implements runnable , and this class is used to deliver
 * packages with diffrent deliverer.
 * 
 * @author Flaviu
 *
 */
public class PackageDeliverer implements Runnable {
	private Package p;

	public PackageDeliverer(Package p) {
		this.p = p;
	}

	@Override
	public void run() {
		if (p.isDelivered() == false) {
			deliverPackage(p);
		}

	}

	/**
	 * This method is called in the run method of this class.
	 * 
	 * @param p
	 */
	public void deliverPackage(Package p) {
		p.setDelivered(true);
	}

}
