package com.kelsiane.api_flutter.repository;

import javax.annotation.Resource;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kelsiane.api_flutter.entity.Pessoa;

@Resource(description = "pessoa", name = "pessoa")
public interface RepositoryPessoas extends MongoRepository<Pessoa, String>{

}
