package com.servey.backend.controller;

import com.servey.backend.model.Ticket;
import com.servey.backend.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class TicketController {

    private TicketService ticketService;

    @Autowired
    public void setTicketService(TicketService ticketService){
        this.ticketService = ticketService;
    }

    @GetMapping("/hello-world/")
    public String helloWorld() {return "Hello World";}

    @GetMapping("/tickets/")
    public List<Ticket> getAllTickets(){
        System.out.println("getting all tickets");
        return ticketService.getAllTickets();
    }

    @PostMapping("/tickets/")
    public Ticket createTicket(@RequestBody Ticket ticketObject) {
        System.out.println();
        return ticketService.createTicket(ticketObject);


    }

}
