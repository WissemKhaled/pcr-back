package com.example.pcr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pcr.dto.EventDTO;
import com.example.pcr.mapper.EventMapper;
import com.example.pcr.service.EventService;


@RestController
@RequestMapping("/event")
public class EventController {

	private final EventService eventService;
	private EventMapper mapper;
	
	@Autowired
	public EventController(EventService eventService) {
		this.eventService = eventService;
	}
	
	
	@GetMapping
	public ResponseEntity<List<EventDTO>> getAllEvents() {
		List<EventDTO> events = eventService.getAllEvents().stream().map(event -> mapper.toDto(event)).toList();
		return new ResponseEntity<>(events, HttpStatus.OK);
	}
	
}
