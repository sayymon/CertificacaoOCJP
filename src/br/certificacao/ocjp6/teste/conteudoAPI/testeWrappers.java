package br.certificacao.ocjp6.teste.conteudoAPI;

import org.junit.Test;

import br.certificacao.ocjp6.conteudoAPI.Wrappers;

public class testeWrappers {
	Wrappers wrappers = new Wrappers();
	
	@Test
	public void testExemploAutoBoxing() {
		wrappers.exemploAutoBoxing();
	}

	@Test
	public void testExemploPoolDeWrapper() {
		wrappers.exemploPoolDeWrapper();
	}

}
