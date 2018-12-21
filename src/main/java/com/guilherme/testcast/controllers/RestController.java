package com.guilherme.testcast.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.guilherme.testcast.models.Pessoa;
import com.guilherme.testcast.service.PessoaService;

@Controller
@RequestMapping("/rest")
public class RestController {

	@Autowired
	PessoaService pessoaService;
	
	@GetMapping("/pessoas")
	@ResponseBody
	public List<Pessoa> findAllPessoas() {
		return pessoaService.findAllPessoas();
	}
	
	@GetMapping(value="/pessoa/{id}")
	@ResponseBody
	public Pessoa getPessoaById(@PathVariable(value="id") Integer id) {
		return pessoaService.findById(id);
	}
	
	@PostMapping("/pessoa/save/")
	@ResponseBody
	public void savePessoa(@RequestBody Pessoa pessoa) {
		pessoaService.savePessoa(pessoa);
	}
	
	@DeleteMapping("/pessoa/remove/{id}")
	@ResponseBody
	public void deletePessoa(@PathVariable(value="id") Integer id) {
		pessoaService.deletePessoa(id);
	}
	
}
