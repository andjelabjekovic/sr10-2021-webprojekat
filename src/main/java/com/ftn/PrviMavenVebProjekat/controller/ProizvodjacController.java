package com.ftn.PrviMavenVebProjekat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ftn.PrviMavenVebProjekat.model.Proizvodjac;
import com.ftn.PrviMavenVebProjekat.model.Uloga;
import com.ftn.PrviMavenVebProjekat.service.impl.ProizvodjacService;
import com.ftn.PrviMavenVebProjekat.service.impl.UlogaService;

@Controller
@RequestMapping(value = "/proizvodjaci")
public class ProizvodjacController {
	
	
	@Autowired
	private ProizvodjacService proizvodjacService;
	
	
	@GetMapping(value = "")
	public String getAll(Model model) {
		model.addAttribute("proizvodjaci", proizvodjacService.findAll());
		return "proizvodjaci";
		
	}
	@GetMapping("ukloni/{id}")
		public String deleteOne(@PathVariable("id") Long id, Model model ) {
		proizvodjacService.delete(id);
		model.addAttribute("proizvodjaci", proizvodjacService.findAll());
		return "proizvodjaci";
	}
	
	@PostMapping("")
	
	public String add( @RequestBody MultiValueMap<String, String> proizvodjac, Model model ) {
	
		Proizvodjac u = new Proizvodjac(null, proizvodjac.get("proizvodjacIme").get(0),proizvodjac.get("drzavaProizvodnje").get(0));
		
		proizvodjacService.save(u);
		model.addAttribute("proizvodjaci", proizvodjacService.findAll());
		return "proizvodjaci";
		
	}
	
	@GetMapping("dodaj")
	public String showAddForm() {
		return "dodajProizvodjaca";	
		}
/*
	@GetMapping("izmeni/{id}")
	public String updateForm(@PathVariable("id") Long id, Model model ) {

	model.addAttribute("proizvodjaci", proizvodjacService.findById(id));
	return "dodajProizvodjaca";
	}
	
	@PostMapping("izmeni/{id}")
	public String update( @PathVariable("id") Long id, Model model, @RequestBody MultiValueMap<String, String> proizvodjac ) {
	
		Proizvodjac u = proizvodjacService.findById(id);  new Proizvodjac(null, proizvodjac.get("proizvodjacIme").get(0),proizvodjac.get("drzavaProizvodnje").get(0));
				
		u.setNaziv(null, proizvodjac.get("proizvodjacIme").get(0),proizvodjac.get("drzavaProizvodnje").get(0)); 
		proizvodjacService.save(u);
		model.addAttribute("proizvodjaci", proizvodjacService.findAll());
		return "proizvodjaci";
		
	}

	*/

}
