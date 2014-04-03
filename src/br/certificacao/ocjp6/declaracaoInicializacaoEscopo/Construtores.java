package br.certificacao.ocjp6.declaracaoInicializacaoEscopo;

/**
 * <h1>Construtores</h1>
 * 
 * S�o os metodos especiais ,utilizados para cria��o/instancia de novos objetos.<br/>
 * Devem ter o mesmo nome da classe(case-sensitive) e n�o tem tipo de retorno(inclusive void).<br/>
 * Os Construtores n�o s�o herdados por subclasses.<br/>
 * Se o contrutor n�o for escrito explicitamente na classe o compilador gera um contrutor default automaticamente sem argumentos.<br/> 
  * @author Saymon
 *
 */

public class Construtores {
	
	/**
	 * Quando n�o � feita a chamada ao construtor da superclasse
	 * o compilador gera uma chamada super() ao construtor default da superclasse
	 * neste caso esta chamando {@link Object}
	 */
	public Construtores() {
		super();
	}
	
	/**
	 * Um construtor pode chamar outros construtores da sua classe usando this(); e de sua superclasse usando super();
	 * � permitida a sobreCarga de Construtores
	 * @param s
	 */

	public Construtores(String s){
		this();
	}
	
}
