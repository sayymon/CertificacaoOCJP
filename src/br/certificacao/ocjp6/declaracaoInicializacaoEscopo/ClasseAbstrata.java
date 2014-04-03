package br.certificacao.ocjp6.declaracaoInicializacaoEscopo;

/**
 * 
 * <h1>Classes Abstratas</h1>
 * 
 * Classes abstratas tem uma função importante na orientação a objeto em Java.<br/>
 * <br/>
 * De forma objetiva, uma classe abstrata serve apenas como modelo para uma<br/>
 * classe concreta (classe que comumente usamos).<br/>
 * <br/>
 * Como classes abstratas são modelos de classes, então, não podem ser<br/>
 * instanciadas diretamente com o new, elas sempre devem ser herdadas por<br/>
 * classes concretas.<br/>
 * <br/>
 * Outro fato importante de classes abstratas é que elas podem conter ou não<br/>
 * métodos abstratos, que tem a mesma definição da assinatura de método<br/>
 * encontrada em interfaces. Ou seja, uma classe abstrata pode implementar ou<br/>
 * não um método.<br/>
 * 
 * @author Saymon
 * 
 */

public abstract class ClasseAbstrata {
    
	/**
	 *  Uma classe abstrata pode possuir métodos não abstratos
	 * @return Object
	 */
	public Object metodoComCorpo() {
		return null;
	}
	
	/**
	 * Um metodo abstrato não tem corpo e deve ser finalizado com ponto e virgula(;)
	 * @return Object
	 */
	public abstract Object metodoSemCorpo() ;
	
}
