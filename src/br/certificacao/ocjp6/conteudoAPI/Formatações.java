package br.certificacao.ocjp6.conteudoAPI;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * <h1>Formata��es</h1> <h2> {@link DateFormat}</h2> <br/>
 * Classe Abstrata para convers�o de tipos de datas para String e vice-versa
 * baseada nas localidades e estilos.<br/>
 * Herdada e implementada por {@link SimpleDateFormat}. <br/>
 * Existem 4 estilos pr�-definidos para formata��o de datas que s�o
 * representados por constantes do tipo <b>int</b> na pr�pria classe que s�o as
 * <code>SHORT,MEDIUM,LONG e FULL</code><br/>
 * <br/>
 * Para construirmos uma inst�ncia de DateFormat devemos utilizar o m�todo
 * est�tico <code>getInstance()</code> que retorna um formatador de data e hora
 * conforme a localidade da maquina contendo como estilo o padr�o
 * <code>SHORT</code> Para convers�o apenas de data sem hor�rio podemos
 * construir uma inst�ncia de DateFormat com o m�todo est�tico
 * <code>getDateInstance()</code> que retorna um formatador de data conforme a
 * localidade da maquina contendo como estilo o padr�o que tem suas varia��es
 * podendo conter <code>getDateInstance(int estilo)</code> e
 * <code>getDateInstance(int estilo, {@link Locale} )</code> <br/>
 * <br/>
 * E para formatar somente o hor�rio construirmos uma inst�ncia de DateFormat
 * utilizando o m�todo
 * <code>getDateTimeInstance() e getDateTimeInstance( {@link Locale} )</code>
 * <h2> {@link NumberFormat}</h2> Classe abstrata para formata��o de Tipos
 * num�ricos para String e vice-versa baseada nas localidades {@link Locale}<br/>
 * <br/>
 * Para obter uma inst�ncia deve se utilizar m�todos de Fabrica como o
 * <code>getInstance()</code> e <code>getNumberInstance()</code><br/>
 * <br/>
 * Com eles podemos formatar n�meros de prop�sito geral; <br/>
 * 
 * Podemos obter formata��o conforme a localidade informada com o
 * <code>getInstance({@link Locale} l)</code> e
 * <code>getNumberInstance({@link Locale} l)</code><br/>
 * 
 * Podemos formatar valores monet�rios para localidade default com o m�todo<br/>
 * <code>getCurrencyInstance()</code> ou com localidade informada<br/>
 * <code>getCurrencyInstance({@link Locale} l)</code><br/>
 * <br/>
 * Para o objeto instanciado � poss�vel verificar os d�gitos decimais com os
 * m�todos.<br/>
 * <code>int getMaximumFractionDigits(), void setMaximumFractionDigits(int i) e void setParseIntegerOnly()</code>
 * que serve para ignorar as casas decimais <br/>
 * <br/>
 * O m�todo <code>String format(float ou double)</code> obtem uma String
 * formatada conforme a localidade setada no NumberFormat<br/>
 * Para converter de String para Number utiliza-se o m�todo
 * <code>parse(String)</code> que pode lan�ar uma excess�o do tipo
 * {@link ParseException} que � checked.<br/>
 * 
 * @author Saymon
 * 
 */
public class Formata��es {
	/**
	 * <h1>Exemplo NumberFormat Localidade Default</h1> <br/>
	 * <blockquote>
	 * 
	 * <pre>
	 * NumberFormat formatadorNumerico = NumberFormat.getNumberInstance();
	 * System.out.println(formatadorNumerico.format(130.566));
	 * </pre>
	 * 
	 * </blockquote>
	 * 
	 * 
	 * Conforme o padr�o brasileiro capturado da configura��o da minha maquina;
	 * Apresenta o resultado convertido : 130,566
	 */
	public void exemploNumberFormatLocalidadeDefault() {

		NumberFormat formatadorNumerico = NumberFormat.getNumberInstance();
		System.out.println(formatadorNumerico.format(130.566));
	}

	/**
	 * <h1>Exemplo NumberFormat Localidade Informada</h1> <br/>
	 * <blockquote>
	 * 
	 * <pre>
	 * NumberFormat formatadorNumerico = NumberFormat.getNumberInstance(Locale.US);
	 * System.out.println(formatadorNumerico.format(157.566));
	 * </pre>
	 * 
	 * </blockquote>
	 * 
	 * 
	 * Conforme o padr�o Americano Informado; Apresenta o resultado convertido :
	 * 157.566
	 */
	public void exemploNumberFormatLocalidadeInformada() {

		NumberFormat formatadorNumerico = NumberFormat
				.getNumberInstance(Locale.US);
		System.out.println(formatadorNumerico.format(157.566));
	}

	/**
	 * <h1>Exemplo getCurrencyInstance Localidade Default</h1> <br/>
	 * <blockquote>
	 * 
	 * <pre>
	 * NumberFormat formatadorNumerico = NumberFormat.getCurrencyInstance();
	 * System.out.println(formatadorNumerico.format(130.566));
	 * </pre>
	 * 
	 * </blockquote>
	 * 
	 * 
	 * Conforme o padr�o brasileiro capturado da configura��o da minha maquina;
	 * Apresenta o resultado convertido : R$ 130,57
	 */
	public void exemploGetCurrencyInstanceLocalidadeDefault() {

		NumberFormat formatadorNumerico = NumberFormat.getCurrencyInstance();
		System.out.println(formatadorNumerico.format(130.566));
	}

	/**
	 * <h1>Exemplo getCurrencyInstance Localidade Informada</h1> <br/>
	 * <blockquote>'.
	 * 
	 * <pre>
	 * NumberFormat formatadorNumerico = NumberFormat.getCurrencyInstance(Locale.US);
	 * System.out.println(formatadorNumerico.format(157.566));
	 * </pre>
	 * 
	 * </blockquote>
	 * 
	 * 
	 * Conforme o padr�o Americano Informado; Apresenta o resultado convertido :
	 * $157.57
	 */
	public void exemploGetCurrencyInstanceLocalidadeInformada() {

		NumberFormat formatadorNumerico = NumberFormat
				.getCurrencyInstance(Locale.US);
		System.out.println(formatadorNumerico.format(157.566));
	}

	/**
	 * <h1>Exemplo de Data Corrente Formatada com DateFormat e Locale Default</h1>
	 * 
	 * <pre>
	 * DateFormat formatadorDataHora = DateFormat.getInstance();
	 * System.out.println(formatadorDataHora.format(new Date()));
	 * </pre>
	 * 
	 * Apresenta : 04/04/14 11:15
	 */
	public void exemploDateFormatLocaleDefault() {
		DateFormat formatadorDataHora = DateFormat.getInstance();
		System.out.println(formatadorDataHora.format(new Date()));

	}

	/**
	 * <h1>Exemplo de Apenas Data sem hor�rio Formatada com DateFormat e Locale
	 * Default</h1>
	 * 
	 * <pre>
	 * DateFormat formatadorData = DateFormat.getDateInstance();
	 * System.out.println(formatadorData.format(new Date()));
	 * </pre>
	 * 
	 * Apresenta :04/04/2014
	 */

	public void exemploDateFormatApenasDataSemHorario() {
		DateFormat formatadorData = DateFormat.getDateInstance();
		System.out.println(formatadorData.format(new Date()));

	}

	/**
	 * <h1>Exemplo de Apenas Data sem hor�rio Formatada com DateFormat Locale e
	 * Estilos Informados</h1>
	 * 
	 * <pre>
	 * DateFormat formatadorData = DateFormat.getDateInstance(DateFormat.SHORT,
	 * 		Locale.US);
	 * System.out.println("Estilo SHORT e Localidade: "
	 * 		+ formatadorData.format(new Date()));
	 * 
	 * formatadorData = DateFormat.getDateInstance(DateFormat.SHORT);
	 * System.out
	 * 		.println("Apenas Estilo SHORT : " + formatadorData.format(new Date()));
	 * 
	 * formatadorData = DateFormat.getDateInstance(DateFormat.LONG);
	 * System.out.println("Apenas Estilo LONG : " + formatadorData.format(new Date()));
	 * 
	 * formatadorData = DateFormat.getDateInstance(DateFormat.MEDIUM);
	 * System.out.println("Apenas Estilo MEDIUM : "
	 * 		+ formatadorData.format(new Date()));
	 * 
	 * formatadorData = DateFormat.getDateInstance(DateFormat.FULL);
	 * System.out.println("Apenas Estilo FULL : " + formatadorData.format(new Date()));
	 * </pre>
	 * 
	 * Apresenta :<br/>
	 * Estilo SHORT e Localidade: 4/4/14<br/>
	 * Apenas Estilo SHORT : 04/04/14<br/>
	 * Apenas Estilo LONG : 4 de Abril de 2014<br/>
	 * Apenas Estilo MEDIUM : 04/04/2014<br/>
	 * Apenas Estilo FULL : Sexta-feira, 4 de Abril de 2014<br/>
	 * 
	 */
	public void exemploDateFormatApenasDataSemHorarioLocaleEstiloInformados() {
		DateFormat formatadorData = DateFormat.getDateInstance(
				DateFormat.SHORT, Locale.US);
		System.out.println("Estilo SHORT e Localidade: "
				+ formatadorData.format(new Date()));

		formatadorData = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("Apenas Estilo SHORT : "
				+ formatadorData.format(new Date()));

		formatadorData = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("Apenas Estilo LONG : "
				+ formatadorData.format(new Date()));

		formatadorData = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("Apenas Estilo MEDIUM : "
				+ formatadorData.format(new Date()));

		formatadorData = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("Apenas Estilo FULL : "
				+ formatadorData.format(new Date()));
	}

}
