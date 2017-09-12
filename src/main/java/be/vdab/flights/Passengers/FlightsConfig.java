package be.vdab.flights.Passengers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by vdabcursist on 12/09/2017.
 */

@Configuration
public class FlightsConfig {

    @Bean //(name = "other Name")
    public String myCoolBean(){
        return "Cool Bean";
    }

    @Bean
    public String myOtherBean(){
        return "Something else";
    }

    @Bean
    public PassengerService myPassengerService(){
        return new PassengerService();
    }

    @Bean
    public PassengerRespository myPassengerRespository(){
        return new PassengerRespository();
    }

}
