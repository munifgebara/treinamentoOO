package br.com.munif.treinamento.oo.academico;

import java.util.HashSet;
import java.util.Set;

public class Turma {
	
	private String codigo;
	
	private Disciplina disciplina;
	
	private Set<Academico> alunos;
	
	public Turma(String c,Disciplina d) {
		this.codigo=c;
		this.disciplina=d;
		alunos=new HashSet<>();
	}
	
	
	public String toString() {
		return "Turma "+codigo+" "+disciplina+" "+alunos;
	}
	

	public Set<Academico> getAlunos() {
		return alunos;
	}

	public void setAlunos(Set<Academico> alunos) {
		this.alunos = alunos;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
	

}
