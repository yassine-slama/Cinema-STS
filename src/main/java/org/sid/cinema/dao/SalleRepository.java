package org.sid.cinema.dao;

import java.util.List;

import org.sid.cinema.entities.Cinema;
import org.sid.cinema.entities.Salle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;



@RepositoryRestResource
@CrossOrigin("*")
public interface SalleRepository extends JpaRepository<Salle, Long> {
	public List<Salle> findByCinema(Cinema c);
	public Salle findOneById(Long id);
}
