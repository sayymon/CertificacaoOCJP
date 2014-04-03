package br.certificacao.ocjp6.teste.declaracaoInicializacaoEscopo;

import static org.junit.Assert.*;

import org.junit.Test;

import br.certificacao.ocjp6.declaracaoInicializacaoEscopo.Arrays;

public class testeArrays {

	@Test
	public void testAcessandoPosicaoInvalida() {
		Arrays arrays = new Arrays();
		arrays.acessandoPosicaoInvalida();
	}

}
