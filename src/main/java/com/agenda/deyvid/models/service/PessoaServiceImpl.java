package com.agenda.deyvid.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agenda.deyvid.models.entity.Pessoa;
import com.agenda.deyvid.models.repository.PessoaRepository;

@Service
public class PessoaServiceImpl implements IPessoaService {

	@Autowired
	private PessoaRepository pr;
	
	@Override
	public List<Pessoa> listarPessoa() {
		return (List<Pessoa>) pr.findAll();
	}

	@Override
	public void salvar(Pessoa pessoa) {
		pr.save(pessoa);
	}

	@Override
	public Pessoa buscarPorId(Long idpessoa) {
		return pr.findById(idpessoa).orElse(null);
	}

	@Override
	public void eliminar(Long idpessoa) {
		pr.deleteById(idpessoa);

	}

}
