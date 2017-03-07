
/**
 * This is the package class with the constructor , setters , getters and a constant , value per KM.
 */
import java.time.LocalDate;

public class Package {

	private static final double VALUE_PER_KM = 0.15;

	private String targetLocation;
	private double distance;
	private double merchendiseValue;
	private LocalDate deliveryDate;
	private boolean isDelivered;

	public Package(String targetLocation, double distance, double merchendiseValue, LocalDate deliveryDate) {
		super();
		this.targetLocation = targetLocation;
		this.distance = distance;
		this.merchendiseValue = merchendiseValue;
		this.deliveryDate = deliveryDate;
	}

	public String getTargetLocation() {
		return targetLocation;
	}

	public double getDistance() {
		return distance;
	}

	public double getMerchendiseValue() {
		return merchendiseValue;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public boolean isDelivered() {
		return isDelivered;
	}

	public void setDelivered(boolean isDelivered) {
		this.isDelivered = isDelivered;
	}

	public double calculateMerchediseProfit() {
		return distance * VALUE_PER_KM;

	}

	@Override
	public String toString() {
		return "This package generated a profit of " + calculateMerchediseProfit()
				+ " lei, and it was succesfully delivered by" + Thread.currentThread().getName() + "!";
	}

}
