package be.vdab.flights_passengers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by vdabcursist on 14/09/2017.
 */
@Controller
public class MyTicketController {
    @RequestMapping("tickets.html")
     public String myblaTickets(){
        //todo
        return "myTicketList";
    }
}
