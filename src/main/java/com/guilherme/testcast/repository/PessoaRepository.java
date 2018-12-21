package com.guilherme.testcast.repository;

import org.springframework.data.repository.CrudRepository;

import com.guilherme.testcast.models.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, Integer>{

}
