package br.com.munif.treinamento.oo.abstratas;

public class Aluno extends Pessoa{
	
	private int ra;
	private String curso;
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public void mostra() {
		System.out.println ("Nome:"+getNome());
		System.out.println ("RA:"+getRa());
		System.out.println ("Curso:"+getCurso());
	}


}
