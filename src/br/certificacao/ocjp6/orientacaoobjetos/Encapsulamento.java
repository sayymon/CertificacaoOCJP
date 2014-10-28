package br.certificacao.ocjp6.orientacaoobjetos;

/**
 * <h1>Encapsulamento</h1> <br>
 * Vem de encapsular, que em programa��o orientada a objetos significa separar o
 * programa em partes, o mais isoladas poss�vel. A id�ia � tornar o software
 * mais flex�vel, f�cil de modificar e de criar novas implementa��es;
 * 
 * � a forma de garantir a integridade do objeto tornando os atributos privados
 * e possibilitando a sua altera��o apenas atrav�s de m�todos n�o privados.
 * 
 * 
 * @author Saymon
 *
 */
public class Encapsulamento {
	private String atributo;
	
	/** 
	 * Exemplo de m�todo de captura de valor de um atributo encapsulado
	 * 
	 * @return atributo
	 */
	public String getAtributo() {
		return atributo;
	}

	/** 
	 * Exemplo de m�todo de atribui��o de valor de um atributo encapsulado
	 * 
	 */	
	
	public void setAtributo(String atributo) {
		this.atributo = atributo;
	}
	
	
	
}


