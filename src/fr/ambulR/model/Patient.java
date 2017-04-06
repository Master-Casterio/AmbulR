package fr.ambulR.model;


import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Table;

<<<<<<< HEAD
import org.hibernate.validator.constraints.NotEmpty;

=======
>>>>>>> 703886a86a1aa99cc335a9be416e11eb14bbdf57
@Entity
@Table(name="patient")
public class Patient extends Connexion {
	
<<<<<<< HEAD
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
=======
	@Column (name="patient_nom")
	private String nom;
	
	@Column (name="patient_prenom")
	private String prenom;
	
	@Column (name="patient_age")
	private int age;
	
	@Column (name="patient_sexe")
	private String sexe;
	
	@Column (name="patient_adresse")
	private String adresse;
	
	@Column (name="patient_tel")
	private String tel;
	
	@Column (name="patient_nomU")
	private String nomU;
	
	@Column (name="patient_prenomU")
	private String prenomU;
	
	@Column (name="patient_telU")
	private String telU;
	
	@Column (name="patient_DMP")
	private String DMP;
	
	@Column (name="patient_numSecu")
>>>>>>> 703886a86a1aa99cc335a9be416e11eb14bbdf57
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
