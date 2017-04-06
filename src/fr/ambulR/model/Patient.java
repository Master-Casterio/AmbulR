package fr.ambulR.model;


import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="patient")
public class Patient extends Connexion {
	
	@NotEmpty(message="rentrer le nom")
	private String nom;
	@NotEmpty(message="rentrer le prenom")
	private String prenom;
	@NotEmpty(message="rentrer l'age")
	private String age;
	@NotEmpty(message="rentrer le sexe")
	private String sexe;
	@NotEmpty(message="rentrer l'adresse")
	private String adresse;
	@NotEmpty(message="rentrer le tel")
	private String tel;
	@NotEmpty(message="rentrer le nomU")
	private String nomU;
	@NotEmpty(message="rentrer le prenomU")
	private String prenomU;
	@NotEmpty(message="rentrer le telU")
	private String telU;
	@NotEmpty(message="rentrer le DMP")
	private String DMP;
	@NotEmpty(message="rentrer le numSecu")
	private String numSecu;
	@NotEmpty(message="rentrer le password")
	private String password;
	

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getNomU() {
		return nomU;
	}
	public void setNomU(String nomU) {
		this.nomU = nomU;
	}
	public String getPrenomU() {
		return prenomU;
	}
	public void setPrenomU(String prenomU) {
		this.prenomU = prenomU;
	}
	public String getTelU() {
		return telU;
	}
	public void setTelU(String telU) {
		this.telU = telU;
	}
	public String getDMP() {
		return DMP;
	}
	public void setDMP(String dMP) {
		DMP = dMP;
	}
	public String getNumSecu() {
		return numSecu;
	}
	public void setNumSecu(String numSecu) {
		this.numSecu = numSecu;
	}

	

	
}
