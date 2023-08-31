package com.ftn.PrviMavenVebProjekat.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.PrviMavenVebProjekat.dao.VakcinaDAO;
import com.ftn.PrviMavenVebProjekat.dao.VestOObolelimaDAO;
import com.ftn.PrviMavenVebProjekat.model.Vakcina;
import com.ftn.PrviMavenVebProjekat.model.VestOObolelima;

@Service
public class VestOObolelimaService {

	@Autowired
	private VestOObolelimaDAO vestOObolelimaDAO ;
	
	public Iterable<VestOObolelima>findAll(){

		return vestOObolelimaDAO.findAll();
	} 
	public VestOObolelima save(VestOObolelima vestOObolelima){

		return vestOObolelimaDAO.save(vestOObolelima);
	} 
	public void delete(Long id){

		vestOObolelimaDAO.deleteById(id);
	} 
	
	public VestOObolelima findById(Long id){

		return vestOObolelimaDAO.findById(id).orElse(null);
	} 
}
