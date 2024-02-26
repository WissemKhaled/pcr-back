package com.example.pcr.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.pcr.model.Event;
import com.example.pcr.repository.EventRepository;
import com.example.pcr.service.EventService;

@Service
public class EventServiceImpl implements EventService{
	
	@Autowired
	public EventRepository eventRepository;

	@Override
	public List<Event> getAllEvents() {
		
		return eventRepository.findAll();
	}

	
}
