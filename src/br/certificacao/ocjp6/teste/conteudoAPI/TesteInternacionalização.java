package br.certificacao.ocjp6.teste.conteudoAPI;

import org.junit.Test;

import br.certificacao.ocjp6.conteudoAPI.Internacionalização;

public class TesteInternacionalização {
	Internacionalização internacionalização = new Internacionalização();
	@Test
	public void testExemploObtendoInstanciaLocaleDefault() {
		internacionalização.exemploObtendoInstanciaLocaleDefault();
	}

	@Test
	public void testExemploConfigurandoInstanciaLocale() {
		internacionalização.exemploConfigurandoInstanciaLocale();
	}	
	
}
