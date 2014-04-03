package br.certificacao.ocjp6.declaracaoInicializacaoEscopo;

import br.certificacao.ocjp6.utils.PalavrasReservadas;

/**
 * <h1>Declaração, Inicialização e Escopo: Identificadores válidos, declaração
 * de classes e construtores</h1> Um Indentificador nomeia :
 * Variaveis,Metodos,Classes,Interfaces e Enumeradores<br/>
 * Existem duas principais regras : 
 * 1ª Um Indentificador não pode coincidir com nenhuma {@link PalavrasReservadas}
 * do JAVA que são escritas exclusivamente com todas as letras minusculas.<br/>
 * 2ª Um Indentificador pode ser composto por : <br/>
 * Letras inclusive caracteres acentuados e alfabetos não Latinos.<br/>
 * _ , $ ou até 0-9 apartir do segundo caracter.<br/>
 * ou por codigo unicode <br/>
 */

public class IdentificadoresVálidos {

	
	public IdentificadoresVálidos() {
		
	}
	
	
	private String identificadorComAcentuação;
	private String _identificadorComUnderLine;
	private String $identificadorComCifrao;
	private String identificadorComNumeros0123456789;
	private String \u0064 ;// Corresponde a letra 'D'
	
	/**
	 * Exemplo de Metodo com Identificador com Acentuação 
	 * @return String
	 */
	public String getIdentificadorComAcentuação() {
		return identificadorComAcentuação;
	}
	public void setIdentificadorComAcentuação(String identificadorComAcentuação) {
		this.identificadorComAcentuação = identificadorComAcentuação;
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
