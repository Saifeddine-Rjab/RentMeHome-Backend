package com.mass.RentMeHome.model;

import java.util.HashMap;

public class Segment {

	private int ordre;
	private String name;
	private int start;
	private int end;
	private String valeur;
	private boolean EstOptionnel;
	private boolean EstNumerique;
	private HashMap<String, String> valuers;
	
	public Segment(int ordre, String name, int start, int end, String valeur, boolean estOptionnel,
			boolean estNumerique, HashMap<String, String> valuers) {
		super();
		this.ordre = ordre;
		this.name = name;
		this.start = start;
		this.end = end;
		this.valeur = valeur;
		EstOptionnel = estOptionnel;
		EstNumerique = estNumerique;
		this.valuers = valuers;
	}
	public Segment() {
		super();
	}
	public int getOrdre() {
		return ordre;
	}
	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public String getValeur() {
		return valeur;
	}
	public void setValeur(String valeur) {
		this.valeur = valeur;
	}
	public boolean isEstOptionnel() {
		return EstOptionnel;
	}
	public void setEstOptionnel(boolean estOptionnel) {
		EstOptionnel = estOptionnel;
	}
	public boolean isEstNumerique() {
		return EstNumerique;
	}
	public void setEstNumerique(boolean estNumerique) {
		EstNumerique = estNumerique;
	}
	public HashMap<String, String> getValuers() {
		return valuers;
	}
	public void setValuers(HashMap<String, String> valuers) {
		this.valuers = valuers;
	}
	
	
}
