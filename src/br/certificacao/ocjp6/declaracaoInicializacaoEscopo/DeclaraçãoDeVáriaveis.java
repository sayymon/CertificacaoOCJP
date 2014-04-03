package br.certificacao.ocjp6.declaracaoInicializacaoEscopo;

/**
 * <h1>Declaração de Variaveis</h1>
 * 
 * Variáveis são nomes atribuídos à endereços na memória de um computador onde
 * se guardam dados. A declaração de uma variável consiste em dar um nome para a
 * posição de memória a ser usada e especificar qual tipo de dado a guardar na
 * memória.<br/>
 * Para declarar uma variável, utiliza-se a seguinte sintaxe:<br/>
 * <br/>
 * [modificador] [tipo] identificador;<br/>
 * <br/>
 * Pode-se declarar mais de uma variável do mesmo tipo separando-as por
 * vírgulas, como na seguinte sintaxe:<br/>
 * <br/>
 * [modificador] [tipo] identificador1, identificador2, identificador3; <br/>
 * <br/>
 * Obs: o modificador é opcional<br/>
 * <br/>
 * <h1>Modificadores</h1> <br/>
 * <h2>Modificadores de acesso</h2> <br/>
 * Os modificadores de acesso são palavras-chave que modificam a forma como
 * podem ser acessadas as classes, métodos e/ou variáveis. <br/>
 * <h3>Modificador de acesso private</h3> <br/>
 * O modificador de acesso "private" quando aplicado a um atributo ou a um
 * método indica que os mesmos só podem ser acessados de dentro da classe que os
 * criou (encapsulamento). Uma classe que herde de uma superclasse com atributos
 * declarados como "private" só poderá ter acesso a eles através dos métodos
 * públicos da própria superclasse, caso contrário, não haverá acesso a estes
 * atributos. <br/>
 * <h3>Modificador de acesso protected</h3> <br/>
 * A instrução protected indica que o método ou a variável assim declarada possa
 * ser acessada somente dentro do pacote em que está contida através de uma
 * subclasse. <br/>
 * <h3>Modificador de acesso public</h3><br/>
 * A instrução public indica que a classe, método ou variável assim declarada
 * possa ser acessada em qualquer lugar e a qualquer momento da execução do
 * programa. <br/>
 * <h3>Modificador de acesso padrão(Friendly)</h3><br/>
 * Sem modificador de acesso, o membro da classe é considerado friendly. Não há
 * uma palavra-chave para esse modificador. <br/>
 * <h2>Modificadores de comportamento</h2> <br/>
 * <h3>Modificador static</h3><br/>
 * A instrução static serve:<br/>
 * na declaração de uma variável dentro de uma classe, para se criar uma
 * variável que poderá ser acessada por todas as instâncias de objetos desta
 * classe como um variável comum. Ou seja, a variável criada será a mesma em
 * todas instâncias e quando seu conteúdo é modificado em uma das instâncias
 * então ele será modificado em todas instâncias; <br/>
 * na declaração de um método que deve ser acessado diretamente na classe e não
 * nas suas instâncias. <h3>
 * Modificador abstract</h3><br/>
 * A instrução abstract serve para:<br/>
 * declarar métodos abstratos, ou seja, métodos que deverão ser
 * desenvolvidos/implementados nas subclasses. Quando a classe que contiver
 * métodos abstratos for herdada, os referidos métodos deverão ser
 * implementados, caso contrário, a classe que extendeu deverá ser declarada
 * como abstrata. <br/>
 * declarar classes abstratas que se desenvolvem numa(s) subclasse(s). Classes
 * abstratas são aquelas que não estão totalmente implementadas/descritas. Uma
 * classe abstrata não pode ser instanciada e é amplamente usada nas interfaces. <br/>
 * Uma classe é considerada abstrata se contiver pelo menos um método abstrato.
 * Um método abstrato tem a seguinte característica: void getName( ); <br/>
 * Caso o método tenha as chaves características {}, o mesmo não mais será
 * considerado abstrato, embora não tenha código dentro das chaves. <br/>
 * <h3>Modificador final</h3><br/>
 * A instrução final indica que a classe, método ou variável assim declarada têm
 * uma única atribuição que se mantém constante, ou seja, não pode ser alterada
 * no decorrer do processamento. Este modificador declara o que chamamos, em
 * programação, de constante.
 * 
 * <h1>Escopo,Inicialização</h1> <br/>
 * Variaveis quando definidas com static ou atributos de classe e atributos de instancia são inicializados com os valores default :<br/> 
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
public class DeclaraçãoDeVáriaveis {

	/**
	 * <h4>boolean</h4> <br/>
	 * É o tipo de dado que contém literal lógico. Serve para armazenar um único
	 * bit de informação. Este bit pode ser representado pelas palavras false
	 * (falso) ou true (verdadeiro). Representa estados binários, tais como:
	 * verdadeiro/falso, certo/errado, ligado/desligado, aberto/fechado, sim/não
	 * etc.
	 */
	public boolean ligado = false;

	/**
	 * <h4>byte</h4> <br/>
	 * É o tipo de dado capaz de armazenar 8 bits de informação, ou seja, um
	 * número inteiro entre -128 e 127. Sua utilização é recomendada em caso de
	 * economia de memória, já que alguns tipos de dados maiores possuem
	 * processamento mais rápido.
	 */

	public byte a = 127;

	/**
	 * <h4>short</h4> <br/>
	 * É o tipo de dado que é capaz de armazenar números inteiros de 16 bits, ou
	 * seja, um número inteiro entre -32.768 e 32.767.
	 */
	public short by1 = -32;

	/**
	 * <h4>int</h4> <br/>
	 * É o tipo de dado capaz de armazenar 32 bits, ou seja, de representar um
	 * número inteiro qualquer entre -2.147.483.648 e 2.147.483.647. É o tipo
	 * mais indicado na maioria dos casos por possuir uma grande faixa de
	 * valores. Variáveis deste tipo também costumam ser manipuladas mais
	 * rapidamente já que correspondem à largura de dados (de palavra) mais
	 * usual na maioria dos processadores atuais.
	 */
	public int by2 = 0xBB;
	/**
	 * <h4>long</h4> <br/>
	 * É o tipo de dado capaz de armazenar 64 bits de informação, ou seja, que
	 * pode representar um número inteiro qualquer entre
	 * -9.223.372.036.854.775.808L e 9.223.372.036.854.775.807L. Recomenda-se
	 * seu uso apenas quando for preciso assumir valores maiores ou menores do
	 * que aqueles possíveis de serem assumidos pelo int.
	 */
	public long bwy1 = 32L;

	/**
	 * <h4>float</h4> <br/>
	 * É o tipo de dado capaz de armazenar números reais de precisão simples, ou
	 * seja, 32 bits de informação representando um número real.
	 */
	public float bze = 32.455f;

	/**
	 * <h4>double</h4> <br/>
	 * É o tipo de dado capaz de armazenar números reais de precisão dupla, ou
	 * seja, 64 bits de informação em forma de número real. É usado para
	 * representar valores nos quais é preciso uma precisão maior que a de
	 * float.
	 */
	public double dze = 1.32455e4D;

	/**
	 * <h4>char</h4> <br/>
	 * É o tipo de dado capaz de armazenar 16 bits representando caracteres no
	 * formato UTF-16 (formato UTF composto de dois caracteres de 8 bits).
	 * Representado numericamente, o tipo char pode ter valores de 0 a 65535
	 * (inclusive) - de '\u0000' a '\uffff'. Nas versões mais recentes da
	 * linguagem Java, propõe-se substituir o tipo char pelo tipo byte
	 */
	public char letra = '\u0041';

	/**
	 * <h4>Tipo Referencia</h4> <br/>
	 * 
	 * É o tipo de dado onde se faz a referencia a uma instancia de um objeto em
	 * memoria.como por exemplo : String string = "Tipo de Referencia", está sendo feita a referencia ao objeto String criado "Tipo de Referencia".
	 */
	public String string = "Tipo de Referencia";

}
