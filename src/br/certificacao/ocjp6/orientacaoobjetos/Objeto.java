package br.certificacao.ocjp6.orientacaoobjetos;

/**
 * <h1>Objeto</h1>
 * 
 * <br>
 * 
 * É uma referência a um local da memória que possui um valor. Um objeto pode
 * ser uma variável, função, ou estrutura de dados. Com a introdução da
 * programação orientada a objetos, a palavra objeto refere-se a uma instância
 * de uma classe. <br>
 * <br>
 * Em programação orientada a objetos, um objeto passa a existir a partir de um
 * "molde" {@link Classe}; a classe define o comportamento do objeto, usando
 * atributos (propriedades) e métodos (ações). <br>
 * <br>
 * 
 * O termo objeto basicamente é a contrução de uma {@link Classe}.
 * 
 * <h2>Instancia</h2> <br>
 * <br>
 * 
 * As instâncias de uma classe compartilham o mesmo conjunto de atributos,
 * embora sejam diferentes quanto ao conteúdo desses atributos. <br>
 * <br>
 * Por exemplo, a classe "Empregado" descreve os atributos comuns a todas as
 * instâncias da classe "Empregado". <br>
 * Os objetos dessa classe podem ser semelhantes, mas variam em atributos tais
 * como "nome" e "salário". A descrição da classe contém os itens
 * correspondentes a esses atributos e define as operações ou ações relevantes
 * para a classe, tais como "aumento de salário" ou
 * "mudança do número de telefone". Pode-se então falar sobre uma instância com
 * o nome = "Joana Coelho" e outra com o nome = "João Coelho". <br>
 * <br>
 * Instância é a concretização de uma classe. Em termos intuitivos, uma classe é
 * como um "molde" que gera instâncias de um certo tipo; um objeto é algo que
 * existe fisicamente e que foi "moldado" na classe. <br>
 * <br>
 * Assim, em programação orientada a objetos, a palavra "instanciar" significa
 * criar. Quando falamos em "instanciar um objeto", criamos fisicamente uma
 * representação concreta da classe. Por exemplo: "animal" é uma classe ou um
 * molde; "cachorro" é uma instância de "animal" e apesar de carregar todas as
 * características do molde de "animal", é completamente independente de outras
 * instâncias de "animal".
 * 
 * @author Saymon
 *
 */
public class Objeto {

	public void exemploInstancia() {
		Object instanciaObjeto = new Object();
		Classe instanciaClasse = new Classe();
		SubClasse instanciaSubClasse = new SubClasse();

		if (instanciaObjeto instanceof Object
				&& instanciaClasse instanceof Classe
				&& instanciaSubClasse instanceof SubClasse) {
			System.out.println("Exemplo Instancia");
		}
	}
}
