package com.agenda.deyvid.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agenda.deyvid.models.entity.Estado;
import com.agenda.deyvid.models.repository.EstadoRepository;

@Service
public class EstadoServiceImpl implements IEstadoService {

	@Autowired
	private EstadoRepository er; 
	
	@Override
	public List<Estado> listarEstado() {
		return (List<Estado>) er.findAll();
	}


}
