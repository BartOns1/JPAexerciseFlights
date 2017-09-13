package be.vdab.flights_passengers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class Application {
//een voorbeeld met een persistence (respository), service en presentation layer, maar de presentation layer ontbreekt en dedatabase is voorlopig vervangen door listings
	public static void main(String[] args) {
		List<Ticket> tickets = new ArrayList<>();

		ApplicationContext ac = SpringApplication.run(Application.class, args);

		//PassengerService ps = ac.getBean(PassengerService.class);
		//List<String> all = ps.getAll();

		PassengerRespository pr = ac.getBean(PassengerRespository.class);
		System.out.println(pr.findAll());

		FlightRespository fr = ac.getBean(FlightRespository.class);

		ReservationService rs = ac.getBean(ReservationService.class);

		TicketRespository tr = ac.getBean(TicketRespository.class);

		FlightService fs = ac.getBean(FlightService.class);

		PassengerService ps = ac.getBean(PassengerService.class);

		Passenger p = new Passenger("Jimi","Hendrix", 157);
		pr.save(p);
		p = new Passenger("Jhon","postland", 157);
		pr.save(p);
		p = new Passenger("Aliondra","vintag", 157);
		pr.save(p);
		p = new Passenger("Bindokov","Alexindirg", 157);
		pr.save(p);
		p = new Passenger("The","Donn", 157);
		ps.addPassenger(p);


		Flight f = new Flight("AB546F","Brussel", "Wenen");
		fr.save(f);
		f = new Flight("JKL2F","Brussel", "Amsterdam");
		fr.save(f);
		f = new Flight("IKS55","Brussel", "Tokio");
		fr.save(f);
		f = new Flight("JET778","Charleroi", "Bonn");
        fs.persist(f);

		rs.bookTicketForFlight(1,550,1);


	}
}
