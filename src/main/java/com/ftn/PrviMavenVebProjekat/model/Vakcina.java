package com.ftn.PrviMavenVebProjekat.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Vakcina {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String ime ;
	private int dostupnaKolicina;
  //  private List<Proizvodjac> proizvodjaci;
	
	public Vakcina() {
	//	this.setProizvodjaci(new ArrayList<Proizvodjac>());
	}
	
	public Vakcina(String ime, int dostupnaKolicina, String proizvodjac) {
		super();
		
		this.ime = ime;
		this.dostupnaKolicina = dostupnaKolicina;
	//	this.setProizvodjaci(new ArrayList<Proizvodjac>());
	}
	public Vakcina(Long id,String ime, int dostupnaKolicina, String proizvodjac) {
		super();
		this.id = id;
		this.ime = ime;
		this.dostupnaKolicina = dostupnaKolicina;
	//	this.setProizvodjaci(new ArrayList<Proizvodjac>());
	}
/*
	public List<Proizvodjac> getProizvodjaci() {
		return proizvodjaci;
	}

	public void setProizvodjaci(List<Proizvodjac> proizvodjaci) {
		this.proizvodjaci = proizvodjaci;
	}
*/
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public int getDostupnaKolicina() {
		return dostupnaKolicina;
	}

	public void setDostupnaKolicina(int dostupnaKolicina) {
		this.dostupnaKolicina = dostupnaKolicina;
	}

/*
	@Override
	public String toString() {
		return "Vakcina [ime=" + ime + ", dostupnaKolicina=" + dostupnaKolicina + ", proizvodjaci=" + proizvodjaci + "]";
	}
	
	
*/
}
