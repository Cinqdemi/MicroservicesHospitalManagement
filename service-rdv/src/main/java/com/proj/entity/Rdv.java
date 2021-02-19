package com.proj.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Rdv implements Serializable{
	
	@Id @GeneratedValue
	private long id;
	
	private String date;
	
	private String heure;
	
	private String cinPatient;  
	
	private String cinMedecin;

	public Rdv() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Rdv(String date, String heure, String cinPatient, String cinMedecin) {
		super();
		this.date = date;
		this.heure = heure;
		this.cinPatient = cinPatient;
		this.cinMedecin = cinMedecin;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHeure() {
		return heure;
	}

	public void setHeure(String heure) {
		this.heure = heure;
	}



	public String getCinPatient() {
		return cinPatient;
	}



	public void setCinPatient(String cinPatient) {
		this.cinPatient = cinPatient;
	}



	public String getCinMedecin() {
		return cinMedecin;
	}



	public void setCinMedecin(String cinMedecin) {
		this.cinMedecin = cinMedecin;
	}

	
	
	
}
