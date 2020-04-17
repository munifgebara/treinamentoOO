/*
       Comentários de mais de uma linha
       estou devendo o JavaDoc   
*/

package br.com.munif.treinamento.oo;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import br.com.munif.treinamento.oo.entidades.*;
import br.com.munif.treinamento.oo.heranca.A;
import br.com.munif.treinamento.oo.heranca.B;
import br.com.munif.treinamento.oo.heranca.C;

// private só acessível do próprio atefato
// public acessível de todos os atefatos
// NADA (package) acessível apenas do pacote
// protected  acessível no mesmo pacote e em suas subclasses



// THREADS E COLEÇÕES

public class Programa {
	
	public static void main(String ...args) {
		Map<String,Object> mapa=new HashMap<String,Object>();
		
		mapa.put("um", 1);
		mapa.put("dois", 2);
		mapa.put("três", 3);
		mapa.put("quatro", 4);
		mapa.put("cinco", "five");
		mapa.put("seis", 6);
		
		String chave="cinco";
		
		Object valor=mapa.get(chave);
	
		//Nosso código é feio, substituir por Pattern Strategy
		if (valor instanceof String) {
			String valorString=(String)valor;
			System.out.println (chave+" vale "+valorString.toUpperCase());	
		}
		else {
			System.out.println (chave+" vale "+valor);
		}
		
        
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	public static void mainSet(String ...args) {
		//Collections 
		
		// 3 Interfaces LIST    SET     MAP    
		
		//Set conjunto=new HashSet();
		Set<String> conjunto=new TreeSet<String>();
		
		conjunto.add("Laranja");
		conjunto.add("Abacaxi");
		conjunto.add("Banana");
		System.out.println (conjunto.size());
		conjunto.add("Abacaxi");
		System.out.println (conjunto.size());
		
		System.out.println (conjunto);
		conjunto.remove("Abacaxi");
		System.out.println (conjunto.size());
		
		System.out.println (conjunto);
		
		System.out.println (conjunto.contains("Arroz"));
		System.out.println (conjunto.contains("Abacaxi"));
		
		for (Object obj:conjunto) {
			System.out.println (obj);
		}
		

	}

	
	public static void mainList(String ...args) {
		//Collections 
		
		// 3 Interfaces LIST    SET     MAP    
		
		List lista=new ArrayList();
		
		lista.add("Laranja");
		lista.add("Abacaxi");
		lista.add("Banana");
		System.out.println (lista.size());
		lista.add("Abacaxi");
		System.out.println (lista.size());
		
		System.out.println (lista);
		
		System.out.println (lista.contains("Arroz"));
		System.out.println (lista.contains("Abacaxi"));
		
		lista.remove(2);
		System.out.println (lista);
		lista.remove("Laranja");
		System.out.println (lista);
		
	}
	
	public static void arrays(String ...args) {
		//              0 1 2 3 4 5 6  7 
		int numeros[]={99,1,2,3,5,8,13,21};
		
		System.out.println ("O tamanho array é "+numeros.length);
		System.out.println ("O primeiro do array "+numeros[0]);
		System.out.println ("O segundo do array "+numeros[1]);
		System.out.println ("O último elemento do array "+numeros[numeros.length-1]);
		
		String cartela[][][][]=new String[100][100][100][100];
		for (int i=0;i<100;i++) {
			System.out.println (i+" "+cartela[i]);
		}
		// Os arrays são estruturas de tamanho imutável  
	}
	
	
	public static void mainOOPs(String[] args) {
		A c=new C();
		c.metodo();
	}
		
	public static void mainOutrosss(String[] args) {  //Começa aqui
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
