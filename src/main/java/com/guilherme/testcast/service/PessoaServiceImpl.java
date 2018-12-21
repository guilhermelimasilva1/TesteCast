package com.guilherme.testcast.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.guilherme.testcast.models.Pessoa;
import com.guilherme.testcast.repository.PessoaRepository;

@Component
public class PessoaServiceImpl implements PessoaService{

	@Autowired
	PessoaRepository pessoaRepository;
	
	@Override
	public List<Pessoa> findAllPessoas() {

		return (List<Pessoa>) pessoaRepository.findAll();
	}

	@Override
	public Pessoa findById(Integer id) {
		
		Optional<Pessoa> pessoa = pessoaRepository.findById(id);
		return pessoa != null && pessoa.isPresent() ? pessoa.get() : null;
	}

	@Override
	public Pessoa savePessoa(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}

	@Override
	public void deletePessoa(Integer id) {
		pessoaRepository.deleteById(id);
	}

}
