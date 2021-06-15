package com.agenda.deyvid.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agenda.deyvid.models.entity.Sangue;
import com.agenda.deyvid.models.repository.SangueRepository;

@Service
public class SangueServiceImpl implements ISangueService {
	
	@Autowired
	private SangueRepository sangue;
	
	@Override
	public List<Sangue> listarSangue() {
		return (List<Sangue>) sangue.findAll();
	}

}
