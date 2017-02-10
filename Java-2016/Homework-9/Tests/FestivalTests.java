import org.junit.Test;

import junit.framework.Assert;

public class FestivalTests {

	@Test
	public void testingCounter() {

		// given
		Ticket t1 = new Ticket(TicketType.FULL);
		Ticket t2 = new Ticket(TicketType.FREEPASS);
		FestivalGate gate = new FestivalGate();
		FestivalAttendee attendant1 = new FestivalAttendee(gate, t1);
		FestivalAttendee attendant2 = new FestivalAttendee(gate, t2);
		// when
		gate.allowAttendee(t1);
		gate.allowAttendee(t2);
		// then
		long counterAllAfterGate = 2;

		Assert.assertEquals(counterAllAfterGate, gate.getCounterAll());

	}

	@Test
	public void testingASpecificCounter() {

		// given
		Ticket t1 = new Ticket(TicketType.FULL);
		Ticket t2 = new Ticket(TicketType.FREEPASS);
		FestivalGate gate = new FestivalGate();
		FestivalAttendee attendant1 = new FestivalAttendee(gate, t1);
		FestivalAttendee attendant2 = new FestivalAttendee(gate, t2);
		// when
		gate.allowAttendee(t1);
		gate.allowAttendee(t2);
		// then
		long counterForFullAfterValidation = 1;

		Assert.assertEquals(counterForFullAfterValidation, gate.getCounterFull());

	}

	@Test
	public void testingTwoCounters() {

		// given
		Ticket t1 = new Ticket(TicketType.FULL);
		Ticket t2 = new Ticket(TicketType.FREEPASS);
		Ticket t3 = new Ticket(TicketType.FREEPASS);
		FestivalGate gate = new FestivalGate();
		FestivalAttendee attendee1 = new FestivalAttendee(gate, t1);
		FestivalAttendee attendee2 = new FestivalAttendee(gate, t2);
		FestivalAttendee attendee3 = new FestivalAttendee(gate, t3);
		// when
		gate.allowAttendee(t1);
		gate.allowAttendee(t2);
		gate.allowAttendee(t3);
		// then
		long counterForFreePassAfterValidation = 2;
		long counterAllAfterGate = 3;

		Assert.assertEquals(counterForFreePassAfterValidation, gate.getCounterFreePass());
		Assert.assertEquals(counterAllAfterGate, gate.getCounterAll());

	}
	
	@Test
	public void testingIfNooneIsValidatingTicket() {

		// given
		Ticket t1 = new Ticket(TicketType.FULL);
		Ticket t2 = new Ticket(TicketType.FREEPASS);
		FestivalGate gate = new FestivalGate();
		FestivalAttendee attendant1 = new FestivalAttendee(gate, t1);
		FestivalAttendee attendant2 = new FestivalAttendee(gate, t2);
		// when

		// then
		long counterAllAfterGate = 0;

		Assert.assertEquals(counterAllAfterGate, gate.getCounterAll());

	}

}
