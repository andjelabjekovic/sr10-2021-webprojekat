package com.ftn.PrviMavenVebProjekat.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ftn.PrviMavenVebProjekat.model.Uloga;

@Repository
public interface UlogaDAO extends CrudRepository<Uloga, Long> {
	

}
