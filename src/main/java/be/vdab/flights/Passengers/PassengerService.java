package be.vdab.flights.Passengers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vdabcursist on 12/09/2017.
 */


@Service //= @Component + extra's vor service layer
public class PassengerService {
    @Autowired
    private PassengerRespository pr;

    public String getAll() {
        System.out.println("get all inside passenger service");
        return pr.findAll();


       /* List<String> passengers = new ArrayList<>();
        passengers.add("jimi");
        passengers.add("Janis");
        passengers.add("Amy");
        passengers.add("Kurt");
        passengers.add("Jim");
        return passengers;*/
    }


    public Passenger getPassengerById(int Id){
        return pr.readById(Id);
    }

}
