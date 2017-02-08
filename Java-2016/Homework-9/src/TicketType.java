
import java.util.Random;

public enum TicketType {
	FULL, FULLVIP, FREEPASS, ONEDAY, ONEDAYVIP;

	private static final Random RANDOM = new Random();

	public static TicketType randomTicketType() {
		return values()[RANDOM.nextInt(values().length)];

	}

}
