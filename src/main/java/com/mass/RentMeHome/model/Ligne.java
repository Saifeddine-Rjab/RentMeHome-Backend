package com.mass.RentMeHome.model;

import java.util.List;

import com.mass.RentMeHome.model.Segment;

public class Ligne {
	private String rang;
	private String nom;
	private String description;
	private List<Segment> segments;
	
	public Ligne(String rang, String nom, String description, List<Segment> segments) {
		super();
		this.rang = rang;
		this.nom = nom;
		this.description = description;
		this.segments = segments;
	}

	public Ligne() {
		super();
	}

	public String getRang() {
		return rang;
	}

	public void setRang(String rang) {
		this.rang = rang;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Segment> getSegments() {
		return segments;
	}

	public void setSegments(List<Segment> segments) {
		this.segments = segments;
	}
	
	
}
