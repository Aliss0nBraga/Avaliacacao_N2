package br.com.alissonbraga.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alissonbraga.model.Jogo;
import br.com.alissonbraga.repository.JogoRepository;
@Service
public class JogoService {
	@Autowired
	private JogoRepository jogoRepository;

	public Jogo insert(Jogo jogo) {
		return jogoRepository.save(jogo);

	}

	public Jogo update(Jogo objJogo) {
		return jogoRepository.save(objJogo);
	}

	public List<Jogo> findAll() {
		List<Jogo> jogos = new ArrayList<>();
		jogoRepository.findAll().forEach(jogos::add);
		return jogos;
	}

	public Optional<Jogo> findOne(Integer id) {
		return jogoRepository.findById(id);

	}

	public void remove(Integer id) {
		jogoRepository.deleteById(id);
		
	}
}
