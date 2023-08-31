package com.ftn.PrviMavenVebProjekat.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Proizvodjac {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String proizvodjacIme;
	private String drzavaProizvodnje;
  //  private List<Vakcina> vakcine;
	
	public Proizvodjac() {
		//this.vakcine = new ArrayList<Vakcina>();
	}
	

	public Proizvodjac( Long id ,String proizvodjacIme ,String drzavaProizvodnje) {
		super();
		this.id = id;
		this.proizvodjacIme = proizvodjacIme;
		this.drzavaProizvodnje = drzavaProizvodnje;

	//	this.vakcine = new ArrayList<Vakcina>();
	}
	
	public Proizvodjac(String proizvodjacIme, String drzavaProizvodnje, List<Vakcina> vakcine) {
		super();
		this.proizvodjacIme = proizvodjacIme;
		this.drzavaProizvodnje = drzavaProizvodnje;
	}
	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

/*
	public List<Vakcina> getVakcine() {
		return vakcine;
	}


	public void setVakcine(List<Vakcina> vakcine) {
		this.vakcine = vakcine;
	}
*/

	public String getProizvodjac() {
		return proizvodjacIme;
	}

	public void setProizvodjac(String proizvodjacIme) {
		this.proizvodjacIme = proizvodjacIme;
	}

	public String getDrzavaProizvodnje() {
		return drzavaProizvodnje;
	}

	public void setDrzavaProizvodnje(String drzavaProizvodnje) {
		this.drzavaProizvodnje = drzavaProizvodnje;
	}

	@Override
	public String toString() {
		return "Proizvodjac [proizvodjacIme=" + proizvodjacIme + ", drzavaProizvodnje=" + drzavaProizvodnje + "]";
	}
	
	

}
