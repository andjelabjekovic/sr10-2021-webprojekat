package com.ftn.PrviMavenVebProjekat.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Korisnik {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String email;
	private String lozinka;
	private String ime;
	private String prezime;
	private String datumRodjenja;
	private String jmbg;
	private String adresa;
	private String brojTelefona;
	private String datumIVremeReg;
//	private Uloga uloga;
	
	
	public Korisnik() {
		super();
	}
	
	public Korisnik(String email, String lozinka, String ime,String prezime,String datumRodjenja,String jmbg
			,String adresa,String brojTelefona,String datumIVremeReg,Uloga uloga) {
		super();
		this.email = email;
		this.lozinka = lozinka;
		this.ime = ime;
		this.prezime = prezime;
		this.datumRodjenja = datumRodjenja;
		this.jmbg = jmbg;
		this.adresa = adresa;
		this.brojTelefona = brojTelefona;
		this.datumIVremeReg = datumIVremeReg;
	//	this.uloga = uloga;
	}
	
	public Korisnik(Long id, String email, String lozinka, String ime,String prezime,String datumRodjenja,String jmbg
			,String adresa,String brojTelefona,String datumIVremeReg) {
		super();
		this.id = id;
		this.email = email;
		this.lozinka = lozinka;
		this.ime = ime;
		this.prezime = prezime;
		this.datumRodjenja = datumRodjenja;
		this.jmbg = jmbg;
		this.adresa = adresa;
		this.brojTelefona = brojTelefona;
		this.datumIVremeReg = datumIVremeReg;
		//this.uloga = uloga;
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getDatumRodjenja() {
		return datumRodjenja;
	}

	public void setDatumRodjenja(String datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getBrojTelefona() {
		return brojTelefona;
	}

	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}

	public String getDatumIVremeReg() {
		return datumIVremeReg;
	}

	public void setDatumIVremeReg(String datumIVremeReg) {
		this.datumIVremeReg = datumIVremeReg;
	}

	
	/*@Override
	public String toString() {
		return "Korisnik [email=" + email + ", lozinka=" + lozinka + ", ime=" + ime + ", prezime=" + prezime
				+ ", datumRodjenja=" + datumRodjenja + ", jmbg=" + jmbg + ", adresa=" + adresa + ", brojTelefona="
				+ brojTelefona + ", datumIVremeReg=" + datumIVremeReg + ", uloga=" + uloga + "]";
	}*/
	
	@Override
	public String toString() {
		return this.ime + " " + this.prezime + " " + this.email + " " + this.lozinka + " " +this.adresa + " " 
	+this.brojTelefona + " " +this.datumIVremeReg + " " +this.datumRodjenja + " " +this.datumRodjenja + " " +this.jmbg ;
	}
	
	public String toFileString() {
		return this.getId() + ";" + this.getIme() + ";" + this.getPrezime() + ";" + 
				this.getEmail() + ";" + this.getLozinka() + ";" + this.getAdresa() + ";" + this.getBrojTelefona()
				+ ";" + this.getDatumIVremeReg() + ";" + this.getDatumRodjenja() + ";" + this.getJmbg() ;
	}
	

}
