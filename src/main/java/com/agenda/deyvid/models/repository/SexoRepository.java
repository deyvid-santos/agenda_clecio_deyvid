package com.agenda.deyvid.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.agenda.deyvid.models.entity.Sexo;

@Repository
public interface SexoRepository extends CrudRepository<Sexo, Long>
{
	
}