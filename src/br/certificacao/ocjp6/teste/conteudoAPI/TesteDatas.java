package br.certificacao.ocjp6.teste.conteudoAPI;

import org.junit.Test;

import br.certificacao.ocjp6.conteudoAPI.Datas;

public class TesteDatas {
	Datas datas = new Datas();
	@Test
	public void testExemploDate() {
		datas.exemploDate();
	}

	@Test
	public void testExemploDateConfigurandoUmaData() {
		datas.exemploDateConfigurandoUmaData();
	}	
	
	@Test
	public void testExemploObtendoInstanciaCalendarDefault() {
		datas.exemploObtendoInstanciaCalendarDefault();
	}
	

	@Test
	public void testExemploManipulandoDatasComCalendar() {
		datas.exemploManipulandoDatasComCalendar();
	}
	
	
	
}
