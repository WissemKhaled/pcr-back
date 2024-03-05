package com.example.pcr.mapper;

import org.springframework.stereotype.Component;

import com.example.pcr.dto.PartenaireDTO;
import com.example.pcr.model.Partenaire;

@Component
public class PartenaireMapper {

	public PartenaireDTO toDTO(Partenaire partenaire) {
		
		PartenaireDTO partenaireDTO = new PartenaireDTO();
		partenaireDTO.setId(partenaire.getId());
		partenaireDTO.setDescription(partenaire.getDescription());
		partenaireDTO.setLogo(partenaire.getLogo());
	}
}
