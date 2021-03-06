package org.sid.cinema.entities;

import org.springframework.data.rest.core.config.Projection; // Personaliser_SpringDataRest





@Projection(name = "ticketProj", types = Ticket.class)
public interface TicketProj {
	
	public Long getId();
	public String getNomClient();
	public double  getPrix();
	public Integer getCodePayement();
	public boolean getReserve();
	public Place getPlace();
	
}
