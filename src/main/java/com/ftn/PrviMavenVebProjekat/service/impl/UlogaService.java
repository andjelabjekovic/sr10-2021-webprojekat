package com.ftn.PrviMavenVebProjekat.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.PrviMavenVebProjekat.dao.UlogaDAO;
import com.ftn.PrviMavenVebProjekat.model.Uloga;

@Service
public class UlogaService {
	
	@Autowired
	private UlogaDAO ulogaDAO;
	
	public Iterable<Uloga>findAll(){

		return ulogaDAO.findAll();
	} 
	public Uloga save(Uloga uloga){

		return ulogaDAO.save(uloga);
	} 
	public void delete(Long id){

		 ulogaDAO.deleteById(id);
	} 
	
	public Uloga findById(Long id){

		return ulogaDAO.findById(id).orElse(null);
	} 

}
