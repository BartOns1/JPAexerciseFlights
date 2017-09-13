package be.vdab.flights.Passengers;

import javax.persistence.*;

/**
 * Created by vdabcursist on 12/09/2017.
 */

@Entity
public class Passenger {


    String firstName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable=false)
    String lastName;

    @Column(name="BonusMyles")
    private int frequentFlyerMyles;



    public Passenger(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public Passenger(String firstName, String lastName, int frequentFlyerMyles) {
        new Passenger(firstName,lastName);
        this.frequentFlyerMyles=frequentFlyerMyles;
    }

    public int getId() {
        return id;
    }

    public int getFrequentFlyerMyles() {
        return frequentFlyerMyles;
    }

    public void setFrequentFlyerMyles(int fequentFlyerMyles) {
        this.frequentFlyerMyles = fequentFlyerMyles;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String fullName(){
        return firstName + " " + lastName;
    }

    @Override
    public String
    toString() {
        return fullName();
    }
}
