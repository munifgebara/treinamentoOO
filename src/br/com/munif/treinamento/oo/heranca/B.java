package br.com.munif.treinamento.oo.heranca;

public class B extends A{
	
	public B(int i) {
		super();  //Só para explicitar a chamada do construtor sem parâmetro, 
		          //não precisava
		System.out.println ("Construtor com parâmetros Inteiro de B");
	}
	
	public void metodo() {
		System.out.println ("Metodo de B");
	}


}
