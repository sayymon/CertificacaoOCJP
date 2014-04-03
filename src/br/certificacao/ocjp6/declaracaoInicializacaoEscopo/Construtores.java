package br.certificacao.ocjp6.declaracaoInicializacaoEscopo;

/**
 * <h1>Construtores</h1>
 * 
 * São os metodos especiais ,utilizados para criação/instancia de novos objetos.<br/>
 * Devem ter o mesmo nome da classe(case-sensitive) e não tem tipo de retorno(inclusive void).<br/>
 * Os Construtores não são herdados por subclasses.<br/>
 * Se o contrutor não for escrito explicitamente na classe o compilador gera um contrutor default automaticamente sem argumentos.<br/> 
  * @author Saymon
 *
 */

public class Construtores {
	
	/**
	 * Quando não é feita a chamada ao construtor da superclasse
	 * o compilador gera uma chamada super() ao construtor default da superclasse
	 * neste caso esta chamando {@link Object}
	 */
	public Construtores() {
		super();
	}
	
	/**
	 * Um construtor pode chamar outros construtores da sua classe usando this(); e de sua superclasse usando super();
	 * é permitida a sobreCarga de Construtores
	 * @param s
	 */

	public Construtores(String s){
		this();
	}
	
}
