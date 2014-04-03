package br.certificacao.ocjp6.declaracaoInicializacaoEscopo;

import br.certificacao.ocjp6.utils.PalavrasReservadas;

/**
 * <h1>Declara��o, Inicializa��o e Escopo: Identificadores v�lidos, declara��o
 * de classes e construtores</h1> Um Indentificador nomeia :
 * Variaveis,Metodos,Classes,Interfaces e Enumeradores<br/>
 * Existem duas principais regras : 
 * 1� Um Indentificador n�o pode coincidir com nenhuma {@link PalavrasReservadas}
 * do JAVA que s�o escritas exclusivamente com todas as letras minusculas.<br/>
 * 2� Um Indentificador pode ser composto por : <br/>
 * Letras inclusive caracteres acentuados e alfabetos n�o Latinos.<br/>
 * _ , $ ou at� 0-9 apartir do segundo caracter.<br/>
 * ou por codigo unicode <br/>
 */

public class IdentificadoresV�lidos {

	
	public IdentificadoresV�lidos() {
		
	}
	
	
	private String identificadorComAcentua��o;
	private String _identificadorComUnderLine;
	private String $identificadorComCifrao;
	private String identificadorComNumeros0123456789;
	private String \u0064 ;// Corresponde a letra 'D'
	
	/**
	 * Exemplo de Metodo com Identificador com Acentua��o 
	 * @return String
	 */
	public String getIdentificadorComAcentua��o() {
		return identificadorComAcentua��o;
	}
	public void setIdentificadorComAcentua��o(String identificadorComAcentua��o) {
		this.identificadorComAcentua��o = identificadorComAcentua��o;
	}

	/**
	 * Exemplo de Metodo com Identificador com Underline "_"
	 * @return String
	 */
	
	public String get_identificadorComUnderLine() {
		return _identificadorComUnderLine;
	}
	public void set_identificadorComUnderLine(String _identificadorComUnderLine) {
		this._identificadorComUnderLine = _identificadorComUnderLine;
	}

	/**
	 * Exemplo de Metodo com Identificador com Cifrao "$"
	 * @return String
	 */
	
	public String get$identificadorComCifrao() {
		return $identificadorComCifrao;
	}
	public void set$identificadorComCifrao(String $identificadorComCifrao) {
		this.$identificadorComCifrao = $identificadorComCifrao;
	}

	/**
	 * Exemplo de Metodo com Identificador Numerico "0-9"
	 * @return String
	 */	
	
	public String getIdentificadorComNumeros0123456789() {
		return identificadorComNumeros0123456789;
	}
	public void setIdentificadorComNumeros0123456789(
			String identificadorComNumeros0123456789) {
		this.identificadorComNumeros0123456789 = identificadorComNumeros0123456789;
	}
	public String get\u0064() {
		return d;
	}
	public void set\u0064(String d) {
		this.d = d;
	}

	
	
}
