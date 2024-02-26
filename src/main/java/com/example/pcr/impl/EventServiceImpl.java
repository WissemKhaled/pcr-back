package com.example.pcr.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pcr.dto.EventDTO;
import com.example.pcr.exception.GeneralException;
import com.example.pcr.mapper.EventMapper;
import com.example.pcr.model.Event;
import com.example.pcr.repository.EventRepository;
import com.example.pcr.service.EventService;

@Service
public class EventServiceImpl implements EventService{
	
	@Autowired
	public EventRepository eventRepository;
	
	@Autowired
	public EventMapper mapper;

	@Override
	public List<EventDTO> getAllEvents() {
		
		Optional<List<Event>> list = Optional.ofNullable(eventRepository.findAll());
		
		List<EventDTO> listDTO = list.get().stream().map(mapper::toDto).toList();
		return listDTO;
	}

	@Override
	public EventDTO getEventById(Long id) {
		Optional<Event> eventOptional = eventRepository.findById(id);
		Event event = new Event();
		if(eventOptional.isPresent()) {
			event = eventOptional.get();
		}
		EventDTO eventDTO = mapper.toDto(event);
		return eventDTO;
	}

	@Override
	public EventDTO createEvent(EventDTO eventDTO) throws GeneralException {
		Event event = mapper.toEvent(eventDTO);
		Event savedEvent = eventRepository.save(event);
		return mapper.toDto(savedEvent);
	}

	@Override
	public EventDTO updateEvent(Long id, EventDTO eventDTO) {
		Optional<Event> eventOptionale = eventRepository.findById(id);
		if (eventOptionale.isEmpty()) {
//          throw new ResourceNotFoundException("Client not found with id: " + id);
			throw new RuntimeException("Client not found with id: " + id);
		}
		
		Event event = eventOptionale.get();
		event.setNom(eventDTO.getNom());
		event.setDescription(eventDTO.getDescription());
		event.setLieu(eventDTO.getLieu());
		event.setImage(eventDTO.getImage());
		event.setImageUrl(eventDTO.getImageUrl());
		
		Event updatedEvent = eventRepository.save(event);
		return mapper.toDto(updatedEvent);
	}

	
	
}
