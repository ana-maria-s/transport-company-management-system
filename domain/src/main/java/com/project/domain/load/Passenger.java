package com.project.domain.load;

import com.project.domain.load.helper.Ticket;

public class Passenger extends User{

    private Ticket ticket;
    public Passenger(String firstName, String lastName, int age, Ticket ticket) {
        super(firstName, lastName, age);
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
