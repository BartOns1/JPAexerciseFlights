package be.vdab.flights.Passengers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(Application.class, args);
		String s = ac.getBean("myOtherBean",String.class);

		System.out.println(s);


		PassengerService ps = ac.getBean(PassengerService.class);
		System.out.println(ps.findAll());

		PassengerRespository pr = ac.getBean(PassengerRespository.class);
		System.out.println(pr.findAll());
	}




}
