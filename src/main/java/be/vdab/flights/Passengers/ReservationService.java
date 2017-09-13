package be.vdab.flights.Passengers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vdabcursist on 12/09/2017.
 */
@Service
public class ReservationService {
    @Autowired
    FlightService fs;

    @Autowired
    TicketService ts;

    @Autowired
    PassengerService ps;

    public Ticket bookTicketForFlight(int passengerId, double price, int flightId){

        ts.addTicket(ts.tr.tickets,new Ticket(ps.getPassengerById(passengerId),price, fs.findById(flightId)));

        return ts.create(fs.findById(flightId), price, ps.getPassengerById(passengerId));
    }


}
