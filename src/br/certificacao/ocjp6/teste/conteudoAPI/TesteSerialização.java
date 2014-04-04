package br.certificacao.ocjp6.teste.conteudoAPI;

import org.junit.Test;

import br.certificacao.ocjp6.conteudoAPI.Serialização;

public class TesteSerialização {
	Serialização serial = new Serialização();
	@Test
	public void testExemploSerializarDeserializar() {
		serial.exemploSerializarDeserializar();
	}

	@Test
	public void testExemploAtributoTransiente() {
		serial.exemploAtributoTransiente();
	}	
	
}
