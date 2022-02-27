package com.servey.backend.repository;

import com.servey.backend.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    Ticket findByFullNameAndEmailAddress(String fullName, Long emailAddress);
    Ticket findById (long id);

    @Override
    List<Ticket> findAllById(Iterable<Long> longs);
}
