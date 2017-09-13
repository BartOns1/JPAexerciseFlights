package be.vdab.flights.Passengers;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

/**
 * Created by vdabcursist on 12/09/2017.
 */

@Entity
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique=true, nullable = false)
    private String flightName;

    @Column(nullable=false)
    private String departure;

    @Column(nullable=false)
    private String destination;

    public Flight(String flightName, String departure, String destination) {
        this.flightName = flightName;
        this.departure = departure;
        this.destination = destination;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    @Override
    public String toString() {
        return "flight " + flightName ;
    }

    public Integer getId() {
        return id;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
