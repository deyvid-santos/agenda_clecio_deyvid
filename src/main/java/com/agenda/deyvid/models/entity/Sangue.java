package com.agenda.deyvid.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sangue")
public class Sangue implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idsangue;
	
	@Column(name="sangue", length=10)
	private String sangue;

	public Long getIdsangue() {
		return idsangue;
	}

	public void setIdsangue(Long idsangue) {
		this.idsangue = idsangue;
	}

	public String getSangue() {
		return sangue;
	}

	public void setSangue(String sangue) {
		this.sangue = sangue;
	}

	@Override
	public String toString() {
		return "Sangue [idsangue=" + idsangue + ", sangue=" + sangue + "]";
	}

	
	
	

}