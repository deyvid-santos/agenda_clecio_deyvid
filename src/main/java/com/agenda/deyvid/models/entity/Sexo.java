package com.agenda.deyvid.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sexo")
public class Sexo implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idsexo;
	
	@Column(name="sexo", length=10)
	private String sexo;

	public Long getIdsexo() {
		return idsexo;
	}

	public void setIdsexo(Long idsexo) {
		this.idsexo = idsexo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Sexo [idsexo=" + idsexo + ", sexo=" + sexo + "]";
	}
	
	

}