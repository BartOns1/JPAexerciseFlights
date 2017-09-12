package be.vdab.flights.Passengers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdabcursist on 12/09/2017.
 */
public class PassengerService {
    public PassengerService(){
        System.out.println("Passenger wordt nu aangemaakt");
    }

    public List<String> findAll() {
        List<String> passengers = new ArrayList<>();
        passengers.add("jimi");
        passengers.add("Janis");
        passengers.add("Amy");
        passengers.add("Kurt");
        passengers.add("Jim");
        return passengers;
    }

}
