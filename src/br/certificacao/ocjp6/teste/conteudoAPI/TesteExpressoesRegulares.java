package br.certificacao.ocjp6.teste.conteudoAPI;

import org.junit.Test;

import br.certificacao.ocjp6.conteudoAPI.ExpressoesRegulares;

public class TesteExpressoesRegulares {
	ExpressoesRegulares expressoesRegulares = new ExpressoesRegulares();
	
	@Test
	public void testExemploPatternMatcher() {
		expressoesRegulares.exemploPatternMatcher();
	}

	@Test
	public void testExemploScanner() {
		expressoesRegulares.exemploScanner();
	}	

	@Test
	public void testExemploConjuntoRanges() {
		expressoesRegulares.exemploConjuntoRanges();
	}	

	@Test
	public void testExemploQuantificadores() {
		expressoesRegulares.exemploQuantificadores();
	}	
		
	
}
