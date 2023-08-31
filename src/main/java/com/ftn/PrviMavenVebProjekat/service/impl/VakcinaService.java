package com.ftn.PrviMavenVebProjekat.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.PrviMavenVebProjekat.dao.ProizvodjacDAO;
import com.ftn.PrviMavenVebProjekat.dao.VakcinaDAO;
import com.ftn.PrviMavenVebProjekat.model.Proizvodjac;
import com.ftn.PrviMavenVebProjekat.model.Vakcina;

@Service
public class VakcinaService {
	
	@Autowired
	private VakcinaDAO vakcinaDAO ;
	
	public Iterable<Vakcina>findAll(){

		return vakcinaDAO.findAll();
	} 
	public Vakcina save(Vakcina vakcina){

		return vakcinaDAO.save(vakcina);
	} 
	public void delete(Long id){

		vakcinaDAO.deleteById(id);
	} 
	
	public Vakcina findById(Long id){

		return vakcinaDAO.findById(id).orElse(null);
	} 

}
