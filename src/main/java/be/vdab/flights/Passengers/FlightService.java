package be.vdab.flights.Passengers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vdabcursist on 12/09/2017.
 */
@Service
public class FlightService {
    @Autowired
    FlightRespository fr;

    public Flight findById(int Id){
        return fr.readId(Id);
    }
}
