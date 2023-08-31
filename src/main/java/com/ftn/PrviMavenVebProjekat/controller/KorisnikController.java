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

import com.ftn.PrviMavenVebProjekat.model.Korisnik;
import com.ftn.PrviMavenVebProjekat.model.Uloga;
import com.ftn.PrviMavenVebProjekat.service.impl.KorisnikService;
import com.ftn.PrviMavenVebProjekat.service.impl.UlogaService;

@Controller
@RequestMapping(value = "/korisnici")
public class KorisnikController {
	
	@Autowired
	private KorisnikService korisnikService;
	
	
	@GetMapping(value = "")
	public String getAll(Model model) {
		model.addAttribute("korisnici", korisnikService.findAll());
		return "korisnici";
		
	}
	@GetMapping("ukloni/{id}")
		public String deleteOne(@PathVariable("id") Long id, Model model ) {
		korisnikService.delete(id);
		model.addAttribute("korisnici", korisnikService.findAll());
		return "korisnici";
	}
	
	@PostMapping("")
	
	public String add( @RequestBody MultiValueMap<String, String> korisnik, Model model ) {
	
		Korisnik k = new Korisnik(null,/**/ korisnik.get("email").get(0), korisnik.get("lozinka").get(0) , 
	                korisnik.get("ime").get(0), korisnik.get("prezime").get(0),  
	                korisnik.get("datumRodjenja").get(0), korisnik.get("jmbg").get(0), 
	                korisnik.get("adresa").get(0) , korisnik.get("brojTelefona").get(0), korisnik.get("datumIVreme").get(0) );
		
		korisnikService.save(k);
		model.addAttribute("korisnici", korisnikService.findAll());
		return "korisnici";
		
	}
	
	@GetMapping("dodaj")
	public String showAddForm() {
		return "dodajKorisnika";	
		}
/*
	@GetMapping("izmeni/{id}")
	public String updateForm(@PathVariable("id") Long id, Model model ) {

	model.addAttribute("korisnik", korisnikService.findById(id));
	return "dodajUlogu";
	}
	
	@PostMapping("izmeni/{id}")
	public String update( @PathVariable("id") Long id, Model model, @RequestBody MultiValueMap<String, String> korisnik ) {
		System.out.println(korisnik.get("naziv"));
		Korisnik u = korisnikService.findById(id); /* new Korisnik(null, korisnik.get("naziv").get(0));
				
		u.setNaziv(korisnik.get("naziv").get(0)); 
		korisnikService.save(u);
		model.addAttribute("uloge", korisnikService.findAll());
		return "uloge";
		
	}

	*/
	

}
