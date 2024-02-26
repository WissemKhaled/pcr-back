package com.example.pcr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.pcr.model.Event;

@Service
public interface EventService {

	List<Event> getAllEvents();
}
