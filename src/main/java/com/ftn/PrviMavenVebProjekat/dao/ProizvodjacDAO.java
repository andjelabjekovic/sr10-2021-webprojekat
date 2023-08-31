package com.ftn.PrviMavenVebProjekat.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ftn.PrviMavenVebProjekat.model.Proizvodjac;
import com.ftn.PrviMavenVebProjekat.model.Uloga;

@Repository
public interface ProizvodjacDAO extends CrudRepository<Proizvodjac, Long> {

}
