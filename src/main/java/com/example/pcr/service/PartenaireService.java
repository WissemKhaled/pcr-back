package com.example.pcr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.pcr.dto.PartenaireDTO;
import com.example.pcr.exception.GeneralException;

@Service
public interface PartenaireService {

	List<PartenaireDTO> getAllPartenaires();
	
	PartenaireDTO getPartenaireById(Long id);
	
	PartenaireDTO createPartenaire(PartenaireDTO partenaireDTO) throws GeneralException;
	
	PartenaireDTO updatePartenaire(Long id, PartenaireDTO partenaireDTO);
}
