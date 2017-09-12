package be.vdab.flights.Passengers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdabcursist on 12/09/2017.
 */
public class PassengerRespository {
    private List<String> passengers = new ArrayList<>();

    public List<String> findAll(){
        passengers.add("jimi");
        passengers.add("Janis");
        passengers.add("Amy");
        passengers.add("Kurt");
        passengers.add("Jim");
        return passengers;
    }

}
