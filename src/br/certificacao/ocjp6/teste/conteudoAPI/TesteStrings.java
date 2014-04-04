package br.certificacao.ocjp6.teste.conteudoAPI;

import org.junit.Test;

import br.certificacao.ocjp6.conteudoAPI.Strings;

public class TesteStrings {
	
	Strings strings = new Strings();
	
	@Test
	public void testExemploPoolDeStrings() {
		strings.exemploPoolDeStrings();
	}
	
	@Test
	public void testeExemploStringBuilder() {
		strings.exemploStringBuilder();

	}

}
