package br.certificacao.ocjp6.teste.declaracaoInicializacaoEscopo;

import static org.junit.Assert.*;

import org.junit.Test;

import br.certificacao.ocjp6.declaracaoInicializacaoEscopo.IdentificadoresV�lidos;

public class TesteIdentificadoresV�lidos {

	IdentificadoresV�lidos identificadores = new IdentificadoresV�lidos();
	
	@Test
	public void testIdentificadoresV�lidos() {
		
		assertNotNull(identificadores);

	}

	@Test
	public void testIdentificadorComAcentua��o() {
		identificadores.setIdentificadorComAcentua��o("identificadorComAcentua��o");
		assertEquals("identificadorComAcentua��o", identificadores.getIdentificadorComAcentua��o());
	}

	@Test
	public void test_identificadorComUnderLine() {
		identificadores.set_identificadorComUnderLine("_identificadorComUnderLine");
		assertEquals("_identificadorComUnderLine", identificadores.get_identificadorComUnderLine());
	}


	@Test
	public void test$identificadorComCifrao() {
		identificadores.set$identificadorComCifrao("$identificadorComCifrao");
		assertEquals("$identificadorComCifrao", identificadores.get$identificadorComCifrao());
	}

	@Test
	public void testIdentificadorComNumeros0123456789() {
		identificadores.setIdentificadorComNumeros0123456789("identificadorComNumeros0123456789");
		assertEquals("identificadorComNumeros0123456789", identificadores.getIdentificadorComNumeros0123456789());
	}

	@Test
	public void test\u0064() {
		identificadores.set\u0064("\u0064");
		assertEquals("\u0064", identificadores.get\u0064());
	}

}
