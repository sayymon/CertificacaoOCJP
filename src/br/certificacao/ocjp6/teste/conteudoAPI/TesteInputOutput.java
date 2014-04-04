package br.certificacao.ocjp6.teste.conteudoAPI;

import org.junit.Test;

import br.certificacao.ocjp6.conteudoAPI.InputOutput;

public class TesteInputOutput {
	
	InputOutput inputOutput = new InputOutput();
	
	@Test
	public void testExemploFile() {
		inputOutput.exemploFile();
	}
	
	
	@Test
	public void testExemploAlteracaoCriacaoDeArquivos(){
		inputOutput.exemploAlteracaoCriacaoDeArquivos();
	}
	
	@Test
	public void testExemploEscritaELeituraDeArquivos(){
		inputOutput.exemploEscritaELeituraDeArquivos();
	}
	
	@Test
	public void testExemploConsole(){
		inputOutput.exemploConsole();
	}	
	

}
