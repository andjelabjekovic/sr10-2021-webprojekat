package com.ftn.PrviMavenVebProjekat.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ftn.PrviMavenVebProjekat.model.Uloga;
import com.ftn.PrviMavenVebProjekat.model.Vakcina;

@Repository
public interface VakcinaDAO extends CrudRepository<Vakcina, Long> {

}
