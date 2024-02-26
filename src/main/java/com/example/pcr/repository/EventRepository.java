package com.example.pcr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pcr.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long>{

		
}