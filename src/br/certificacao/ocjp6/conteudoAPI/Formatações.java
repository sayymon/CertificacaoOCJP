package br.certificacao.ocjp6.conteudoAPI;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * <h1>Formatações</h1> <h2> {@link DateFormat}</h2> <br/>
 * Classe Abstrata para conversão de tipos de datas para String e vice-versa
 * baseada nas localidades e estilos.<br/>
 * Herdada e implementada por {@link SimpleDateFormat}. <br/>
 * Existem 4 estilos pré-definidos para formatação de datas que são
 * representados por constantes do tipo <b>int</b> na própria classe que são as
 * <code>SHORT,MEDIUM,LONG e FULL</code><br/>
 * <br/>
 * Para construirmos uma instância de DateFormat devemos utilizar o método
 * estático <code>getInstance()</code> que retorna um formatador de data e hora
 * conforme a localidade da maquina contendo como estilo o padrão
 * <code>SHORT</code> Para conversão apenas de data sem horário podemos
 * construir uma instância de DateFormat com o método estático
 * <code>getDateInstance()</code> que retorna um formatador de data conforme a
 * localidade da maquina contendo como estilo o padrão que tem suas variações
 * podendo conter <code>getDateInstance(int estilo)</code> e
 * <code>getDateInstance(int estilo, {@link Locale} )</code> <br/>
 * <br/>
 * E para formatar somente o horário construirmos uma instância de DateFormat
 * utilizando o método
 * <code>getDateTimeInstance() e getDateTimeInstance( {@link Locale} )</code>
 * <h2> {@link NumberFormat}</h2> Classe abstrata para formatação de Tipos
 * numéricos para String e vice-versa baseada nas localidades {@link Locale}<br/>
 * <br/>
 * Para obter uma instância deve se utilizar métodos de Fabrica como o
 * <code>getInstance()</code> e <code>getNumberInstance()</code><br/>
 * <br/>
 * Com eles podemos formatar números de propósito geral; <br/>
 * 
 * Podemos obter formatação conforme a localidade informada com o
 * <code>getInstance({@link Locale} l)</code> e
 * <code>getNumberInstance({@link Locale} l)</code><br/>
 * 
 * Podemos formatar valores monetários para localidade default com o método<br/>
 * <code>getCurrencyInstance()</code> ou com localidade informada<br/>
 * <code>getCurrencyInstance({@link Locale} l)</code><br/>
 * <br/>
 * Para o objeto instanciado é possível verificar os dígitos decimais com os
 * métodos.<br/>
 * <code>int getMaximumFractionDigits(), void setMaximumFractionDigits(int i) e void setParseIntegerOnly()</code>
 * que serve para ignorar as casas decimais <br/>
 * <br/>
 * O método <code>String format(float ou double)</code> obtem uma String
 * formatada conforme a localidade setada no NumberFormat<br/>
 * Para converter de String para Number utiliza-se o método
 * <code>parse(String)</code> que pode lançar uma excessão do tipo
 * {@link ParseException} que é checked.<br/>
 * 
 * @author Saymon
 * 
 */
public class Formatações {
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
	 * Conforme o padrão brasileiro capturado da configuração da minha maquina;
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
	 * Conforme o padrão Americano Informado; Apresenta o resultado convertido :
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
	 * Conforme o padrão brasileiro capturado da configuração da minha maquina;
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
	 * Conforme o padrão Americano Informado; Apresenta o resultado convertido :
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
	 * <h1>Exemplo de Apenas Data sem horário Formatada com DateFormat e Locale
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
	 * <h1>Exemplo de Apenas Data sem horário Formatada com DateFormat Locale e
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
