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

import com.example.pcr.dto.EventDTO;
import com.example.pcr.exception.GeneralException;
import com.example.pcr.service.EventService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/event")
public class EventController {

	private final EventService eventService;
	
	@Autowired
	public EventController(EventService eventService) {
		this.eventService = eventService;
	}
	
	@GetMapping()
	public ResponseEntity<List<EventDTO>> getAllEvents() {
		List<EventDTO> events = eventService.getAllEvents();
		return new ResponseEntity<>(events, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<EventDTO> getEventById(@PathVariable Long id) throws GeneralException {
		EventDTO event = eventService.getEventById(id);
		return new ResponseEntity<>(event, HttpStatus.OK);
	}
	
	@PostMapping()
	public ResponseEntity<EventDTO> createEvent(@Valid @RequestBody EventDTO eventDTO) throws GeneralException {
		EventDTO createdEvent = eventService.createEvent(eventDTO);
		return new ResponseEntity<>(createdEvent, HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<EventDTO> updateEvent(@PathVariable Long id, @RequestBody EventDTO eventDTO) {
		EventDTO updatedEvent = eventService.updateEvent(id, eventDTO);
		return new ResponseEntity<>(updatedEvent, HttpStatus.OK);
	}
	
}
