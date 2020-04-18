package br.com.munif.treinamento.oo.academico;

import java.util.HashSet;
import java.util.Set;

public class Academico {
	
	private int ra;
	
	private String nome;
	
	private Set<Turma> turmas;
	
	public Academico(int r,String n) {
		ra=r;
		nome=n;		// Por que não precisa ter o this aqui?
		setTurmas(new HashSet<>());
	}
	
	

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() { 
		return ra+"-"+nome;
	}



	public Set<Turma> getTurmas() {
		return turmas;
	}



	public void setTurmas(Set<Turma> turmas) {
		this.turmas = turmas;
	}
	
	
	public void mostraDisciplinas() {
		for (Turma t:turmas) {
			System.out.println(t.getDisciplina().getNome());
		}
	}
	
	
}
