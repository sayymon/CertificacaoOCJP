package br.certificacao.ocjp6.controleDeFluxo;

import br.certificacao.ocjp6.utils.PalavrasReservadas;

/**
 * <h1>Estruturas de Repetição</h1> Aceita apenas condições booleanas<br/>
 * As chaves podem ser omitidas quando houver apenas uma instrução.<br/>
 * Todas as estruturas possuem o comando 'continue' e 'break' que pode ser
 * utilizado em qualquer ponto no bloco de codigo,inclusive dentro de
 * {@link Condicionais} <br/>
 * <h3>continue:</h3> <br/>
 * Faz com que o código existente após essa instrução não seja executado em um
 * loop, indicando a próxima interação do loop. <h3>break</h3><br/>
 * Faz o fluxo sair do bloco do código onde a palavra foi inserida.<br/>
 * 
 * 
 * 
 * <h2>while</h2><br/>
 * Sintaxe:<br/>
 * while(condição){<br/>
 * bloco de codigo<br/>
 * }<br/>
 * <br/>
 * <h2>do-while</h2><br/>
 * Sintaxe :<br/>
 * do{<br/>
 * bloco de codigo<br/>
 * }while(condição);<br/>
 * <br/>
 * <h2>for</h2><br/>
 * Sintaxe : <br/>
 * for([atribuição];[condicao];[expressão]){<br/>
 * bloco de codigo<br/>
 * }<br/>
 * <br/>
 * Qualquer parte do laço for pode ser omitida. A omissão da [condição]
 * corresponde a um laço infinito. <br/>
 * <h3>for com rotulo</h3>
 * O comando for pode conter um rotulo como por exemplo :<br/>
 * <br/>
 * primario : for(int i = 0;i <= 10;i++){<br/>
 * for(int j = 0;j <= 10;i++){<br/>
 * if(j == i){<br/>
 * continue primario;<br/>
 * }<br/>
 * System.out.println("i = "+ i +"j = "+ j);<br/>
 * }<br/>
 * }<br/>
 * <h3>foreach ou Enhanced-For</h3>
 * Sintaxe : <br/>
 * for(Tipo referencia : array|Collection){<br/>
 * bloco de codigo
 * }<br/>
 * @author Saymon
 * 
 */

public class EstruturasDeRepetição {

	/**
	 * Verifica a condição para depois executar.
	 */
	public void exemploWhile() {
		int i = 0;
		while (i <= 10) {
			System.out.println("Valor de i = " + i);
			i++;
		}
	}

	/**
	 * Executa a condição pelo menos uma vez para depois verificar.
	 */

	public void exemploDoWhile() {
		int i = 0;

		do {
			System.out.println("Valor de i = " + i);
			i++;
		} while (i <= 10);
	}

	/**
	 * O <b>for</b> segue o seguinte roteiro :<br/>
	 * Atribuição(Apenas uma vez) -> Verifica Condição(se Verdadeira)-> Realiza
	 * expressão -> Executa Bloco de codigo -> Volta a verificar condição até
	 * que seja falsa. <br/>
	 */
	public void exemploFor() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Valor de i = " + i);
		}
	}

	/**
	 * Elimina a necessidade de uma variavel contadora implicita.<br/>
	 * Pode ser utilizado com arrays ou colections<br/>
	 * Pode ser combinado com o break e continue <br/>
	 */
	public void exemploEnhancedFor() {

		for (String palavraReservada : PalavrasReservadas
				.getListaPalavrasReservadas()) {
			System.out.println(palavraReservada
					+ " : "
					+ PalavrasReservadas
							.getDescricaoPalavraReservada(palavraReservada));
		}
	}

	public void exemploForComRotulo() {
		primario: for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == i) {
					continue primario;
				}
				System.out.println("i = " + i + "j = " + j);
			}
		}
	}

}
