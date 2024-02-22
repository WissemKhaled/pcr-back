package com.example.pcr.dto;

public class EventDTO {

	private Long id;
	
	private String nom;
	
	private String lieu;
	
	private String description;
	
	private EventDTO(Long id, String nom, String lieu, String description) {
		this.id = id;
		this.nom = nom;
		this.lieu = lieu;
		this.description = description;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getLieu() {
		return lieu;
	}
	
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	

}
