package br.com.munif.treinamento.oo.abstratas;

public abstract class Pessoa implements Imprimivel{
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract void mostra();
	
	public void imprime() {
		mostra();
	}
	
	

}
