package br.certificacao.ocjp6.conteudoAPI;

import java.util.Locale;

/**
 * <h1>Internacionaliza��o</h1> <br/>
 * � a capacidade da aplica��o suportar a sua configura��o para diversas regi�es
 * ou seja permitir que datas n�meros e mensagens sejam exibidas de acordo a
 * regiao.<br/>
 * <br/>
 * <h2>Principal classe utilizada para isso � a {@link Locale}.</h2><br/>
 * <br/>
 * � uma classe que representa uma localiza��o ou at� mesmo uma regi�o ,como
 * pais e etc . S�o Imut�veis.
 * 
 * Possui suas pr�prias constantes para as principais localidades
 * 
 * 
 * @author Saymon
 * 
 */
public class Internacionaliza��o {
	/**
	 * <h1>Exemplo Obtendo Inst�ncia Locale Default</h1>
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
	 * <h1>Exemplo Configurando uma Inst�ncia de Locale</h1>
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
