package br.com.munif.treinamento.oo.academico;

import java.util.List;

public class Disciplina {

	private String nome;
	
	public Disciplina(String nome){
		this.nome=nome;   // Por que tem que ter o this aqui?
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return nome;
	}
	
	

}
