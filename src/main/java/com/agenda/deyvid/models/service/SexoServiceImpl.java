package com.agenda.deyvid.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agenda.deyvid.models.entity.Sexo;
import com.agenda.deyvid.models.repository.SexoRepository;
@Service
public class SexoServiceImpl implements ISexoService {
	
	@Autowired
	private SexoRepository sexo;
	
	@Override
	public List<Sexo> listarSexo() {
		return (List<Sexo>) sexo.findAll();
	}

}
