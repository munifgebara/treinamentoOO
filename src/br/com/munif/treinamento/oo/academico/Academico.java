package br.com.munif.treinamento.oo.academico;

public class Academico {
	
	private int ra;
	
	private String nome;
	
	public Academico(int r,String n) {
		ra=r;
		nome=n; this.nome=nome;   // Por que não precisa ter o this aqui?
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
}
