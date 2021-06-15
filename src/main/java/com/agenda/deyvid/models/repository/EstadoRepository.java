package com.agenda.deyvid.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.agenda.deyvid.models.entity.Estado;

@Repository
public interface EstadoRepository extends CrudRepository<Estado, Long> {

}
