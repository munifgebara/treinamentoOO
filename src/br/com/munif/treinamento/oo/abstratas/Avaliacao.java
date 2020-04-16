package br.com.munif.treinamento.oo.abstratas;

public abstract class Avaliacao implements Imprimivel{
	
	private double valor;
	
	public abstract void descreve();
	
	public void imprime() {
		descreve();
	}

}
