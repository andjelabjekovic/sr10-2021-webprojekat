package com.ftn.PrviMavenVebProjekat.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.PrviMavenVebProjekat.dao.KorisnikDAO;
import com.ftn.PrviMavenVebProjekat.dao.UlogaDAO;
import com.ftn.PrviMavenVebProjekat.model.Korisnik;
import com.ftn.PrviMavenVebProjekat.model.Uloga;

@Service
public class KorisnikService {
	
	@Autowired
	private KorisnikDAO korisnikDAO;
	
	public Iterable<Korisnik>findAll(){

		return korisnikDAO.findAll();
	} 
	public Korisnik save(Korisnik korisnik){

		return korisnikDAO.save(korisnik);
	} 
	public void delete(Long id){

		korisnikDAO.deleteById(id);
	} 
	
	public Korisnik findById(Long id){

		return korisnikDAO.findById(id).orElse(null);
	} 


}
