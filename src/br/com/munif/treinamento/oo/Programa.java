/*
       Comentários de mais de uma linha
       estou devendo o JavaDoc   
*/

package br.com.munif.treinamento.oo;

public class Programa {
		
	public static void main(String[] args) {  //Começa aqui
		Ventilador ventiladorDoMunif;
		ventiladorDoMunif=new Ventilador();
		ventiladorDoMunif.mostraVelocidade();
		ventiladorDoMunif.botao3();
		ventiladorDoMunif.mostraVelocidade();
		System.out.println ("O Custo é de "+(5*ventiladorDoMunif.getVelocidade()));
		ventiladorDoMunif.setVelocidade(0);
		ventiladorDoMunif.mostraVelocidade();
		ventiladorDoMunif.setVelocidade(-5);
		
		ventiladorDoMunif.setVelocidade("5");
		ventiladorDoMunif.mostraVelocidade();
		
		Ventilador v1=new Ventilador();    //Sobrecarga
		Ventilador v2=new Ventilador(2);   //Sobrecarga
		Ventilador v3=new Ventilador("3"); //Sobrecarga
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
