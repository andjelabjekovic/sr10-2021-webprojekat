package com.ftn.PrviMavenVebProjekat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String naziv;
	private String sadrzaj;
	private String datumIVremeObj;
	
	public Vest(String naziv, String sadrzaj, String datumIVremeObj) {
		super();
		
		this.naziv = naziv;
		this.sadrzaj = sadrzaj;
		this.datumIVremeObj = datumIVremeObj;
	}
	
	public Vest(Long id,String naziv, String sadrzaj, String datumIVremeObj) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.sadrzaj = sadrzaj;
		this.datumIVremeObj = datumIVremeObj;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getSadrzaj() {
		return sadrzaj;
	}

	public void setSadrzaj(String sadrzaj) {
		this.sadrzaj = sadrzaj;
	}

	public String getDatumIVremeObj() {
		return datumIVremeObj;
	}

	public void setDatumIVremeObj(String datumIVremeObj) {
		this.datumIVremeObj = datumIVremeObj;
	}

	@Override
	public String toString() {
		return "Vest [naziv=" + naziv + ", sadrzaj=" + sadrzaj + ", datumIVremeObj=" + datumIVremeObj + "]";
	}
	
	

}
