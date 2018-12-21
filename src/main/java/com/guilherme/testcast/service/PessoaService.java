package com.guilherme.testcast.service;

import java.util.List;

import com.guilherme.testcast.models.Pessoa;

public interface PessoaService {

	List<Pessoa> findAllPessoas();
	Pessoa findById(Integer id);
	Pessoa savePessoa(Pessoa Pessoa);
	void deletePessoa(Integer id);
}
