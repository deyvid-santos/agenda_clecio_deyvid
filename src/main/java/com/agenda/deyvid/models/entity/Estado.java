package com.agenda.deyvid.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estado")
public class Estado implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idestado;
	
	@Column(name="estado", length=50)
	private String estado;

	public Long getIdestado() {
		return idestado;
	}

	public void setIdestado(Long idestado) {
		this.idestado = idestado;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Estado [idestado=" + idestado + ", estado=" + estado + "]";
	}



	
}