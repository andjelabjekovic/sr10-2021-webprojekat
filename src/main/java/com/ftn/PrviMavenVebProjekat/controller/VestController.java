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

import com.ftn.PrviMavenVebProjekat.model.Vakcina;
import com.ftn.PrviMavenVebProjekat.model.Vest;
import com.ftn.PrviMavenVebProjekat.service.impl.VakcinaService;
import com.ftn.PrviMavenVebProjekat.service.impl.VestService;

@Controller
@RequestMapping(value = "vest")
public class VestController {
	
	
	
	@Autowired
	private VestService vestService;
	
	
	@GetMapping(value = "")
	public String getAll(Model model) {
		model.addAttribute("vakcine", vestService.findAll());
		return "vakcine";
		
	}
	@GetMapping("ukloni/{id}")
		public String deleteOne(@PathVariable("id") Long id, Model model ) {
		vestService.delete(id);
		model.addAttribute("vakcine", vestService.findAll());
		return "vakcine";
	}
	
	@PostMapping("")
	
	public String add( @RequestBody MultiValueMap<String, String> vest, Model model ) {
	
		Vest v = new Vest(null, vest.get("naziv").get(0),vest.get("sadrzaj").get(0),vest.get("datumIVremeObj").get(0));
		
		vestService.save(v);
		model.addAttribute("vesti", vestService.findAll());
		return "vesti";
		
	}
	
	@GetMapping("dodaj")
	public String showAddForm() {
		return "dodajVest";	
		}
/*
	@GetMapping("izmeni/{id}")
	public String updateForm(@PathVariable("id") Long id, Model model ) {

	model.addAttribute("vest", vestService.findById(id));
	return "dodajVest";
	}
	
	@PostMapping("izmeni/{id}")
	public String update( @PathVariable("id") Long id, Model model, @RequestBody MultiValueMap<String, String> vest ) {
		
		Vest u = vestService.findById(id);  new Vest(null, vest.get("naziv").get(0),vest.get("sadrzaj").get(0),vest.get("datumIVremeObj").get(0));
				
		u.setNaziv(null, vest.get("naziv").get(0),vest.get("sadrzaj").get(0),vest.get("datumIVremeObj").get(0)); 
		vestService.save(u);
		model.addAttribute("vakcine", vestService.findAll());
		return "vakcine";
		
	}

	*/

}
