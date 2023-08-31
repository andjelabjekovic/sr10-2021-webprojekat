package com.ftn.PrviMavenVebProjekat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ftn.PrviMavenVebProjekat.model.Uloga;
import com.ftn.PrviMavenVebProjekat.service.impl.UlogaService;

@Controller
@RequestMapping(value = "/uloge")
public class UlogaController {
	
	
	@Autowired
	private UlogaService ulogaService;
	
	
	@GetMapping(value = "")
	public String getAll(Model model) {
		model.addAttribute("uloge", ulogaService.findAll());
		return "uloge";
		
	}
	@GetMapping("ukloni/{id}")
		public String deleteOne(@PathVariable("id") Long id, Model model ) {
		ulogaService.delete(id);
		model.addAttribute("uloge", ulogaService.findAll());
		return "uloge";
	}
	
	@PostMapping("")
	
	public String add( @RequestBody MultiValueMap<String, String> uloga, Model model ) {
	
		Uloga u = new Uloga(null,/**/ uloga.get("naziv").get(0));
		
		ulogaService.save(u);
		model.addAttribute("uloge", ulogaService.findAll());
		return "uloge";
		
	}
	
	@GetMapping("dodaj")
	public String showAddForm() {
		return "dodajUlogu";	
		}
/*
	@GetMapping("izmeni/{id}")
	public String updateForm(@PathVariable("id") Long id, Model model ) {

	model.addAttribute("uloga", ulogaService.findById(id));
	return "dodajUlogu";
	}
	
	@PostMapping("izmeni/{id}")
	public String update( @PathVariable("id") Long id, Model model, @RequestBody MultiValueMap<String, String> uloga ) {
		System.out.println(uloga.get("naziv"));
		Uloga u = ulogaService.findById(id); /* new Uloga(null, uloga.get("naziv").get(0));
				
		u.setNaziv(uloga.get("naziv").get(0)); 
		ulogaService.save(u);
		model.addAttribute("uloge", ulogaService.findAll());
		return "uloge";
		
	}

	*/
	
}
	


