package be.vdab.flights.Passengers;

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

		ReservationService rs = ac.getBean(ReservationService.class);
		Ticket t1 = rs.bookTicketForFlight(2,456,3);
		System.out.println("Het aangemaakte ticket is" + t1);

		Ticket t2 = rs.bookTicketForFlight(1,500,1);
		System.out.println("Het aangemaakte ticket is" + t2);

		Ticket t3 = rs.bookTicketForFlight(4,400,3);
		System.out.println("Het aangemaakte ticket is" + t3);

		tickets = (rs.ts.tr.tickets);
		for(Ticket t:tickets){
			System.out.println(t.toString());
		}
	}
}
