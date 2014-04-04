package br.certificacao.ocjp6.teste.conteudoAPI;

import org.junit.Test;

import br.certificacao.ocjp6.conteudoAPI.Formata��es;

public class TesteFormata��es {
	Formata��es formatacoes = new Formata��es();

	@Test
	public void testExemploNumberFormatLocalidadeDefault() {
		formatacoes.exemploNumberFormatLocalidadeDefault();
	}

	@Test
	public void testExemploNumberFormatLocalidadeInformada() {
		formatacoes.exemploNumberFormatLocalidadeInformada();
	}

	@Test
	public void testExemploGetCurrencyInstanceLocalidadeDefault() {
		formatacoes.exemploGetCurrencyInstanceLocalidadeDefault();
	}

	@Test
	public void testExemploGetCurrencyInstanceLocalidadeInformada() {
		formatacoes.exemploGetCurrencyInstanceLocalidadeInformada();
	}

	@Test
	public void testExemploDateFormatLocaleDefault() {
		formatacoes.exemploDateFormatLocaleDefault();
	}

	@Test
	public void testExemploDateFormatApenasDataSemHorario() {
		formatacoes.exemploDateFormatApenasDataSemHorario();
	}

	@Test
	public void testExemploDateFormatApenasDataSemHorarioLocaleEstiloInformados() {
		formatacoes
				.exemploDateFormatApenasDataSemHorarioLocaleEstiloInformados();
	}

	@Test
	public void testExemploConversaoStringDate() {
		formatacoes.exemploConversaoStringDate();
	}

}
