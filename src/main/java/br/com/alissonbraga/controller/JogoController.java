package br.com.alissonbraga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alissonbraga.model.Jogo;
import br.com.alissonbraga.service.JogoService;

@Controller
@RequestMapping("/jogos")
public class JogoController {
	@Autowired
	private JogoService jogoService;
	
	@GetMapping("/forminsert")
	public String Insert(Model model) {
		Jogo jogo = new Jogo();
		model.addAttribute("Jogo", jogo);
		return "jogos/insert";
	}
	@GetMapping("/List")
	public String List(Model model) {
		List<Jogo> jogos = jogoService.findAll();
		model.addAttribute("jogos", jogos);
		return "jogos/list";
	}
	
	@PostMapping("/insert")
	public String insert(@ModelAttribute("jogo")Jogo jogo) {
		Jogo resultJogo = jogoService.insert(jogo);
		if(resultJogo != null) {
			return "jogos/sucess";
		}
		return "jogos/error";
	}
}
 