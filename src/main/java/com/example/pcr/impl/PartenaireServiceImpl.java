package com.example.pcr.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pcr.repository.PartenaireRepository;

@Service
public class PartenaireServiceImpl {

	@Autowired
	public PartenaireRepository partenaireRepository;
}
