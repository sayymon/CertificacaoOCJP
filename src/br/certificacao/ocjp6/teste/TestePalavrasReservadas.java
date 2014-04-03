package br.certificacao.ocjp6.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.certificacao.ocjp6.utils.PalavrasReservadas;

public class TestePalavrasReservadas {

	@Test
	public void testGetDescricaoPalavraReservada() {
		for (String palavraReservada : PalavrasReservadas.getListaPalavrasReservadas()) {
			assertNotNull(PalavrasReservadas.getDescricaoPalavraReservada(palavraReservada));
		}
		
		
	}

	@Test
	public void testGetListaPalavrasReservadas() {
		assertNotNull(PalavrasReservadas.getListaPalavrasReservadas());
	}

}
