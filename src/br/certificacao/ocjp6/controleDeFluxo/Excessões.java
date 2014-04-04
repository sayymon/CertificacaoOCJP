package br.certificacao.ocjp6.controleDeFluxo;

import java.text.DateFormat;
import java.util.zip.DataFormatException;

/**
 * <h1>Excessões</h1> O Java define uma Hierarquia de classes derivadas de
 * {@link Throwable}.<br/>
 * <br/>
 * As principais subclasses de {@link Throwable} são {@link Exception} e
 * {@link Error}<br/>
 * <br/>
 * As excessões são categorizadas em dois principais tipos :<br/>
 * <h2>Checked</h2> <br/>
 * Herdam de {@link Exception} e devem respeitar as seguintes regras : <br/>
 * -> Ser Capturada (catch) pelo bloco chamador da rotina propicia a erros;<br/>
 * -> Ou ser declarada(throws) para ser lançada para algum metodo que a capture
 * e trate.<br/>
 * 
 * <h2>UnChecked</h2> <br/>
 * Herdam de {@link RuntimeException} não são verificadas pelo compilador . <h3>
 * Principais :</h3> <h4>{@link ArithmeticException} :</h4> Resultado da Divisão
 * Inteira por 0; <h4>{@link ClassCastException} :</h4> Resultado da tentativa
 * de Casting entre Objetos incompativeis; <h4>{@link IllegalArgumentException}
 * :</h4> Resultado da tentativa de passar um argumento Ilegal a um metodo; <h4>
 * {@link NumberFormatException} :</h4> SubClasse de
 * {@link IllegalArgumentException} que ocorre quando tentamos converter uma
 * {@link String} com valor não numerico/incompativel com o formato esperado;
 * <h4>{@link IndexOutOfBoundsException} :</h4> Ocorre quando tenta-se acessar
 * um indice invalido ou fora dos limites; <h4>{@link NullPointerException} :</h4>
 * Ocorre quando tenta-se acessar um objeto que não possui uma instancia de
 * referencia , ou seja possui o valor null; <br/>
 * <h1>{@link Error}</h1> Tambem são do tipo uncheckeds portanto não são
 * verificadas pelo compilador<br/>
 * Todas são lançada pela JVM em Um determinada situação . <h3>Principais :</h3>
 * <h4>{@link ExceptionInInitializerError} :</h4> Reporta falha de Inicialização
 * de Variavel Estática ou falha em um bloco de Inicialização; <h4>
 * {@link StackOverflowError} :</h4> Uso excessivo da pilha de metodos(Stack)
 * devido alguma recursividade(loop infinito); <h4>{@link NoClassDefFoundError}
 * :</h4> Falha na localização de um arquivo .class; <h4>{@link AssertionError}
 * :</h4> Reporta uma condição de assertiva falsa;
 * 
 * 
 * @author Saymon
 * 
 */

public class Excessões {

	/**
	 * <h3>Captura de Excessoes</h3> <br/>
	 * Sintaxe : <br/>
	 * try{<br/>
	 * catch(Qualquer filha de {@link Throwable} t){<br/>
	 * //Bloco de Codigo<br/>
	 * }<br/>
	 * [finally]{<br/>
	 * //Bloco de Codigo<br/>
	 * }<br/>
	 * }<br/>
	 * <br/>
	 * Onde as excessões mais especificas devem ser capturadas antes da mais
	 * gerais.Senão ocorre um erro de compilação(unreachable block)<br/>
	 * 
	 * Se uma excessão filha de {@link Exception} ou seja checked estiver sendo
	 * tratada no bloco catch porem não está sendo lançada o compilador informa
	 * um erro.
	 * 
	 */
	public void exemploCapturaDeExcessoes() {
		try {
			exemploMetodoLancaExcessaoUnchecked("a1");
			exemploMetodoLancaExcessaoChecked();
		} catch (NumberFormatException e) {
			System.out.println("Excessao foi tratada");
			e.printStackTrace();
		} catch (DataFormatException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Exemplo de Metodo que lanca uma excessão :<br/>
	 * <br/>
	 * Sintaxe :<br/>
	 * [modificadores] nomeMetodo([Tipo][parametro],[Tipo][parametro],...)
	 * throws Excessao1,Excessao2{<br/>
	 * //Bloco de Codigo<br/>
	 * }<br/>
	 * 
	 * @param inteiro
	 * @throws NumberFormatException
	 */
	public void exemploMetodoLancaExcessaoUnchecked(String inteiro)
			throws NumberFormatException {
		Integer.parseInt(inteiro);
	}

	public void exemploMetodoLancaExcessaoUnchecked(int inteiro)
			throws NumberFormatException, IllegalArgumentException {
		if (inteiro <= 0) {
			throw new IllegalArgumentException();
		}

		String s = String.valueOf(inteiro);
		System.out.println("s : "+s);
	}

	/**
	 * Lançamento de uma excessão é feita pelo comando throw new nomeExcessao();
	 * 
	 * @throws DataFormatException
	 */
	public void exemploMetodoLancaExcessaoChecked() throws DataFormatException {
		DateFormat dataFormatada = DateFormat.getDateTimeInstance();
		throw new DataFormatException(dataFormatada.toString());
	}

	public void exemploStackOverflowException() {
		try {
			while (true) {
				System.out.println("Esperando estourar a Stack");
				exemploStackOverflowException();
			}

		} catch (StackOverflowError e) {
			System.out.println("Estourou a Stack");
		}

	}


	/**
	 * <h1>Assertivas</h1> São afirmações das quais podem ser previstas durante a
	 * execução do programa.<br/>
	 * Permitindo realizar testes na fase de desenvolvimento sem que seja necessario
	 * remover do codigo final.<br/>
	 * As Assertivas podem ser habilitadas e desabilitadas via linha de comando ,
	 * <table border='1'>
	 * <tr>
	 * <td>Diretiva</td>
	 * <td>Exemplo</td>
	 * <td>Descrição</td>
	 * </tr>
	 * <tr>
	 * <td>-ea</td>
	 * <td>java -ea</td>
	 * <td>Habilita assertions</td>
	 * </tr>
	 * <tr>
	 * <td>-da</td>
	 * <td>java -da</td>
	 * <td>Desabilita assertions</td>
	 * </tr>
	 * <tr>
	 * <td>-ea:NomeClasse</td>
	 * <td>java -ea:{@link Assertivas}</td>
	 * <td>Habilita assertions para a Classe especificada</td>
	 * </tr>
	 * <tr>
	 * <td>-da:NomeClasse</td>
	 * <td>java -da:{@link Assertivas}</td>
	 * <td>Desabilita assertions para a Classe especificada</td>
	 * </tr>
	 * <tr>
	 * <td>-ea:NomePacote</td>
	 * <td>java -ea:br.certificacao.ocjp6.controleDeFluxo</td>
	 * <td>Habilita assertions para o pacote especificado</td>
	 * </tr>
	 * <tr>
	 * <td>-da:NomePacote</td>
	 * <td>java -da:br.certificacao.ocjp6.controleDeFluxo</td>
	 * <td>Desabilita assertions para o pacote especificado</td>
	 * </tr>
	 * <tr>
	 * <td>-esa</td>
	 * <td>java -esa</td>
	 * <td>Habilita assertions para as classes do Sistema(Ja vem com o JAVA)</td>
	 * </tr>
	 * <tr>
	 * <td>-dsa</td>
	 * <td>java -dsa</td>
	 * <td>Desabilita assertions para as classes do Sistema(Ja vem com o JAVA)</td>
	 * </tr>
	 * </table>
	 * 
	 * 
	 * @author Saymon
	 * 
	 */
	public static class Assertivas {

		private void m1(int i){
			int j = i % 3;
			switch (j) {
			case 0:
				System.out.println("0");
				break;
			case 1:
				System.out.println("1");
				break;
			default:
				assert j == 2 : "Checou a assertiva";
				System.out.println(j);
				break;
			}
		}
		
		public void m2(){
			Assertivas assertivas = new Assertivas();
			
			for (int i = 5; i >= -1; i--) {
				assertivas.m1(i);
			}
		}
		
	}	
	
}


