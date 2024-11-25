package com.ahmed.plats.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

@Entity
public class Plat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPlat;
	private String nomPlat;
	private Double prixPlat;
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE) // Ensures the column is stored as a DATE type
	private Date dateCreation;
	
	@ManyToOne
	private Pays pays;

	
	

	public Plat() {
		super();
	}

	public Plat(String nomPlat, Double prixPlat, Date dateCreation, Pays pays) {
		this.nomPlat = nomPlat;
		this.prixPlat = prixPlat;
		this.dateCreation = dateCreation;
		this.pays = pays;
	}

	public void setNomPlat(String nomPlat) {
		this.nomPlat = nomPlat;
	}

	public void setPrixPlat(Double prixPlat) {
		this.prixPlat = prixPlat;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}

	public String getNomPlat() {
		return nomPlat;
	}

	public Double getPrixPlat() {
		return prixPlat;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public Long getIdPlat() {
		return idPlat;
	}

	public Pays getPays() {
		return pays;
	}

	@Override
	public String toString() {
		return "Plat [idPlat=" + idPlat + ", nomPlat=" + nomPlat + ", prixPlat=" + prixPlat
				+ ", dateCreation=" + dateCreation + "]";
	}
}
