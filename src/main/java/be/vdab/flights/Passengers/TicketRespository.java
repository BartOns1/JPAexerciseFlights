package be.vdab.flights.Passengers;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by vdabcursist on 12/09/2017.
 */

@Repository
public class TicketRespository {
    List<Ticket> tickets = new ArrayList<>();


    public Ticket persist(Passenger p, double price, Flight f){
        Ticket t = new Ticket(p,price,f);

        System.out.println("New ticket consolidation" + t.toString());
        return t;
    };

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public boolean addTicket(Ticket t){
        return tickets.add(t);
    }

}
