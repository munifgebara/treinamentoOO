package br.com.munif.treinamento.oo.heranca;

public class C extends B{
	
	public C() {
		super(1);
		System.out.println ("Construtor sem parâmetros de C");
	}

	public C(int i) {
		super(1);
		System.out.println ("Construtor com parâmetros Inteiro de C");
	}
	
	public void metodo() {
		metodo();
		System.out.println ("Metodo de C");
	}


	
}
