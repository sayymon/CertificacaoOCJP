package br.certificacao.ocjp6.teste.controleDeFluxo;

import org.junit.Test;

import br.certificacao.ocjp6.controleDeFluxo.Excess�es;

public class TesteExcess�es {
	
	Excess�es excessoes = new Excess�es();
	
	@Test
	public void testExemploCapturaDeExcessoes() {
		excessoes.exemploCapturaDeExcessoes();
	}

	@Test
	public void testExemploStackOverflowException() {
		//excessoes.exemploStackOverflowException();
	}	
	

	@Test
	public void testExemploAssertivas() {
		Excess�es.Assertivas assertivas = new Excess�es.Assertivas(); ;
		
		assertivas.m2();
	}
	
}
