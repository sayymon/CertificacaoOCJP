/**
 * 
 */
package br.certificacao.ocjp6.orientacaoobjetos;

/**
 * 
 * * <u><h1>Classe</h1></u>
 * 
 * Representa um conjunto de objetos com características afins. Uma classe
 * define o comportamento dos objetos através de seus métodos, e quais estados
 * ele é capaz de manter através de seus atributos. <br>
 * <b>Exemplo de classe:</b> <i>Os seres humanos.</i> <br>
 * 
 * @author Saymon
 *
 */
public class Classe {
	/**
	 * <u><h2>Construtor</h2></u> <br>
	 * 
	 * Define o comportamento no momento da criação de um objeto de uma classe.
	 */
	Classe() {
		this.atributo = "Classe";
	}

	/**
	 * <u><h2>Atributo</h2></u> <br>
	 * <br>
	 * Os atributos indicam as possíveis informações armazenadas por um objeto
	 * de uma classe , representando o estado de cada objeto. <br>
	 * São os elementos que definem a estrutura de uma classe. Os atributos
	 * também são conhecidos como variáveis de classe, e podem ser divididos em
	 * dois tipos básicos: atributos de instância e de classe. Os valores dos
	 * atributos de instância determinam o estado de cada objeto. Um atributo de
	 * classe possui um estado que é compartilhado por todos os objetos de uma
	 * classe. Atributos de classe podem ser chamados também de atributos
	 * estáticos ou Constantes são considerados atributos de classe quando estão
	 * fora de qualquer método.
	 * 
	 */
	String atributo;

	/**
	 * <u><h2>Método</h2></u> <br>
	 * É uma sub-rotina (ou procedimento ou função) associada a um objeto, e que
	 * possui acesso aos seus dados, as variáveis membro. Ele é executado por um
	 * objeto ao receber uma mensagem. Os métodos determinam o comportamento dos
	 * objetos de uma classe e são análogos às funções ou procedimentos da
	 * programação estruturada. O envio de mensagens (chamada de métodos) pode
	 * alterar o estado de um objeto. <br>
	 * A associação entre classe e método é chamada de ligação (binding). <br>
	 * Um método associado com uma classe é dito estar ligado (bound) à classe;
	 */
	void metodo() {
		System.out.println(atributo);
	}

	/**
	 * <h2>Métodos estáticos</h2> <br>
	 * Métodos estáticos não requerem uma instância da classe nem podem acessar
	 * implicitamente os dados (ou this, super e etc.) de tal instância. Um
	 * método estático é distinguido e com a palavra-chave static colocada na
	 * assinatura do método.
	 * 
	 * Em linguagens de tipagem estática, como Java, métodos estáticos são
	 * chamados "estáticos" devido a eles serem resolvidos estaticamente (isto
	 * é, em tempo de compilação) baseado na classe que eles são chamados e não
	 * dinamicamente como no caso com métodos de instância que são resolvidos
	 * polimorficamente baseados no tipo de tempo de execução do objeto.
	 * Entretanto, métodos estáticos não podem ser sobrescritos.
	 */
	public static void metodoEstatico() {
	}

}
