package br.certificacao.ocjp6.teste.conteudoAPI;

import org.junit.Test;

import br.certificacao.ocjp6.conteudoAPI.Serializa��o;

public class TesteSerializa��o {
	Serializa��o serial = new Serializa��o();
	@Test
	public void testExemploSerializarDeserializar() {
		serial.exemploSerializarDeserializar();
	}

	@Test
	public void testExemploAtributoTransiente() {
		serial.exemploAtributoTransiente();
	}	
	
}
