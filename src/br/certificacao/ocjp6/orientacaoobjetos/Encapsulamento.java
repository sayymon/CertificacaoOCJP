package br.certificacao.ocjp6.orientacaoobjetos;

/**
 * <h1>Encapsulamento</h1> <br>
 * Vem de encapsular, que em programação orientada a objetos significa separar o
 * programa em partes, o mais isoladas possível. A idéia é tornar o software
 * mais flexível, fácil de modificar e de criar novas implementações;
 * 
 * É a forma de garantir a integridade do objeto tornando os atributos privados
 * e possibilitando a sua alteração apenas através de métodos não privados.
 * 
 * 
 * @author Saymon
 *
 */
public class Encapsulamento {
	private String atributo;
	
	/** 
	 * Exemplo de método de captura de valor de um atributo encapsulado
	 * 
	 * @return atributo
	 */
	public String getAtributo() {
		return atributo;
	}

	/** 
	 * Exemplo de método de atribuição de valor de um atributo encapsulado
	 * 
	 */	
	
	public void setAtributo(String atributo) {
		this.atributo = atributo;
	}
	
	
	
}


