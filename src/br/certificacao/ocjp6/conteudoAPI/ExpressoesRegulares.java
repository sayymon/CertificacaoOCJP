package br.certificacao.ocjp6.conteudoAPI;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <h1>Expressões Regulares(regex)</h1> <br/>
 * São compostas por caracteres literais e metacaracteres para estabelecer
 * padrões de pesquisa ou fazer a quebra em pedaços(tokens).<br/>
 * <br/>
 * <h2>Principais Classes :</h2> <br/>
 * Podemos encontrar a maioria no pacote java.util.regex
 * 
 * <h3>{@link Pattern} e {@link Matcher}</h3> Permitem utilizar expressões
 * regulares para realizar buscas.
 * 
 * <h3>{@link Scanner}</h3> Permite tanto a pesquisa por padrões em uma String
 * quanto a quebra de uma arquivo em String ou Fluxo de IO.
 * 
 * <h2>Metacaracteres basicos</h2>
 * <table border='1'>
 * <tr>
 * <td>
 * Expressão regex</td>
 * <td>
 * Descrição</td>
 * </tr>
 * <tr>
 * <td>
 * \d</td>
 * <td>
 * Localiza Digitos</td>
 * </tr>
 * <tr>
 * <td>
 * \s</td>
 * <td>
 * Localiza espaços em branco</td>
 * </tr>
 * <tr>
 * <td>
 * \w</td>
 * <td>
 * Localiza letras digitos e _ (underline)</td>
 * </tr>
 * <tr>
 * <td>
 * .(ponto)</td>
 * <td>
 * Curinga,localiza uma ocorrencia de qualquer caracter</td>
 * </tr>
 * </table>
 * <br/>
 * Para utilizar uma expressão regular usa-se o escape "\" antes da expressão.<br/>
 * Ex : para Pattern numerico = Pattern.compile("\\d");<br/>
 * 
 * <h2>Metacaracteres Conjuntos e Ranges</h2><br/>
 * O par de Colchetes "[]" define um conjunto de caracteres desejado ou ranges
 * de caracteres.<br/>
 * <br/>
 * Exemplo : <br/>
 * [mY6] : Localiza ocorrencias de m,Y e 6 no texto.<br/>
 * [e-k] : Localiza ocorrencias dentro da faixa de 'e' até 'k' <br/>
 * [3-6b-h] : Localiza ocorrencias dentro da faixa de '3' até '6' ou 'b' até 'h'<br/>
 * <br/>
 * <br/>
 * <h2>Metacaracteres Quantificadores</h2> Permite controlar a quantidade de
 * ocorrencias dos padrões :
 * <table border='1'>
 * <tr>
 * <td>
 * Operador</td>
 * <td>
 * Descrição</td>
 * </tr>
 * <tr>
 * <td>
 * ?</td>
 * <td>
 * Localiza 0 ou uma ocorrencia</td>
 * </tr>
 * <tr>
 * <td>
 * *</td>
 * <td>
 * Localiza 0 ou mais ocorrencias</td>
 * </tr>
 * <tr>
 * <td>
 * +</td>
 * <td>
 * Localiza 1 ou mais ocorrencias</td>
 * </tr>
 * <tr>
 * <td>
 * default</td>
 * <td>
 * Localiza 1 apenas uma ocorrencias</td>
 * </tr>
 * </table>
 * 
 * <br/>
 * Podemos agrupar os padrões em colchetes para aplicar o quantificadores.
 * 
 * @author Saymon
 * 
 */
public class ExpressoesRegulares {

	/**
	 * <h3>Exemplo Pattern Matcher</h3><br/>
	 * Pattern pattern = Pattern.compile("Teste");<br/>
	 * Matcher resultados = pattern.matcher(
	 * "Teste de teste Testando o Teste Testado no Teste Anterior");<br/>
	 * while (resultados.find()) {<br/>
	 * System.out.println("Encontrado o Valor "+resultados.group()+
	 * " na posição "+ resultados.start());<br/>
	 * } <br/>
	 * <b> Resultado :<br/>
	 * Encontrado o Valor Teste na posição 0<br/>
	 * Encontrado o Valor Teste na posição 26<br/>
	 * Encontrado o Valor Teste na posição 43<br/>
	 * </b> <br/>
	 * Agora sem Distinção de minusculas e Maiuscula : <br/>
	 * <br/>
	 * pattern = Pattern.compile("Teste", Pattern.CASE_INSENSITIVE);<br/>
	 * resultados = pattern<br/>
	 * .matcher("Teste de teste Testando o Teste Testado no Teste Anterior");<br/>
	 * while (resultados.find()) {<br/>
	 * System.out.println("Encontrado o Valor " + resultados.group()<br/>
	 * + " na posição " + resultados.start()); <br/>
	 * <b> Resultado :<br/>
	 * Encontrado o Valor Teste na posição 0<br/>
	 * Encontrado o Valor teste na posição 9<br/>
	 * Encontrado o Valor Teste na posição 26<br/>
	 * Encontrado o Valor Teste na posição 43<br/>
	 * </b>
	 * 
	 */
	public void exemploPatternMatcher() {
		Pattern pattern = Pattern.compile("Teste");
		Matcher resultados = pattern
				.matcher("Teste de teste Testando o Teste Testado no Teste Anterior");
		while (resultados.find()) {
			System.out.println("Encontrado o Valor " + resultados.group()
					+ " na posição " + resultados.start());
		}
		System.out.println("Agora sem Distinção de minusculas e Maiuscula :");
		pattern = Pattern.compile("Teste", Pattern.CASE_INSENSITIVE);
		resultados = pattern
				.matcher("Teste de teste Testando o Teste Testado no Teste Anterior");
		while (resultados.find()) {
			System.out.println("Encontrado o Valor " + resultados.group()
					+ " na posição " + resultados.start());
		}
	}

	public void exemploScanner() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String token = null;
		while ((token = scanner.findInLine("Teste")) != null) {
			System.out.println(token);

		}

	}

	public void exemploConjuntoRanges() {
		String texto = "Eu escrevi um texto as 14:52 para verificar os padrões ensinados no capitulo 10";
		System.out.println(texto);
		System.out.println("Apenas vogais");
		Pattern padrao = Pattern.compile("[aeiou]");// Apenas vogais
		Matcher resultados = padrao.matcher(texto);
		while (resultados.find()) {
			System.out.println("Texto no padrão encontrado : "
					+ resultados.group() + " e posição encontrada "
					+ resultados.start());
		}
		System.out.println("Apenas Numeros");
		padrao = Pattern.compile("[0-9]");// Apenas Numeros
		resultados = padrao.matcher(texto);
		while (resultados.find()) {
			System.out.println("Texto no padrão encontrado : "
					+ resultados.group() + " e posição encontrada "
					+ resultados.start());
		}
	}

	/**
	 * <h1>Exemplo de Quantificadores</h1> <br/>
	 * Pattern padrao = Pattern.compile("\\d[Quantificador]");// Foi variado de
	 * * , + , ? e default<br/>
	 * Matcher resultados = padrao.matcher("ab23cd");<br/>
	 * <br/>
	 * while (resultados.find()) {<br/>
	 * System.out.print(resultados.group() + " " + resultados.start());<br/>
	 * }<br/>
	 * <br/>
	 * Resultados :<br/>
	 * <br/>
	 * * -> 0 ou mais ocorrencias : 0 123 2 4 5 6 <br/>
	 * + -> 1 ou mais ocorrencias : 23 2 <br/>
	 * ? -> 0 ou uma ocorrencia : 0 12 23 3 4 5 6 <br/>
	 * default -> 1 e apenas 1 ocorrencia : 2 23 3
	 * 
	 */
	public void exemploQuantificadores() {

		System.out.println("0 ou mais ocorrencias : ");
		Pattern padrao = Pattern.compile("\\d*");// 0 ou mais ocorrencias
		Matcher resultados = padrao.matcher("ab23cd");

		while (resultados.find()) {
			System.out.print(resultados.group() + " " + resultados.start());
		}
		System.out.println("");

		System.out.println("1 ou mais ocorrencias : ");
		padrao = Pattern.compile("\\d+");// 1 ou mais ocorrencias
		resultados = padrao.matcher("ab23cd");

		while (resultados.find()) {
			System.out.print(resultados.group() + " " + resultados.start());
		}
		System.out.println("");

		System.out.println("0 ou uma ocorrencia : ");
		padrao = Pattern.compile("\\d?");// 0 ou uma ocorrencia
		resultados = padrao.matcher("ab23cd");

		while (resultados.find()) {
			System.out.print(resultados.group() + " " + resultados.start());
		}
		System.out.println("");

		System.out.println("1 e apenas 1 ocorrencia ");
		padrao = Pattern.compile("\\d");
		resultados = padrao.matcher("ab23cd");

		while (resultados.find()) {
			System.out.print(resultados.group() + " " + resultados.start());
		}
		System.out.println("");

	}

}
