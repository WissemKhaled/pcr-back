package com.example.pcr.dto;

public class PartenaireDTO {
	
	private Long id;
	
	private String nom;
	
	private String description;
	
	private byte[] logo;
	
	public PartenaireDTO() {

	}

	public PartenaireDTO(Long id, String nom, String description, byte[] logo) {
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.logo = logo;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] image) {
		this.logo = image;
	}
}
