package com.servey.backend.repository;

import com.servey.backend.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
//this is empty because there's no need for any basic instructions, only a way to hold data
}
