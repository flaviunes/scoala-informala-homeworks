import java.util.Random;

public class Festival {

	public static void main(String[] args) {
		Random random = new Random();
		TicketType ticketType =TicketType.values()[random.nextInt(5)];//CEVA NU E BINE AICI!?!?!?!
		
		Ticket t1 = new Ticket(ticketType.randomTicketType());
		
		System.out.println(t1);

	}
}
