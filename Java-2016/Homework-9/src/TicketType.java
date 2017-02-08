
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

	public static TicketType randomTicketType() {
		return values()[RANDOM.nextInt(values().length)];

	}

}