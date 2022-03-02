package com.servey.backend.service;

import com.servey.backend.exceptions.TicketExceptions;
import com.servey.backend.model.Ticket;
import com.servey.backend.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TicketService {
    private TicketRepository ticketRepository;
//defines the programs with gets all, gets one, put
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

    public Optional<Ticket> getTicket(Long ticketId){

        Optional<Ticket> ticket = ticketRepository.findById(ticketId);
        if(ticket.isPresent()) {
            return ticket;
        }else{
            throw new TicketExceptions("ticket does not exist"); //a response for if a ticket doesn't exist
        }
    }


}
