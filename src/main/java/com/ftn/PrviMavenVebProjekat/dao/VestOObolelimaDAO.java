package com.ftn.PrviMavenVebProjekat.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ftn.PrviMavenVebProjekat.model.VestOObolelima;

@Repository
public interface VestOObolelimaDAO extends CrudRepository< VestOObolelima, Long> {

}