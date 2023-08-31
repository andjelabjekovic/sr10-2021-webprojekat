DROP SCHEMA IF EXISTS euprava1;
CREATE SCHEMA euprava1 DEFAULT CHARACTER SET utf8;
USE euprava1;

CREATE TABLE korisnici (
	id BIGINT AUTO_INCREMENT,
	email VARCHAR(20) NOT NULL,
	lozinka VARCHAR(20) NOT NULL,
	ime VARCHAR(20),
	prezime VARCHAR(20),
	datumRodjenja VARCHAR(20) NOT NULL,
	jmbg VARCHAR(20) NOT NULL,
	adresa VARCHAR(20) NOT NULL,
	borjTelefona VARCHAR(20) NOT NULL,
	datumIVremeReg VARCHAR(20) NOT NULL,
	
	PRIMARY KEY(id)
);

CREATE TABLE vakcina (
	id BIGINT AUTO_INCREMENT,
	ime VARCHAR(75) NOT NULL,
	dostupnaKolicina INT NOT NULL,
	PRIMARY KEY(id)
);

CREATE TABLE vest (
	id BIGINT AUTO_INCREMENT,
	naziv VARCHAR(20) NOT NULL,
	sadrzaj VARCHAR(20) NOT NULL,
	datumIVremeObj VARCHAR(20) NOT NULL,
	PRIMARY KEY(id)
);

CREATE TABLE vestOObolelima (
	id BIGINT AUTO_INCREMENT,
	brojObolelih24h INT NOT NULL,
	brojTestiranih24h INT NOT NULL,
	brojObolelihUkupno INT NOT NULL,
	brojHospitalizovanih INT NOT NULL,
	brojPacijanataNaResp INT NOT NULL,
	datumIVremeObjave VARCHAR(20) NOT NULL,
	
	PRIMARY KEY(id),
	FOREIGN KEY(korisnikId) REFERENCES korisnici(id)
		ON DELETE CASCADE
);

CREATE TABLE proizvodjac (
    id BIGINT,
    proizvodjacIme VARCHAR(20) NOT NULL,
	drzavaProizvodnje VARCHAR(20) NOT NULL,

);



INSERT INTO korisnici ( email, lozinka, ime, prezime,datumRodjenja,jmbg, adresa, brojTelefona, datumIVremeReg) VALUES ( 'pera@mail.com', 'pera','Pera', 
'Peric','12.12.2000.','12218827373','Gogoljeva 22','064678907','06.06.2006.');
INSERT INTO korisnici ( email, lozinka, ime, prezime,datumRodjenja,jmbg, adresa, brojTelefona, datumIVremeReg) VALUES (' mika@mail.com', 'mika',
'Mika', 'Mikic','12.12.2000.','12218827373','Gogoljeva 22','064678907','06.06.2006.');

INSERT INTO vakcina (ime, dostupnaKolicina) VALUES ('kineksa', '500');


INSERT INTO vest (naziv, sadrzaj, datumIVremeObj) VALUES ('Blic', 'nove vesti','10.10.2022.');

INSERT INTO vestOObolelima (brojObolelih24h, brojTestiranih24h,brojObolelihUkupno,brojHospitalizovanih,brojPacijanataNaResp,datumIVremeObjave) 
VALUES ('400', '100','500','100','100','10.12.20021.');
INSERT INTO clanskeKarte (registarskiBroj, korisnikId) VALUES ('456/456', 2);

INSERT INTO proizvodjac (proizvodjacIme, drzavaProizvodnje) VALUES ('DrNeli', 'Svajcarska');

