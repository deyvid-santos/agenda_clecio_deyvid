package com.agenda.deyvid.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity /* Entidade */
@Table(name="pessoa", uniqueConstraints={@UniqueConstraint(columnNames = {"cpf"})}) /* CPF deve ser único */
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L; /*Evitar conflitos com outras versões */
	
	/* Colunas */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idpessoa;
	
	@NotEmpty
	@Column(name="cpf", length=20)
	private String cpf;
	
	@NotEmpty
	@Column(name="nome", length=15)
	private String nome;

	@NotEmpty
	@Column(name="sobrenome", length=15)
	private String sobrenome;
	
	@NotEmpty
	@Column(name="telefone1", length=20)
	private String telefone1;
	
	@NotEmpty
	@Column(name="telefone2", length=20)
	private String telefone2;
	
	@NotEmpty
	@Email
	@Column(name="email", length=100)
	private String email;
	
	/* Chave estrangeira de estado */
	@ManyToOne
	@JoinColumn(name="estados_id")
	private Estado estado;
	
	/* Chave estrangeira de sexo */
	@ManyToOne
	@JoinColumn(name="sexo_id")
	private Sexo sexo;
	
	/* Chave estrangeira de sangue */
	@ManyToOne
	@JoinColumn(name="sangue_id")
	private Sangue sangue;

	@NotEmpty
	@Column(name="cidade", length=20)
	private String cidade;
	
	@NotEmpty
	@Column(name="endereco", length=100)
	private String endereco;

	public Long getIdpessoa() {
		return idpessoa;
	}

	public void setIdpessoa(Long idpessoa) {
		this.idpessoa = idpessoa;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Sangue getSangue() {
		return sangue;
	}

	public void setSangue(Sangue sangue) {
		this.sangue = sangue;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	
	
	
	
	
	
}
