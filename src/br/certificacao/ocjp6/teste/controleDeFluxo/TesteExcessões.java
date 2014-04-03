package br.certificacao.ocjp6.teste.controleDeFluxo;

import org.junit.Test;

import br.certificacao.ocjp6.controleDeFluxo.Excessões;

public class TesteExcessões {
	
	Excessões excessoes = new Excessões();
	
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
		Excessões.Assertivas assertivas = new Excessões.Assertivas(); ;
		
		assertivas.m2();
	}
	
}
