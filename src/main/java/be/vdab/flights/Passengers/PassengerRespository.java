package be.vdab.flights.Passengers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdabcursist on 12/09/2017.
 */


@Repository  //meer dan alleen maar component; component + extras voor respisotory
public class PassengerRespository {
    private List<Passenger> passengers = new ArrayList<>();
    private List<String> pass = new ArrayList<>();





    public PassengerRespository() {
        passengers.add(new Passenger("jimi", "Hendrix"));
        passengers.add(new Passenger("Janis", "Joplin"));
        passengers.add(new Passenger("Amy","Winehouse"));
        passengers.add(new Passenger("Kurt", "cobin"));
        passengers.add(new Passenger("Jim", "Morison"));
        System.out.println("De PassengerRespisotory wordt aangemaakt");
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public String findAll(){
        pass.add("jimi");
        pass.add("Janis");
        pass.add("Amy");
        pass.add("Kurt");
        pass.add("Jim");
        return pass.toString();
    }

    public Passenger readById(int Id){

        return passengers.get(Id);
    }


}
