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
import com.ftn.PrviMavenVebProjekat.model.VestOObolelima;
import com.ftn.PrviMavenVebProjekat.service.impl.ProizvodjacService;
import com.ftn.PrviMavenVebProjekat.service.impl.VestOObolelimaService;

@Controller
@RequestMapping(value = "/vestoobolelima")
public class VestOObolelimaController {
	
	
	@Autowired
	private VestOObolelimaService vestoobolelimaService;
	
	
	@GetMapping(value = "")
	public String getAll(Model model) {
		model.addAttribute("vestoobolelima", vestoobolelimaService.findAll());
		return "vestoobolelima";
		
	}
	@GetMapping("ukloni/{id}")
		public String deleteOne(@PathVariable("id") Long id, Model model ) {
		vestoobolelimaService.delete(id);
		model.addAttribute("vestoobolelima", vestoobolelimaService.findAll());
		return "vestoobolelima";
	}
	
	@PostMapping("")
	
	public String add( @RequestBody MultiValueMap<String, String> vestoobolelima, Model model ) {
	
		VestOObolelima u = new VestOObolelima(null, Integer.parseInt(vestoobolelima.get("brojObolelih24h").get(0)), 
				Integer.parseInt(vestoobolelima.get("brojTestiranih24h").get(0)),Integer.parseInt(vestoobolelima.get("brojObolelihUkupno").get(0)),
				Integer.parseInt(vestoobolelima.get("brojHospitalizovanih").get(0)),Integer.parseInt(vestoobolelima.get("brojPacijanataNaResp").get(0)),
				vestoobolelima.get("datumIVremeObjave").get(0));
		
		vestoobolelimaService.save(u);
		model.addAttribute("vestoobolelima", vestoobolelimaService.findAll());
		return "vestoobolelima";
		
	}
	
	@GetMapping("dodaj")
	public String showAddForm() {
		return "dodajVestOObolelima";	
		}
/*
	@GetMapping("izmeni/{id}")
	public String updateForm(@PathVariable("id") Long id, Model model ) {

	model.addAttribute("vestoobolelima", vestoobolelimaService.findById(id));
	return "dodajVestOObolelima";
	}
	
	@PostMapping("izmeni/{id}")
	public String update( @PathVariable("id") Long id, Model model, @RequestBody MultiValueMap<String, String> vestoobolelima ) {
	
		VestOObolelima u = vestoobolelimaService.findById(id);  new VestOObolelima(null, Integer.parseInt(vestoobolelima.get("brojObolelih24h").get(0)), 
				Integer.parseInt(vestoobolelima.get("brojTestiranih24h").get(0)),Integer.parseInt(vestoobolelima.get("brojObolelihUkupno").get(0)),
				Integer.parseInt(vestoobolelima.get("brojHospitalizovanih").get(0)),Integer.parseInt(vestoobolelima.get("brojPacijanataNaResp").get(0)),
				vestoobolelima.get("datumIVremeObjave").get(0));
				
		u.setNaziv(null, Integer.parseInt(vestoobolelima.get("brojObolelih24h").get(0)), 
				Integer.parseInt(vestoobolelima.get("brojTestiranih24h").get(0)),Integer.parseInt(vestoobolelima.get("brojObolelihUkupno").get(0)),
				Integer.parseInt(vestoobolelima.get("brojHospitalizovanih").get(0)),Integer.parseInt(vestoobolelima.get("brojPacijanataNaResp").get(0)),
				vestoobolelima.get("datumIVremeObjave").get(0)); 
		vestoobolelimaService.save(u);
		model.addAttribute("vestoobolelima", vestoobolelimaService.findAll());
		return "vestoobolelima";
		
	}

	*/

}
