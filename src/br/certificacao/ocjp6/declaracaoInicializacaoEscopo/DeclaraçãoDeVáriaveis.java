package br.certificacao.ocjp6.declaracaoInicializacaoEscopo;

/**
 * <h1>Declara��o de Variaveis</h1>
 * 
 * Vari�veis s�o nomes atribu�dos � endere�os na mem�ria de um computador onde
 * se guardam dados. A declara��o de uma vari�vel consiste em dar um nome para a
 * posi��o de mem�ria a ser usada e especificar qual tipo de dado a guardar na
 * mem�ria.<br/>
 * Para declarar uma vari�vel, utiliza-se a seguinte sintaxe:<br/>
 * <br/>
 * [modificador] [tipo] identificador;<br/>
 * <br/>
 * Pode-se declarar mais de uma vari�vel do mesmo tipo separando-as por
 * v�rgulas, como na seguinte sintaxe:<br/>
 * <br/>
 * [modificador] [tipo] identificador1, identificador2, identificador3; <br/>
 * <br/>
 * Obs: o modificador � opcional<br/>
 * <br/>
 * <h1>Modificadores</h1> <br/>
 * <h2>Modificadores de acesso</h2> <br/>
 * Os modificadores de acesso s�o palavras-chave que modificam a forma como
 * podem ser acessadas as classes, m�todos e/ou vari�veis. <br/>
 * <h3>Modificador de acesso private</h3> <br/>
 * O modificador de acesso "private" quando aplicado a um atributo ou a um
 * m�todo indica que os mesmos s� podem ser acessados de dentro da classe que os
 * criou (encapsulamento). Uma classe que herde de uma superclasse com atributos
 * declarados como "private" s� poder� ter acesso a eles atrav�s dos m�todos
 * p�blicos da pr�pria superclasse, caso contr�rio, n�o haver� acesso a estes
 * atributos. <br/>
 * <h3>Modificador de acesso protected</h3> <br/>
 * A instru��o protected indica que o m�todo ou a vari�vel assim declarada possa
 * ser acessada somente dentro do pacote em que est� contida atrav�s de uma
 * subclasse. <br/>
 * <h3>Modificador de acesso public</h3><br/>
 * A instru��o public indica que a classe, m�todo ou vari�vel assim declarada
 * possa ser acessada em qualquer lugar e a qualquer momento da execu��o do
 * programa. <br/>
 * <h3>Modificador de acesso padr�o(Friendly)</h3><br/>
 * Sem modificador de acesso, o membro da classe � considerado friendly. N�o h�
 * uma palavra-chave para esse modificador. <br/>
 * <h2>Modificadores de comportamento</h2> <br/>
 * <h3>Modificador static</h3><br/>
 * A instru��o static serve:<br/>
 * na declara��o de uma vari�vel dentro de uma classe, para se criar uma
 * vari�vel que poder� ser acessada por todas as inst�ncias de objetos desta
 * classe como um vari�vel comum. Ou seja, a vari�vel criada ser� a mesma em
 * todas inst�ncias e quando seu conte�do � modificado em uma das inst�ncias
 * ent�o ele ser� modificado em todas inst�ncias; <br/>
 * na declara��o de um m�todo que deve ser acessado diretamente na classe e n�o
 * nas suas inst�ncias. <h3>
 * Modificador abstract</h3><br/>
 * A instru��o abstract serve para:<br/>
 * declarar m�todos abstratos, ou seja, m�todos que dever�o ser
 * desenvolvidos/implementados nas subclasses. Quando a classe que contiver
 * m�todos abstratos for herdada, os referidos m�todos dever�o ser
 * implementados, caso contr�rio, a classe que extendeu dever� ser declarada
 * como abstrata. <br/>
 * declarar classes abstratas que se desenvolvem numa(s) subclasse(s). Classes
 * abstratas s�o aquelas que n�o est�o totalmente implementadas/descritas. Uma
 * classe abstrata n�o pode ser instanciada e � amplamente usada nas interfaces. <br/>
 * Uma classe � considerada abstrata se contiver pelo menos um m�todo abstrato.
 * Um m�todo abstrato tem a seguinte caracter�stica: void getName( ); <br/>
 * Caso o m�todo tenha as chaves caracter�sticas {}, o mesmo n�o mais ser�
 * considerado abstrato, embora n�o tenha c�digo dentro das chaves. <br/>
 * <h3>Modificador final</h3><br/>
 * A instru��o final indica que a classe, m�todo ou vari�vel assim declarada t�m
 * uma �nica atribui��o que se mant�m constante, ou seja, n�o pode ser alterada
 * no decorrer do processamento. Este modificador declara o que chamamos, em
 * programa��o, de constante.
 * 
 * <h1>Escopo,Inicializa��o</h1> <br/>
 * Variaveis quando definidas com static ou atributos de classe e atributos de instancia s�o inicializados com os valores default :<br/> 
 * boolean = false;<br/>
 * byte = 0;<br/>
 * short = 0;<br/>
 * int = 0;<br/>
 * long = 0;<br/>
 * float = 0;<br/>
 * double = 0;<br/>
 * char = '\u0000';<br/>
 * Tipo Referencia = null;
 * 
 * @author Saymon
 * 
 */
public class Declara��oDeV�riaveis {

	/**
	 * <h4>boolean</h4> <br/>
	 * � o tipo de dado que cont�m literal l�gico. Serve para armazenar um �nico
	 * bit de informa��o. Este bit pode ser representado pelas palavras false
	 * (falso) ou true (verdadeiro). Representa estados bin�rios, tais como:
	 * verdadeiro/falso, certo/errado, ligado/desligado, aberto/fechado, sim/n�o
	 * etc.
	 */
	public boolean ligado = false;

	/**
	 * <h4>byte</h4> <br/>
	 * � o tipo de dado capaz de armazenar 8 bits de informa��o, ou seja, um
	 * n�mero inteiro entre -128 e 127. Sua utiliza��o � recomendada em caso de
	 * economia de mem�ria, j� que alguns tipos de dados maiores possuem
	 * processamento mais r�pido.
	 */

	public byte a = 127;

	/**
	 * <h4>short</h4> <br/>
	 * � o tipo de dado que � capaz de armazenar n�meros inteiros de 16 bits, ou
	 * seja, um n�mero inteiro entre -32.768 e 32.767.
	 */
	public short by1 = -32;

	/**
	 * <h4>int</h4> <br/>
	 * � o tipo de dado capaz de armazenar 32 bits, ou seja, de representar um
	 * n�mero inteiro qualquer entre -2.147.483.648 e 2.147.483.647. � o tipo
	 * mais indicado na maioria dos casos por possuir uma grande faixa de
	 * valores. Vari�veis deste tipo tamb�m costumam ser manipuladas mais
	 * rapidamente j� que correspondem � largura de dados (de palavra) mais
	 * usual na maioria dos processadores atuais.
	 */
	public int by2 = 0xBB;
	/**
	 * <h4>long</h4> <br/>
	 * � o tipo de dado capaz de armazenar 64 bits de informa��o, ou seja, que
	 * pode representar um n�mero inteiro qualquer entre
	 * -9.223.372.036.854.775.808L e 9.223.372.036.854.775.807L. Recomenda-se
	 * seu uso apenas quando for preciso assumir valores maiores ou menores do
	 * que aqueles poss�veis de serem assumidos pelo int.
	 */
	public long bwy1 = 32L;

	/**
	 * <h4>float</h4> <br/>
	 * � o tipo de dado capaz de armazenar n�meros reais de precis�o simples, ou
	 * seja, 32 bits de informa��o representando um n�mero real.
	 */
	public float bze = 32.455f;

	/**
	 * <h4>double</h4> <br/>
	 * � o tipo de dado capaz de armazenar n�meros reais de precis�o dupla, ou
	 * seja, 64 bits de informa��o em forma de n�mero real. � usado para
	 * representar valores nos quais � preciso uma precis�o maior que a de
	 * float.
	 */
	public double dze = 1.32455e4D;

	/**
	 * <h4>char</h4> <br/>
	 * � o tipo de dado capaz de armazenar 16 bits representando caracteres no
	 * formato UTF-16 (formato UTF composto de dois caracteres de 8 bits).
	 * Representado numericamente, o tipo char pode ter valores de 0 a 65535
	 * (inclusive) - de '\u0000' a '\uffff'. Nas vers�es mais recentes da
	 * linguagem Java, prop�e-se substituir o tipo char pelo tipo byte
	 */
	public char letra = '\u0041';

	/**
	 * <h4>Tipo Referencia</h4> <br/>
	 * 
	 * � o tipo de dado onde se faz a referencia a uma instancia de um objeto em
	 * memoria.como por exemplo : String string = "Tipo de Referencia", est� sendo feita a referencia ao objeto String criado "Tipo de Referencia".
	 */
	public String string = "Tipo de Referencia";

}
