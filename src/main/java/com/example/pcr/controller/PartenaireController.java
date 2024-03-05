package com.example.pcr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pcr.dto.PartenaireDTO;
import com.example.pcr.exception.GeneralException;
import com.example.pcr.service.PartenaireService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/partenaire")
public class PartenaireController {

	private final PartenaireService partenaireService;
	
	@Autowired
	public PartenaireController(PartenaireService partenaireService) {
		this.partenaireService = partenaireService;
	}
	
	public ResponseEntity<List<PartenaireDTO>> getAllPartenaires() {
		List<PartenaireDTO> partenaires = partenaireService.getAllPartenaires();
		return new ResponseEntity<>(partenaires, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PartenaireDTO> getEventById(@PathVariable Long id) throws GeneralException {
		PartenaireDTO event = partenaireService.getPartenaireById(id);
		return new ResponseEntity<>(event, HttpStatus.OK);
	}
	
	@PostMapping()
	public ResponseEntity<PartenaireDTO> createEvent(@Valid @RequestBody PartenaireDTO partenaireDTO) throws GeneralException {
		PartenaireDTO createdEvent = partenaireService.createPartenaire(partenaireDTO);
		return new ResponseEntity<>(createdEvent, HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<PartenaireDTO> updateEvent(@PathVariable Long id, @RequestBody PartenaireDTO partenaireDTO) {
		PartenaireDTO updatedEvent = partenaireService.updatePartenaire(id, partenaireDTO);
		return new ResponseEntity<>(updatedEvent, HttpStatus.OK);
	}
}
