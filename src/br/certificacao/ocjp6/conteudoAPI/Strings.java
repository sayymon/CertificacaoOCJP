package br.certificacao.ocjp6.conteudoAPI;

/**
 * <h1>Strings</h1><br/>
 * Todas possuem o metodo length() que retorna o numero de caracteres
 * <br/>
 * <h2>{@link String}</h2><br/>
 * S�o Objetos imut�veis onde uma vez construido n�o pode ter seu valor
 * alterado;<br/>
 * String � uma classe final,e n�o podem ter subclasse.<br/>
 * <br/>
 * Todos os metodos que retornam uma String retorn�o sempre uma nova String.<br/>
 * <br/>
 * A JVM mantem um Pool de Strings onde literais com o mesmo valor s� s�o
 * criadas apenas uma vez sendo que todas as referencias ao seu conteudo apontam
 * para o mesmo endere�o do objeto.<br/>
 * A JVM faz a seguinte verifica��o : <br/>
 * <b> Se ("String informada" possui no Pool) entao { <br/>
 * Retorna a referencia dela <br/>
 * Senao { <br/>
 * Cria uma nova instancia(new String("String informada")) <br/>
 * e retorna a referencia dela<br/>
 * }<br/>
 * </b> Ex : "SAYMON" == "SAYMON" retornara true<br/>
 * Mas mesmo assim o correto seria comparar com o equals conforme abaixo : Ex :
 * "SAYMON".equals("SAYMON") retornara sempre true independente do Pool de
 * Strings<br/>
 * 
 * Quando realizamos o comando new String("String For�ada") estamos for�ando o
 * JAVA a criar a String independente do Pool de Strings.
 * 
 * <br/>
 * <br/>
 * <h2>{@link StringBuffer} e {@link StringBuilder} </h2><br/>
 * S�o Mut�veis seu valor pode ser alterado.<br/>
 * {@link StringBuffer} Possui seus metodos como synchronized, portanto pode ser utilizado em concorrencia de multiplas {@link Thread}<br/>
 * {@link StringBuilder} Possui os mesmos metodos do {@link StringBuffer} por�m sem o modificador synchronized, tem o melhor desempenho entre {@link String} e {@link StringBuilder};<br/>    
 * 
 * <h3>Principais metodos :</h3>
 * <h4>apend(String s ou primitivo p)</h4>:Acrescenta caracteres no final.
 * <h4>delete(int inicio ,int fim)</h4>:Remove caracteres entre as posi��es inicio e fim -1.
 * <h4>reverse()</h4>:Inverte o conteudo da String,Ex:"SAYMON" para "NOMYAS".
 * <h4>insert(int inicio,String s ou primitivo p)</h4>:Insere entre a posi��o de inicio e realoca os caracteres a direita;
 * <h4>toString()</h4>:Retorna uma String com o Conteudo encapsulado ;
 * 
 * @author Saymon
 * 
 */

public class Strings {

	/**
	 * <h1>Exemplo Pool de Strings</h1><br/>
	 * String s1 = " abc " + " def ";<br/>
	 * String s2 = " abc " + " def ";<br/>
	 * System.out.println(("s1 == s2 ") + (s1 == s2 ? "S�o Iguais" :
	 * "S�o diferentes"));<br/>
	 * s2 = new String(s1);<br/>
	 * System.out.println(("s1 == s2 ") + (s1 == s2 ? "S�o Iguais" :
	 * "S�o diferentes"));<br/>
	 * System.out.println(("s1.equals(s2) ") + (s1.equals(s2) ? "S�o Iguais" :
	 * "S�o diferentes"));<br/>
	 * <br/>
	 * O codigo acima apresenta o seguinte resultado : <br/><b>
	 * s1 == s2 S�o Iguais<br/>
	 * s1 == s2 S�o diferentes<br/>
	 * s1.equals(s2) S�o Iguais<br/>
	 * </b>
	 */
	public void exemploPoolDeStrings() {
		String s1 = " abc " + " def ";
		String s2 = " abc " + " def ";
		System.out.println(("s1 == s2 ")
				+ (s1 == s2 ? "S�o Iguais" : "S�o diferentes"));
		s2 = new String(s1);
		System.out.println(("s1 == s2 ")
				+ (s1 == s2 ? "S�o Iguais" : "S�o diferentes"));
		System.out.println(("s1.equals(s2) ")
				+ (s1.equals(s2) ? "S�o Iguais" : "S�o diferentes"));

	}
	/**
	 * <h1>Exemplo String Builder</h1><br/>
	 * StringBuilder builder = new StringBuilder("asdfg");<br/>
	 * builder.insert(3, "qwert").reverse().append(123).delete(6, 9);<br/>
	 * <b>
	 * Teste de Mesa abaixo:<br/>
	 * -> builder � igual � "asdfg"<br/>
	 * builder.insert(3, "qwert")<br/>
	 * -> builder passa a ser igual � "asdqwertfg"<br/>
	 * builder.reverse()<br/>
	 * -> builder passa a ser igual � "gftrewqdsa"<br/>
	 * builder.apend(123)<br/>
	 * -> builder passa a ser igual � "gftrewqdsa123"<br/>
	 * builder.delete(6, 9)<br/>
	 * -> builder passa a ser igual � "gftrewa123"<br/>
	 * </b>
	 * System.out.println(builder);<br/>
	 * Resultado impresso � "gftrewa123"<br/>
	 */
	public void exemploStringBuilder() {
		StringBuilder builder = new StringBuilder("asdfg");
		builder.insert(3, "qwert").reverse().append(123).delete(6, 9);
		System.out.println(builder);

	}
}
