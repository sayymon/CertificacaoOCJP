package br.certificacao.ocjp6.declaracaoInicializacaoEscopo;

/**
 * 
 * <h1>Classes Abstratas</h1>
 * 
 * Classes abstratas tem uma fun��o importante na orienta��o a objeto em Java.<br/>
 * <br/>
 * De forma objetiva, uma classe abstrata serve apenas como modelo para uma<br/>
 * classe concreta (classe que comumente usamos).<br/>
 * <br/>
 * Como classes abstratas s�o modelos de classes, ent�o, n�o podem ser<br/>
 * instanciadas diretamente com o new, elas sempre devem ser herdadas por<br/>
 * classes concretas.<br/>
 * <br/>
 * Outro fato importante de classes abstratas � que elas podem conter ou n�o<br/>
 * m�todos abstratos, que tem a mesma defini��o da assinatura de m�todo<br/>
 * encontrada em interfaces. Ou seja, uma classe abstrata pode implementar ou<br/>
 * n�o um m�todo.<br/>
 * 
 * @author Saymon
 * 
 */

public abstract class ClasseAbstrata {
    
	/**
	 *  Uma classe abstrata pode possuir m�todos n�o abstratos
	 * @return Object
	 */
	public Object metodoComCorpo() {
		return null;
	}
	
	/**
	 * Um metodo abstrato n�o tem corpo e deve ser finalizado com ponto e virgula(;)
	 * @return Object
	 */
	public abstract Object metodoSemCorpo() ;
	
}
