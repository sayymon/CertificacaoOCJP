package br.certificacao.ocjp6.conteudoAPI;

import java.util.Locale;

/**
 * <h1>Internacionalização</h1> <br/>
 * É a capacidade da aplicação suportar a sua configuração para diversas regiões
 * ou seja permitir que datas números e mensagens sejam exibidas de acordo a
 * regiao.<br/>
 * <br/>
 * <h2>Principal classe utilizada para isso é a {@link Locale}.</h2><br/>
 * <br/>
 * É uma classe que representa uma localização ou até mesmo uma região ,como
 * pais e etc . São Imutáveis.
 * 
 * Possui suas próprias constantes para as principais localidades
 * 
 * 
 * @author Saymon
 * 
 */
public class Internacionalização {
	/**
	 * <h1>Exemplo Obtendo Instância Locale Default</h1>
	 * 
	 * <pre>
	 * Locale locale = Locale.getDefault();
	 * System.out.println(locale);
	 * </pre>
	 * 
	 * Apresenta : pt_BR
	 * 
	 * 
	 */
	public void exemploObtendoInstanciaLocaleDefault() {
		Locale locale = Locale.getDefault();

		System.out.println(locale);

	}

	/**
	 * <h1>Exemplo Configurando uma Instância de Locale</h1>
	 * 
	 * <pre>
	 * 		Locale locale = new Locale("en", "US");
	 * 		System.out.println(locale);
	 * 		//ou 
	 * 		locale = Locale.US;
	 * 		System.out.println(locale);	 
	 * </pre>
	 * 
	 * Apresenta : en_US<br/>
	 * 			   en_US<br/>
	 * 
	 * 
	 */
	public void exemploConfigurandoInstanciaLocale() {
		Locale locale = new Locale("en", "US");
		System.out.println(locale);
		// ou
		locale = Locale.US;
		System.out.println(locale);

	}
}
