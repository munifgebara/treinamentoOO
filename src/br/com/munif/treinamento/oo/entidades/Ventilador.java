package br.com.munif.treinamento.oo.entidades; //ainda não explicado

/**
 * Classe que representa um ventilador padrão
 * @author munif
 *
 */

public class Ventilador {
	
	
	/**
	 * Representa Velocidade
	 */
	protected int velocidade; //Atributo
	

	public Ventilador() { //Método Construtor
		System.out.println ("Criando ventilador");
		botao1();
	}

	public Ventilador(int velocidadeIncial) { //Método Construtor
		System.out.println ("Criando ventilador");
		setVelocidade(velocidadeIncial);
	}

	public Ventilador(String velocidadeIncial) { //Método Construtor
		System.out.println ("Criando ventilador");
		setVelocidade(Integer.parseInt(velocidadeIncial));
	}


	
	public int getVelocidade() {
		return this.velocidade;
	}
	
	public void setVelocidade(int velocidade){
		if (velocidade>=0 && velocidade<=3) {
			this.velocidade=velocidade;
		}
    }

	public void setVelocidade(String velocidadeS){
		int velocidade=Integer.parseInt(velocidadeS);
		setVelocidade(velocidade);
    }


	
	/**
	 * Desliga o ventilador
	 */
	public void desligar(){ //Método
		this.velocidade=0;
	}

	/**
	 * Botão 1, representa o apertar desse botão
	 */
	public void botao1(){ //Método
		this.velocidade=1;
	}
	/**
	 * Botão 2
	 */
	public void botao2(){ //Método
		this.velocidade=2;
	}
	/**
	 * Botão 3
	 */
	public void botao3(){ //Método
		this.velocidade=3;
	}
	/**
	 * mostra o valor da velocidade
	 */
	//SHOW USAGES
	public void mostraStatus() { //Método que não retorna nada
		System.out.println ("Médoto da classe Ventilador");
		System.out.println ("A velocidade vale:"+this.velocidade);
	}

}
