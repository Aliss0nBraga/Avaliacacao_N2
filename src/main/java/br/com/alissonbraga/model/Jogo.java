package br.com.alissonbraga.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jogos")
public class Jogo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String compatibilidade;
	private String valor;
	private String unidades;
	private String editora;

	public Jogo(int id, String nome, String compatibilidade, String valor, String unidades, String editora) {
		this.id = id;
		this.nome = nome;
		this.compatibilidade = compatibilidade;
		this.valor = valor;
		this.unidades = unidades;
		this.editora = editora;
	}

	public Jogo() {
		
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCompatibilidade() {
		return compatibilidade;
	}

	public String getValor() {
		return valor;
	}

	public String getUnidades() {
		return unidades;
	}

	public String getEditora() {
		return editora;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCompatibilidade(String compatibilidade) {
		this.compatibilidade = compatibilidade;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public void setUnidades(String unidades) {
		this.unidades = unidades;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

}
