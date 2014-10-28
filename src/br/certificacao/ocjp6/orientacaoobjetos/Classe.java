/**
 * 
 */
package br.certificacao.ocjp6.orientacaoobjetos;

/**
 * 
 * * <u><h1>Classe</h1></u>
 * 
 * Representa um conjunto de objetos com caracter�sticas afins. Uma classe
 * define o comportamento dos objetos atrav�s de seus m�todos, e quais estados
 * ele � capaz de manter atrav�s de seus atributos. <br>
 * <b>Exemplo de classe:</b> <i>Os seres humanos.</i> <br>
 * 
 * @author Saymon
 *
 */
public class Classe {
	/**
	 * <u><h2>Construtor</h2></u> <br>
	 * 
	 * Define o comportamento no momento da cria��o de um objeto de uma classe.
	 */
	Classe() {
		this.atributo = "Classe";
	}

	/**
	 * <u><h2>Atributo</h2></u> <br>
	 * <br>
	 * Os atributos indicam as poss�veis informa��es armazenadas por um objeto
	 * de uma classe , representando o estado de cada objeto. <br>
	 * S�o os elementos que definem a estrutura de uma classe. Os atributos
	 * tamb�m s�o conhecidos como vari�veis de classe, e podem ser divididos em
	 * dois tipos b�sicos: atributos de inst�ncia e de classe. Os valores dos
	 * atributos de inst�ncia determinam o estado de cada objeto. Um atributo de
	 * classe possui um estado que � compartilhado por todos os objetos de uma
	 * classe. Atributos de classe podem ser chamados tamb�m de atributos
	 * est�ticos ou Constantes s�o considerados atributos de classe quando est�o
	 * fora de qualquer m�todo.
	 * 
	 */
	String atributo;

	/**
	 * <u><h2>M�todo</h2></u> <br>
	 * � uma sub-rotina (ou procedimento ou fun��o) associada a um objeto, e que
	 * possui acesso aos seus dados, as vari�veis membro. Ele � executado por um
	 * objeto ao receber uma mensagem. Os m�todos determinam o comportamento dos
	 * objetos de uma classe e s�o an�logos �s fun��es ou procedimentos da
	 * programa��o estruturada. O envio de mensagens (chamada de m�todos) pode
	 * alterar o estado de um objeto. <br>
	 * A associa��o entre classe e m�todo � chamada de liga��o (binding). <br>
	 * Um m�todo associado com uma classe � dito estar ligado (bound) � classe;
	 */
	void metodo() {
		System.out.println(atributo);
	}

	/**
	 * <h2>M�todos est�ticos</h2> <br>
	 * M�todos est�ticos n�o requerem uma inst�ncia da classe nem podem acessar
	 * implicitamente os dados (ou this, super e etc.) de tal inst�ncia. Um
	 * m�todo est�tico � distinguido e com a palavra-chave static colocada na
	 * assinatura do m�todo.
	 * 
	 * Em linguagens de tipagem est�tica, como Java, m�todos est�ticos s�o
	 * chamados "est�ticos" devido a eles serem resolvidos estaticamente (isto
	 * �, em tempo de compila��o) baseado na classe que eles s�o chamados e n�o
	 * dinamicamente como no caso com m�todos de inst�ncia que s�o resolvidos
	 * polimorficamente baseados no tipo de tempo de execu��o do objeto.
	 * Entretanto, m�todos est�ticos n�o podem ser sobrescritos.
	 */
	public static void metodoEstatico() {
	}

}
