package br.com.munif.treinamento.oo.entidades;

/*
 * Ventilador é a SUPER CLASSE
 * VentiladorPlus é a subClasse
 */

public class VentiladorPlus extends Ventilador{   //Herança 
	
	public void mostraStatus() {
		System.out.println ("Médoto da classe VentiladorPlus");
		if (this.gira) { // mais bonito que if (this.gira==true) {
			System.out.println ("Está girando");
		}
		 else {
			 System.out.println ("Não Está girando");
		}
		super.mostraStatus();
	}
	
	private boolean gira;   //false se não tiver girando ou true se tiver girando

	public boolean isGira() {  // getGira ????  Padrão para boolean  
		return gira;
	}

	public boolean getGira() {  // isGira ???? 
		return gira;
	}
	
	public void setGira(boolean gira) {
		this.gira = gira;
	}
	


}
