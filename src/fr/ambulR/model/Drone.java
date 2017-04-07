package fr.ambulR.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="drone")
public class Drone {

	
	@Column (name="drone_latitude")
	private String latitude;
	
	@Column (name="drone_longitude")
	private String longitude;
	
}
