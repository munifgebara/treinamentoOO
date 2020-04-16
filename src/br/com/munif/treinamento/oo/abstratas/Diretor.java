package br.com.munif.treinamento.oo.abstratas;

public class Diretor extends Pessoa {
	
	private String diretoria;

	public String getDiretoria() {
		return diretoria;
	}

	public void setDiretoria(String diretoria) {
		this.diretoria = diretoria;
	}
	public void mostra() {
		System.out.println ("Nome:"+getNome());
		System.out.println ("Diretoria:"+getDiretoria());
	}
}
