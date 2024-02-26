package com.example.pcr.mapper;

import org.springframework.stereotype.Component;

import com.example.pcr.dto.EventDTO;
import com.example.pcr.exception.GeneralException;
import com.example.pcr.model.Event;

@Component
public class EventMapper {
	
	public EventDTO toDto(Event event) {
		
		EventDTO eventDTO = new EventDTO();
		eventDTO.setId(event.getId());
		eventDTO.setNom(event.getNom());
		eventDTO.setLieu(event.getLieu());
		eventDTO.setDescription(event.getDescription());
		eventDTO.setImageUrl(event.getImageUrl());
		eventDTO.setImage(event.getImage());
		
		return eventDTO;
	}
	
	public Event toEvent(EventDTO eventDTO) throws GeneralException {
		
		return new Event(	eventDTO.getId(), 
							eventDTO.getNom(),
							eventDTO.getDescription(), 
							eventDTO.getLieu(), 
							eventDTO.getImageUrl(), 
							eventDTO.getImage());
	}
}
