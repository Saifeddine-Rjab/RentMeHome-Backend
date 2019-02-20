package com.mass.RentMeHome.model;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Format {

	@Id
	private String reference;
	private List<Ligne> lignes;
	
	public Format(String reference, List<Ligne> lignes) {
		super();
		this.reference = reference;
		this.lignes = lignes;
	}

	public Format() {
		super();
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public List<Ligne> getLignes() {
		return lignes;
	}

	public void setLignes(List<Ligne> lignes) {
		this.lignes = lignes;
	}
	
	
	
}
