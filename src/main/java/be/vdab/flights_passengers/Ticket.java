package be.vdab.flights_passengers;

import javax.persistence.*;

/**
 * Created by vdabcursist on 12/09/2017.
 */
@Entity
public class Ticket {

    @JoinColumn(nullable=false, name = "passenger_id")
    @ManyToOne
    private Passenger p;

    private double price;

    @JoinColumn(nullable=false)
    @ManyToOne
    private Flight flight;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Used by JPA.
     */
    Ticket(){};

    public Ticket(Passenger p, double price, Flight f) {
        this.p = p;
        this.price = price;
        this.flight = f;
    }

    public Passenger getPassenger() {
        return p;
    }

    public void setPassenger(Passenger p) {
        this.p = p;
        p.addTicket(this);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight f) {
        this.flight = f;
        p.addTicket(this);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "p=" + p +
                ", price=" + price +
                ", f=" + flight +
                '}';
    }
}