package br.certificacao.ocjp6.teste.conteudoAPI;

import org.junit.Test;

import br.certificacao.ocjp6.conteudoAPI.Internacionaliza��o;

public class TesteInternacionaliza��o {
	Internacionaliza��o internacionaliza��o = new Internacionaliza��o();
	@Test
	public void testExemploObtendoInstanciaLocaleDefault() {
		internacionaliza��o.exemploObtendoInstanciaLocaleDefault();
	}

	@Test
	public void testExemploConfigurandoInstanciaLocale() {
		internacionaliza��o.exemploConfigurandoInstanciaLocale();
	}	
	
}
