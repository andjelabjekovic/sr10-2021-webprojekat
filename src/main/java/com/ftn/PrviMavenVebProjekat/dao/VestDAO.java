package com.ftn.PrviMavenVebProjekat.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ftn.PrviMavenVebProjekat.model.Uloga;
import com.ftn.PrviMavenVebProjekat.model.Vest;

@Repository
public interface VestDAO extends CrudRepository<Vest, Long> {

}
