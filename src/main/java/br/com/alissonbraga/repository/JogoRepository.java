package br.com.alissonbraga.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.alissonbraga.model.Jogo;

@Repository
public interface JogoRepository extends CrudRepository<Jogo, Integer> {

}
