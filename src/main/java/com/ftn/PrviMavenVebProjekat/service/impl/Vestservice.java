package com.ftn.PrviMavenVebProjekat.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.PrviMavenVebProjekat.dao.VestDAO;
import com.ftn.PrviMavenVebProjekat.model.Vakcina;
import com.ftn.PrviMavenVebProjekat.model.Vest;

@Service
public class VestService {

	@Autowired
	private VestDAO vestDAO ;
	
	public Iterable<Vest>findAll(){

		return vestDAO.findAll();
	} 
	public Vest save(Vest vest){

		return vestDAO.save(vest);
	} 
	public void delete(Long id){

		vestDAO.deleteById(id);
	} 
	
	public Vest findById(Long id){

		return vestDAO.findById(id).orElse(null);
	} 
}
