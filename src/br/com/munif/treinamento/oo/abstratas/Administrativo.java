package br.com.munif.treinamento.oo.abstratas;

public class Administrativo extends Pessoa{
	
	private String departamento;

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	
	public void mostra() {
		System.out.println ("Nome:"+getNome());
		System.out.println ("Nome:"+getDepartamento());
	}
	
	

}
