import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum TicketType {
	FULL, FULLVIP, FREEPASS, ONEDAY, ONEDAYVIP;

	private final List<TicketType> TYPES = Collections.unmodifiableList(Arrays.asList(values()));

	public final int SIZE = TYPES.size();

	private final Random RANDOM = new Random();

	public TicketType randomTicketType() {
		return TYPES.get(RANDOM.nextInt(SIZE));
	}

}
