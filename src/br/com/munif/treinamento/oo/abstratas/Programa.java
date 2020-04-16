package br.com.munif.treinamento.oo.abstratas;

public class Programa {

	public static void comeco() {

		Diretor d = new Diretor();
		d.setNome("Chrystiano");
		d.setDiretoria("Negócios");
		Aluno a = new Aluno();
		a.setNome("Cláudio");
		a.setCurso("ADS");
		a.setRa(7366);
		Professor p = new Professor();
		p.setNome("Munif");
		p.setDisciplina("OO");
		Prova pr=new Prova();
		Mapa m=new Mapa();

		
//		pr.descreve();
//		m.descreve();
//		mostraDados(d);
//		mostraDados(a);
//		mostraDados(p);
		
		// Objetos  p a d m pr
		
		imprimeMesmo (p);
		imprimeMesmo (a);
		imprimeMesmo (d);
		imprimeMesmo (m);
		imprimeMesmo (pr);

	}
	
	public static void imprimeMesmo(Imprimivel im) {
		im.imprime();
	}
	
	public static void mostraDados(Pessoa pessoa) {
		
		pessoa.mostra();
		
		
		
		
//		System.out.println ("Nome:"+pessoa.getNome());
//		if (pessoa instanceof Diretor) {
//			System.out.println ("Diretor");
//		}
//		if (pessoa instanceof Aluno) {
//			System.out.println ("Aluno");
//		}
//		if (pessoa instanceof Professor) {
//			System.out.println ("Professor");
//		}
		
		
	}
	
	
}