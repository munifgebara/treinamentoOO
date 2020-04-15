package br.com.munif.treinamento.oo; //ainda não explicado

/**
 * Classe que representa um ventilador padrão
 * @author munif
 *
 */

public class Ventilador {
	
	
	
	/**
	 * Representa Velocidade
	 */
	private int velocidade; //Atributo
	

	Ventilador() { //Método Construtor
		System.out.println ("Criando ventilador");
		botao1();
	}

	Ventilador(int velocidadeIncial) { //Método Construtor
		System.out.println ("Criando ventilador");
		setVelocidade(velocidadeIncial);
	}

	Ventilador(String velocidadeIncial) { //Método Construtor
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
	void desligar(){ //Método
		this.velocidade=0;
	}

	/**
	 * Botão 1, representa o apertar desse botão
	 */
	void botao1(){ //Método
		this.velocidade=1;
	}
	/**
	 * Botão 2
	 */
	void botao2(){ //Método
		this.velocidade=2;
	}
	/**
	 * Botão 3
	 */
	void botao3(){ //Método
		this.velocidade=3;
	}
	/**
	 * mostra o valor da velocidade
	 */
	void mostraVelocidade() { //Método que não retorna nada
		System.out.println ("A velocidade vale:"+this.velocidade);
	}

}
