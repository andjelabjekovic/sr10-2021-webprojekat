package com.ftn.PrviMavenVebProjekat.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.PrviMavenVebProjekat.dao.KorisnikDAO;
import com.ftn.PrviMavenVebProjekat.dao.ProizvodjacDAO;
import com.ftn.PrviMavenVebProjekat.model.Korisnik;
import com.ftn.PrviMavenVebProjekat.model.Proizvodjac;

@Service
public class ProizvodjacService {
	
	@Autowired
	private ProizvodjacDAO proizvodjacDAO ;
	
	public Iterable<Proizvodjac>findAll(){

		return proizvodjacDAO.findAll();
	} 
	public Proizvodjac save(Proizvodjac korisnik){

		return proizvodjacDAO.save(korisnik);
	} 
	public void delete(Long id){

		proizvodjacDAO.deleteById(id);
	} 
	
	public Proizvodjac findById(Long id){

		return proizvodjacDAO.findById(id).orElse(null);
	} 

}
