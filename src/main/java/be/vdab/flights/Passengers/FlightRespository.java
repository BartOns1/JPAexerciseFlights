package be.vdab.flights.Passengers;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdabcursist on 12/09/2017.
 */
@Repository
public class FlightRespository {
    private List<Flight> flights = new ArrayList<>();

    public FlightRespository() {
        flights.add(new Flight("ABX 215"));
        flights.add(new Flight("ABS 788"));
        flights.add(new Flight("vik 514"));
        flights.add(new Flight("vik 544"));
        System.out.println("FlightResposotory wordt aangemaakt");
    }

    public Flight readId(int Id) {
        //public Flight queryByFlightNumber(String flightnumber)
        // select f from Flight f where f.number = : flightnumber
        return flights.get(Id);//fake object for now
    }
}
