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
import com.ftn.PrviMavenVebProjekat.model.Uloga;
import com.ftn.PrviMavenVebProjekat.model.Vakcina;
import com.ftn.PrviMavenVebProjekat.service.impl.UlogaService;
import com.ftn.PrviMavenVebProjekat.service.impl.VakcinaService;

@Controller
@RequestMapping(value = "/vakcina")
public class VakcinaController {
	
	
	@Autowired
	private VakcinaService vakcinaService;
	
	
	@GetMapping(value = "")
	public String getAll(Model model) {
		model.addAttribute("vakcine", vakcinaService.findAll());
		return "vakcine";
		
	}
	@GetMapping("ukloni/{id}")
		public String deleteOne(@PathVariable("id") Long id, Model model ) {
		vakcinaService.delete(id);
		model.addAttribute("vakcine", vakcinaService.findAll());
		return "vakcine";
	}
	
	@PostMapping("")
	
	public String add( @RequestBody MultiValueMap<String, String> vakcina, Model model ) {
	
		Vakcina v = new Vakcina(null, vakcina.get("ime").get(0),Integer.parseInt(vakcina.get("dostupnaKolicina").get(0)));
		
		vakcinaService.save(v);
		model.addAttribute("vakcine", vakcinaService.findAll());
		return "vakcine";
		
	}
	
	@GetMapping("dodaj")
	public String showAddForm() {
		return "dodajVakcinu";	
		}
/*
	@GetMapping("izmeni/{id}")
	public String updateForm(@PathVariable("id") Long id, Model model ) {

	model.addAttribute("vakcina", vakcinaService.findById(id));
	return "dodajVakcinu";
	}
	
	@PostMapping("izmeni/{id}")
	public String update( @PathVariable("id") Long id, Model model, @RequestBody MultiValueMap<String, String> vakcina ) {
		
		Vakcina u = vakcinaService.findById(id);  new Vakcina(null, vakcina.get("ime").get(0),Integer.parseInt(vakcina.get("dostupnaKolicina").get(0)));
				
		u.setNaziv(null, vakcina.get("ime").get(0),Integer.parseInt(vakcina.get("dostupnaKolicina").get(0))); 
		vakcinaService.save(u);
		model.addAttribute("vakcine", vakcinaService.findAll());
		return "vakcine";
		
	}

	*/

}
