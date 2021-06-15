package com.agenda.deyvid.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.agenda.deyvid.models.entity.Estado;
import com.agenda.deyvid.models.entity.Pessoa;
import com.agenda.deyvid.models.entity.Sangue;
import com.agenda.deyvid.models.entity.Sexo;
import com.agenda.deyvid.models.service.IEstadoService;
import com.agenda.deyvid.models.service.IPessoaService;
import com.agenda.deyvid.models.service.ISangueService;
import com.agenda.deyvid.models.service.ISexoService;

/* Controle da página /pessoa */
@Controller
@RequestMapping("/pessoa")
public class PessoaController {
	
	/* importar os métodos de CRUD */
	@Autowired
	private IPessoaService ps;
	
	@Autowired
	private IEstadoService es;
	
	@Autowired
	private ISexoService sexo;
	
	@Autowired
	private ISangueService sangue;
	
	/* listar pessoa na página pessoa */
	@GetMapping("")
	public String listarPessoa(Model model) {
		List<Pessoa> listaPessoa = ps.listarPessoa();
				
		model.addAttribute("titulo","Lista de Pessoas");
		model.addAttribute("pessoa", listaPessoa); 
		return "/tabelas/pessoa";
	}
	
	/* lista o formulário a ser preenchido */
	@GetMapping("criar")
	public String criar(Model model) {
		Pessoa pessoa = new Pessoa();
		List<Estado> listarEstado = es.listarEstado();
		List<Sexo> listarSexo = sexo.listarSexo();
		List<Sangue> listarSangue = sangue.listarSangue();
		model.addAttribute("titulo", "Formulário: Pessoa");
		model.addAttribute("pessoa", pessoa);
		model.addAttribute("estado", listarEstado);
		model.addAttribute("sangue", listarSangue);
		model.addAttribute("sexo", listarSexo);
		
		return "/forms/formpessoa";
	}
	
	/* salvar os dados */
	@PostMapping("save")
	public String salvar(@Valid @ModelAttribute Pessoa pessoa, BindingResult result, Model model, RedirectAttributes attributes) {
		List<Estado> listarEstado = es.listarEstado();
		List<Sexo> listarSexo = sexo.listarSexo();
		List<Sangue> listarSangue = sangue.listarSangue();
		if (result.hasErrors()) {
			model.addAttribute("titulo", "Formulário: Pessoa");
			model.addAttribute("pessoa", pessoa);
			model.addAttribute("estado", listarEstado);
			model.addAttribute("sangue", listarSangue);
			model.addAttribute("sexo", listarSexo); 
			return "/forms/formpessoa";
		}
		ps.salvar(pessoa);
		attributes.addFlashAttribute("success","Cadastrado com sucesso!");
		return "redirect:/pessoa";
	}
	
	/* edição buscando pelo id*/
	@GetMapping("edit/{id}")
	public String edit(@PathVariable("id") Long idpessoa, Model model, RedirectAttributes attributes) {
		Pessoa pessoa = null;
		
		if(idpessoa > 0) {
			pessoa = ps.buscarPorId(idpessoa);
			if(pessoa == null) {
				attributes.addFlashAttribute("error","O ID não existe!");
				return "redirect:/pessoa";
			}
		}else {
			attributes.addFlashAttribute("error", "Erro com o ID!");
			return "redirect:/pessoa";
		}
		
		
		
		List<Estado> listarEstado = es.listarEstado();
		List<Sexo> listarSexo = sexo.listarSexo();
		List<Sangue> listarSangue = sangue.listarSangue();
		model.addAttribute("titulo", "Editar: Pessoa");
		model.addAttribute("pessoa", pessoa);
		model.addAttribute("estado", listarEstado);
		model.addAttribute("sangue", listarSangue);
		model.addAttribute("sexo", listarSexo);
		return "/forms/formpessoa";
	}
	
	
	/* deletar buscando pelo id */
	@GetMapping("delete/{id}")
	public String delete(@PathVariable("id") Long idpessoa, Model model, RedirectAttributes attributes) {
		Pessoa pessoa = null;
		if(idpessoa > 0) {
			pessoa = ps.buscarPorId(idpessoa);
			if(pessoa == null) {
				attributes.addFlashAttribute("error","O ID não existe!");
				return "redirect:/pessoa";
			}
		}else {
			attributes.addFlashAttribute("error", "Erro com o ID!");
			return "redirect:/pessoa";
		}
		ps.eliminar(idpessoa);
		attributes.addFlashAttribute("warning", "Registro deletado com sucesso!");
		return "redirect:/pessoa";
	}

}
