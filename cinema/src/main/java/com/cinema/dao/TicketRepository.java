package com.cinema.dao;

import com.cinema.entities.Cinema;
import com.cinema.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface TicketRepository extends JpaRepository<Ticket,Long> {
}
