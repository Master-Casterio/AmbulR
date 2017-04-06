package fr.ambulR.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="connexion")
public class Connexion 

{
	
@Id
@Column (name="connexion_id")
@GeneratedValue(strategy=GenerationType.AUTO)
private int connexion_id;
	
@Column (name="identifiant")
@NotEmpty(message="l'identifiant est obligatoire")
private  String identifiant;

@Column (name="password")
@NotEmpty(message="le mot de passe est obligatoire")
private String password;

public String getIdentifiant() {
	return identifiant;
}
public void setIdentifiant(String identifiant) {
	this.identifiant = identifiant;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


}
