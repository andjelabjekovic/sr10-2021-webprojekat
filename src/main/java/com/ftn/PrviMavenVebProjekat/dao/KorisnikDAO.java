package com.ftn.PrviMavenVebProjekat.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ftn.PrviMavenVebProjekat.model.Korisnik;

@Repository
public interface KorisnikDAO extends CrudRepository<Korisnik, Long> {

}
