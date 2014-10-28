package br.certificacao.ocjp6.orientacaoobjetos;

/**
 * <h1>Objeto</h1>
 * 
 * <br>
 * 
 * � uma refer�ncia a um local da mem�ria que possui um valor. Um objeto pode
 * ser uma vari�vel, fun��o, ou estrutura de dados. Com a introdu��o da
 * programa��o orientada a objetos, a palavra objeto refere-se a uma inst�ncia
 * de uma classe. <br>
 * <br>
 * Em programa��o orientada a objetos, um objeto passa a existir a partir de um
 * "molde" {@link Classe}; a classe define o comportamento do objeto, usando
 * atributos (propriedades) e m�todos (a��es). <br>
 * <br>
 * 
 * O termo objeto basicamente � a contru��o de uma {@link Classe}.
 * 
 * <h2>Instancia</h2> <br>
 * <br>
 * 
 * As inst�ncias de uma classe compartilham o mesmo conjunto de atributos,
 * embora sejam diferentes quanto ao conte�do desses atributos. <br>
 * <br>
 * Por exemplo, a classe "Empregado" descreve os atributos comuns a todas as
 * inst�ncias da classe "Empregado". <br>
 * Os objetos dessa classe podem ser semelhantes, mas variam em atributos tais
 * como "nome" e "sal�rio". A descri��o da classe cont�m os itens
 * correspondentes a esses atributos e define as opera��es ou a��es relevantes
 * para a classe, tais como "aumento de sal�rio" ou
 * "mudan�a do n�mero de telefone". Pode-se ent�o falar sobre uma inst�ncia com
 * o nome = "Joana Coelho" e outra com o nome = "Jo�o Coelho". <br>
 * <br>
 * Inst�ncia � a concretiza��o de uma classe. Em termos intuitivos, uma classe �
 * como um "molde" que gera inst�ncias de um certo tipo; um objeto � algo que
 * existe fisicamente e que foi "moldado" na classe. <br>
 * <br>
 * Assim, em programa��o orientada a objetos, a palavra "instanciar" significa
 * criar. Quando falamos em "instanciar um objeto", criamos fisicamente uma
 * representa��o concreta da classe. Por exemplo: "animal" � uma classe ou um
 * molde; "cachorro" � uma inst�ncia de "animal" e apesar de carregar todas as
 * caracter�sticas do molde de "animal", � completamente independente de outras
 * inst�ncias de "animal".
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
