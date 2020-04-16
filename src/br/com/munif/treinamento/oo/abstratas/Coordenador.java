package br.com.munif.treinamento.oo.abstratas;

public class Coordenador extends Pessoa{
	
	private String curso;

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	public void mostra() {
		System.out.println ("Nome:"+getNome());
		System.out.println ("Curso:"+getCurso());
	}

}
