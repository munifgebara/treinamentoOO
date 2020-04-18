package br.com.munif.treinamento.oo.academico;

import java.util.HashSet;
import java.util.Set;

import br.com.munif.treinamento.oo.NegocioException;
import br.com.munif.treinamento.oo.TurmaCheiaException;

public class Turma {
	
	private String codigo;
	
	private Disciplina disciplina;
	
	private Set<Academico> alunos;
	
	public Turma(String c,Disciplina d) {
		this.codigo=c;
		this.disciplina=d;
		alunos=new HashSet<>();
	}
	
	public int getQuantidade() {
		return alunos.size();
	}
	
	public void matriculaAcademico(Academico a) throws TurmaCheiaException {
		if (this.alunos.size()<2) {
			this.alunos.add(a);
			a.getTurmas().add(this);
		}
		else {
			throw new TurmaCheiaException("Não foi possível matricular o "+
		a.getNome()+" pois a turma "+this+" está com "+this.alunos.size());
		}
	}
	
	public void removerAcademico(Academico a) throws NegocioException {
		if (this.alunos.contains(a)) {
			this.alunos.remove(a);
			a.getTurmas().remove(this);
		}
		else{
			String mensagem="O "+a.getNome()+" não está  nessa turma";
			throw new NegocioException(mensagem);
		}
		
	}
	
	public String toString() {
		return "Turma "+codigo+" "+disciplina+" "+alunos;
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
