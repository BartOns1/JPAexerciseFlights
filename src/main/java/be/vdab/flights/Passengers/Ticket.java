package be.vdab.flights.Passengers;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

/**
 * Created by vdabcursist on 12/09/2017.
 */
@Entity
public class Ticket {

    @Column(nullable=false)
    private Passenger p;

    private double price;

    @Column(nullable=false)
    private Flight f;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Ticket(Passenger p, double price, Flight f) {
        this.p = p;
        this.price = price;
        this.f = f;
    }

    public Passenger getPassenger() {
        return p;
    }

    public void setPassenger(Passenger p) {
        this.p = p;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Flight getFlight() {
        return f;
    }

    public void setFlight(Flight f) {
        this.f = f;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "p=" + p +
                ", price=" + price +
                ", f=" + f +
                '}';
    }
}