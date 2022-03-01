package com.servey.backend.controller;

import com.servey.backend.model.Ticket;
import com.servey.backend.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin(origins = "http://localhost:4200")
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

    @GetMapping("/tickets/{ticketId}/")
    public Optional<Ticket> getTicket(@PathVariable(value = "ticketId") Long ticketId){
        return ticketService.getTicket(ticketId);
    }

    @PostMapping("/tickets/")
    public Ticket createTicket(@RequestBody Ticket ticketObject) {
        System.out.println();
        return ticketService.createTicket(ticketObject);
    }


}
