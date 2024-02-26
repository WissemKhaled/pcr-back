package com.example.pcr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.pcr.dto.EventDTO;
import com.example.pcr.exception.GeneralException;

@Service
public interface EventService {

	List<EventDTO> getAllEvents();

	EventDTO getEventById(Long id);

	EventDTO createEvent(EventDTO eventDTO) throws GeneralException;

	EventDTO updateEvent(Long id, EventDTO eventDTO);
}
