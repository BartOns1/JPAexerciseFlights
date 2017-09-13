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

/*
		Ticket t1 = rs.bookTicketForFlight(2,456,3);
		System.out.println("Het aangemaakte ticket is" + t1);

		Ticket t2 = rs.bookTicketForFlight(1,500,1);
		System.out.println("Het aangemaakte ticket is" + t2);

		Ticket t3 = rs.bookTicketForFlight(4,400,3);
		System.out.println("Het aangemaakte ticket is" + t3);

		tickets = (rs.ts.tr.getTickets());
		for(Ticket t:tickets){
			System.out.println(t.toString());
		}*/


		Passenger p = new Passenger("Jimi","Hendrix", 157);
		pr.save(p);
		p = new Passenger("Jhon","postland", 157);
		pr.save(p);
		p = new Passenger("Aliondra","vintag", 157);
		pr.save(p);
		p = new Passenger("Bindokov","Alexindirg", 157);
		pr.save(p);
		p = new Passenger("The","Donn", 157);
		pr.save(p);


		Flight f = new Flight("AB546F","Brussel", "Wenen");
		fr.save(f);
		f = new Flight("JKL2F","Brussel", "Amsterdam");
		fr.save(f);
		f = new Flight("IKS55","Brussel", "Tokio");
		fr.save(f);


		Ticket t = new Ticket(pr.readById(1),500,fr.readId(2));
		tr.save(t);


	}
}
