package br.certificacao.ocjp6.teste.programacaoConcorrente;

import static org.junit.Assert.fail;

import org.junit.Test;

import br.certificacao.ocjp6.programacaoConcorrente.Threads;

public class TesteThreads {
	
	Threads threads = new Threads();
	
	@Test
	public void testExemploCriacaoThread() {
		threads.exemploCriacaoThread();
	}

	@Test
	public void testExemploPriorizacaoDeThreads() {
		threads.exemploPriorizacaoDeThreads();
	}

	
	@Test
	public void testExemploSincronização() throws InterruptedException {
		threads.exemploSincronização();
	}	


}
