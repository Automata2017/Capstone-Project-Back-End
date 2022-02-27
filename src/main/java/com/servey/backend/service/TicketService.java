package com.servey.backend.service;

import com.servey.backend.model.Ticket;
import com.servey.backend.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TicketService {
    private TicketRepository ticketRepository;

    @Autowired
    public void setTicketRepository(TicketRepository ticketRepository){
        this.ticketRepository = ticketRepository;
    }

    public Ticket createTicket(Ticket ticketObject){
        return ticketRepository.save(ticketObject);
    }

    public List<Ticket> getAllTickets(){
        return ticketRepository.findAll();
    }


}
