package com.ftn.PrviMavenVebProjekat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VestOObolelima {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int brojObolelih24h;
	private int brojTestiranih24h;
	private int brojObolelihUkupno;
	private int brojHospitalizovanih;
	private int brojPacijanataNaResp;
	private String datumIVremeObjave;
	
	public VestOObolelima(int brojObolelih24h, int brojTestiranih24h, int brojObolelihUkupno, int brojHospitalizovanih,
			int brojPacijanataNaResp, String datumIVremeObjave) {
		super();
		this.brojObolelih24h = brojObolelih24h;
		this.brojTestiranih24h = brojTestiranih24h;
		this.brojObolelihUkupno = brojObolelihUkupno;
		this.brojHospitalizovanih = brojHospitalizovanih;
		this.brojPacijanataNaResp = brojPacijanataNaResp;
		this.datumIVremeObjave = datumIVremeObjave;
	}
	
	public VestOObolelima(Long id ,int brojObolelih24h, int brojTestiranih24h, int brojObolelihUkupno, int brojHospitalizovanih,
			int brojPacijanataNaResp, String datumIVremeObjave) {
		super();
		this.id = id;
		this.brojObolelih24h = brojObolelih24h;
		this.brojTestiranih24h = brojTestiranih24h;
		this.brojObolelihUkupno = brojObolelihUkupno;
		this.brojHospitalizovanih = brojHospitalizovanih;
		this.brojPacijanataNaResp = brojPacijanataNaResp;
		this.datumIVremeObjave = datumIVremeObjave;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getBrojObolelih24h() {
		return brojObolelih24h;
	}

	public void setBrojObolelih24h(int brojObolelih24h) {
		this.brojObolelih24h = brojObolelih24h;
	}

	public int getBrojTestiranih24h() {
		return brojTestiranih24h;
	}

	public void setBrojTestiranih24h(int brojTestiranih24h) {
		this.brojTestiranih24h = brojTestiranih24h;
	}

	public int getBrojObolelihUkupno() {
		return brojObolelihUkupno;
	}

	public void setBrojObolelihUkupno(int brojObolelihUkupno) {
		this.brojObolelihUkupno = brojObolelihUkupno;
	}

	public int getBrojHospitalizovanih() {
		return brojHospitalizovanih;
	}

	public void setBrojHospitalizovanih(int brojHospitalizovanih) {
		this.brojHospitalizovanih = brojHospitalizovanih;
	}

	public int getBrojPacijanataNaResp() {
		return brojPacijanataNaResp;
	}

	public void setBrojPacijanataNaResp(int brojPacijanataNaResp) {
		this.brojPacijanataNaResp = brojPacijanataNaResp;
	}

	public String getDatumIVremeObjave() {
		return datumIVremeObjave;
	}

	public void setDatumIVremeObjave(String datumIVremeObjave) {
		this.datumIVremeObjave = datumIVremeObjave;
	}

	@Override
	public String toString() {
		return "VestOObolelima [brojObolelih24h=" + brojObolelih24h + ", brojTestiranih24h=" + brojTestiranih24h
				+ ", brojObolelihUkupno=" + brojObolelihUkupno + ", brojHospitalizovanih=" + brojHospitalizovanih
				+ ", brojPacijanataNaResp=" + brojPacijanataNaResp + ", datumIVremeObjave=" + datumIVremeObjave + "]";
	}
	

}
