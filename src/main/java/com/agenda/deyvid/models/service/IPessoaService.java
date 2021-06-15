package com.agenda.deyvid.models.service;

import java.util.List;

import com.agenda.deyvid.models.entity.Pessoa;

public interface IPessoaService {
	
	public List<Pessoa> listarPessoa();
	public void salvar(Pessoa pessoa);
	public Pessoa buscarPorId(Long idpessoa);
	public void eliminar(Long idpessoa);

}
