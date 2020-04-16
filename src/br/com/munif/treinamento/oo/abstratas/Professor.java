package br.com.munif.treinamento.oo.abstratas;

public class Professor extends Pessoa{
	
	private String disciplina;

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public void mostra() {
		System.out.println ("Nome:"+getNome());
		System.out.println ("Disciplina:"+getDisciplina());
	}
	

}
