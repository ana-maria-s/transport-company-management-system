package com.project.domain.load;

import static org.junit.Assert.assertSame;

import com.project.domain.load.helper.Ticket;
import org.junit.Test;

public class PassengerTest {

    @Test
    public void testConstructor() {
        Passenger actualPassenger = new Passenger("Jane", "Doe", 1, new Ticket(10, 10));
        Ticket ticket = new Ticket(10, 10);

        actualPassenger.setTicket(ticket);
        assertSame(ticket, actualPassenger.getTicket());
    }
}

