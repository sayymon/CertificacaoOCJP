package br.certificacao.ocjp6.controleDeFluxo;

import br.certificacao.ocjp6.declaracaoInicializacaoEscopo.Enumera��es.StatusPedido;

/**
 * <h1>Condicionais</h1>
 * 
 * <h2>if</h2><br/>
 * <br/>
 * Segue a seguinte sintaxe :<br/>
 * <br/>
 * if(condicao){<br/>
 * bloco de Codigo 1<br/>
 * bloco de Codigo 2<br/>
 * }else{<br/>
 * bloco de Codigo 3<br/>
 * }<br/>
 * <br/>
 * <h2>switch-case</h2><br/>
 * <br/>
 * Segue a seguinte sintaxe :<br/>
 * <br/>
 * switch(parametro){<br/>
 * case valorEsperado : <br/>
 * bloco de codigo;<br/>
 * [break;]<br/>
 * [default]:<br/>
 * bloco de codigo;<br/>
 * [break;]<br/>
 * }<br/>
 * <br/>
 * O par�metro do switch deve ser dos tipo byte,short,char,int ou ENUM<br/>
 * O par�metro do case deve ser uma constante ou um valor literal compativel com
 * o tipo parametrizado no switch<br/>
 * A clausula default � opcional e n�o � obrigatoriamente a ultima<br/>
 * 
 * @author Saymon
 * 
 */
public class Condicionais {
	boolean teste;

	/**
	 * A express�o <b>if</b> aceita somente express�es booleanas como argumentos<br/>
	 * As chaves podem ser omitidas quando houver apenas uma instru��o de
	 * codigo.Ex : <br/>
	 * boolean teste;<br/>
	 * if(teste == true)<br/>
	 * System.out.println("Teste � true");<br/>
	 * else<br/>
	 * System.out.println("Teste � diferente de true");<br/>
	 */
	public void exemploIf() {

		if (teste == true)
			System.out.println("Teste � true");
		else
			System.out.println("Teste � diferente de true");
	}

	/**
	 * A express�o <b>else if</b> nada mais � do que um if encadiado no else
	 * tornando mais facil a legibilidade.
	 */
	public void exemploElseIf() {
		int numero = 10;

		if (numero >= 30)
			System.out.println("numero >= 30");
		else if (numero >= 20)
			System.out.println("numero >= 20");
		else if (numero > 10)
			System.out.println("numero > 10");
		else
			System.out.println("numero =" + numero);
	}

	/**
	 * A express�o s� � interrompida atrav�s do comando break se n�o houver o break sai executando os casos seguintes
	 */
	public void exemploSwitchCase() {
		StatusPedido status = StatusPedido.RECEBIDO;

		switch (status) {
		case RECEBIDO:
			System.out.println("Pedido foi recebido");
		case ENVIADO:
			System.out.println("Pedido foi Enviado");
		case CANCELADO:
			if (status.equals(StatusPedido.CANCELADO))
				System.out.println("Pedido foi cancelado");
			break;

		case PENDENTE:
			if (!status.equals(StatusPedido.PENDENTE))
				System.out.println("Pedido n�o esta mais pendente");
			else {
				System.out.println("Pedido esta pendente");
			}
			break;
		default:
			break;
		}
	}

}
