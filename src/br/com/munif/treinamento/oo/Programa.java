/*
       Comentários de mais de uma linha
       estou devendo o JavaDoc   
*/

package br.com.munif.treinamento.oo;

import br.com.munif.treinamento.oo.entidades.*;
import br.com.munif.treinamento.oo.heranca.C;

// private só acessível do próprio atefato
// public acessível de todos os atefatos
// NADA (package) acessível apenas do pacote
// protected  acessível no mesmo pacote e em suas subclasses




public class Programa {
	
	public static void mainHerancaConstrutores(String[] args) {
		C c=new C();
	}
		
	public static void main(String[] args) {  //Começa aqui
		Ventilador ventiladorDoMunif;
		ventiladorDoMunif=new Ventilador();
		ventiladorDoMunif.mostraStatus();
		ventiladorDoMunif.botao3();
		ventiladorDoMunif.mostraStatus();
		System.out.println ("O Custo é de "+(5*ventiladorDoMunif.getVelocidade()));
		ventiladorDoMunif.setVelocidade(0);
		ventiladorDoMunif.mostraStatus();
		ventiladorDoMunif.setVelocidade(-5);
		
		ventiladorDoMunif.setVelocidade("5");
		ventiladorDoMunif.mostraStatus();

		VentiladorPlus vp=new VentiladorPlus();
		vp.botao1();
		vp.setGira(true);
		vp.mostraStatus();
		System.out.println ("Ventilador Plus "+vp.isGira()+" está girando");
		vp.mostraStatus();

    }
		

	/*
	
	public static void velho(String[] args) {  //Começa aqui
		System.out.println ("Boa noite pessoal !");
		
		Ventilador ventiladorDoMunif,outroVentilador,v;
		ventiladorDoMunif=new Ventilador();
		outroVentilador=new Ventilador();
		
		v=ventiladorDoMunif;
		
		Ventilador vt=new Ventilador();
		
		ventiladorDoMunif.velocidade=1;
		outroVentilador.velocidade=2;
		
		System.out.println ("Outro:"+outroVentilador.velocidade);
		System.out.println ("Munif:"+ ventiladorDoMunif.velocidade); //explicar Sobrecarga
		System.out.println ("V:"+v.velocidade); //explicar Sobrecarga
		v.velocidade=5;
		System.out.println ("Munif:"+ ventiladorDoMunif.velocidade); //explicar Sobrecarga
		System.out.println ("V:"+v.velocidade); //explicar Sobrecarga
		
		System.out.println(ventiladorDoMunif);
		System.out.println(v);
		System.out.println(outroVentilador);
		
	}
	
	*/
}
