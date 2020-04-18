package br.com.munif.treinamento.oo.academico;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.munif.treinamento.oo.TurmaCheiaException;

class TurmaTest {

	@Test
	void testMatriculaAcademico() throws TurmaCheiaException {
		Turma t = new Turma("c1", new Disciplina("Teste"));
		t.matriculaAcademico(new Academico(1, "nome"));
		assertEquals(1, t.getQuantidade());
	}

	@Test
	void testMatriculaAcademico2() throws TurmaCheiaException {
		Assertions.assertThrows(TurmaCheiaException.class, () -> {
			Turma t = new Turma("c1", new Disciplina("Teste"));
			t.matriculaAcademico(new Academico(1, "nome1"));
			t.matriculaAcademico(new Academico(2, "nome2"));
			t.matriculaAcademico(new Academico(3, "nome3"));
		});
	}

	@Test
	void testRemoverAcademico() throws Exception {
		Academico a = new Academico(1, "nome");
		Turma t = new Turma("c1", new Disciplina("Teste"));
		t.matriculaAcademico(new Academico(2, "Fulano"));
		t.matriculaAcademico(a);
		t.removerAcademico(a);
		assertEquals(1, t.getQuantidade());
	}

}
