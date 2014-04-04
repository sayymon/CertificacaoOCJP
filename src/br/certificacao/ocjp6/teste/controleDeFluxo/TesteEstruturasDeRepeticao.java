package br.certificacao.ocjp6.teste.controleDeFluxo;

import org.junit.Test;

import br.certificacao.ocjp6.controleDeFluxo.EstruturasDeRepetição;

public class TesteEstruturasDeRepeticao {
    
	EstruturasDeRepetição estruturas = new EstruturasDeRepetição();
	
	@Test
	public void testExemploWhile() {
		estruturas.exemploWhile();
	}

	@Test
	public void testExemploDoWhile() {
		estruturas.exemploDoWhile();
	}

	@Test
	public void testExemploFor() {
		estruturas.exemploFor();
	}

	@Test
	public void testExemploEnhancedFor() {
		estruturas.exemploEnhancedFor();
	}

	@Test
	public void testExemploForComRotulo() {
		estruturas.exemploForComRotulo();
	}

}
