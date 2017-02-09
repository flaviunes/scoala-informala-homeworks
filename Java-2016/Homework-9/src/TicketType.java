
import java.util.Random;

/**
 * This is an enum which has all the possible ticket types.
 * 
 * @author Flaviu
 *
 */

public enum TicketType {
	FULL, FULLVIP, FREEPASS, ONEDAY, ONEDAYVIP;

	private static final Random RANDOM = new Random();

	/**
	 * This method generates one random value from the enum , when it's called
	 * on ticket type.
	 * 
	 * @return
	 */
	public static TicketType randomTicketType() {
		return values()[RANDOM.nextInt(values().length)];

	}

}