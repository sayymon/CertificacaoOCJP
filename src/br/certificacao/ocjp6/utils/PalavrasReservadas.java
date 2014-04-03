package br.certificacao.ocjp6.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * 
 * O que precisamos entender mesmo � como s�o divididas e quando vamos us�-las,
 * elas s�o divididas em modificadores de acesso, modificadores de classe,
 * m�todo e vari�vel, controle de fluxo, tratamento de erros, controle de
 * pacotes, primitivas, palavras-chaves de vari�veis, void para retornos e
 * tamb�m as palavras reservadas n�o utilizadas.<br/>
 * 
 * 
 * 
 * <h1>Modificadores de acesso:</h1>
 * 
 * � private: Faz com que um m�todo ou vari�vel possa ser acessado somente de
 * dentro da pr�pria classe;<br/>
 * 
 * � protected: Faz com que um m�todo ou vari�vel possa ser acessado somente por
 * classes do mesmo pacote ou por subclasses da classe;<br/>
 * 
 * � public: Faz com que uma classe, m�todo ou vari�vel possa ser acessado a
 * partir de qualquer outra classe.<br/>
 * 
 * 
 * 
 * <h1>Modificadores de classe, m�todo e vari�vel:</h1>
 * 
 * � abstract: Usada para declarar uma classe que n�o pode ser instanciada ou
 * m�todo que deve ser implementado por subclasses concretas;<br/>
 * 
 * � class: Palavra chave para identificar uma classe;<br/>
 * 
 * � extends: Usada para estender uma classe a outra, isto �, indicar para uma
 * superclasse que uma subclasse est� estendendo, (heran�a);<br/>
 * 
 * � final: Vimos no artigo anterior, torna imposs�vel estender uma classe,
 * sobrepor um m�todo ou reiniciar uma vari�vel;<br/>
 * 
 * � implements: Usada para indicar a uma interface que uma classe a
 * implementar�;<br/>
 * 
 * � interface: Palavra chave para identificar uma interface;<br/>
 * 
 * � native: Indica que um m�todo foi escrito em uma linguagem que s� pode ser
 * usada em uma plataforma, exemplo o C++;<br/>
 * 
 * � new: Usada para instanciar um objeto;<br/>
 * 
 * � static: Indica que o m�todo ou a vari�vel pertence a classe e n�o a
 * instancia;<br/>
 * 
 * � strictfp: Usada na frente de um m�todo para indicar que os n�meros de ponto
 * flutuantes seguir�o regras restritas de ponto flutuante em todas as
 * express�es;<br/>
 * 
 * � synchronized: Indica que um m�todo s� pode ser acessado por um seguimento de
 * cada vez,garantindo a integridade de dados;<br/>
 * 
 * � transient: Impede que os campos sejam serializados;<br/>
 * 
 * � volatile: Indica que a vari�vel pode n�o ficar sincronizada por ser usada
 * em fragmentos.<br/>
 * 
 * 
 * 
 * <h1>Controle de fluxo:</h1>
 * 
 * � break: Faz o fluxo sair do bloco do c�digo onde a palavra foi inserida.<br/>
 * 
 * � case: Executa um bloco de c�digo dependendo da instru��o switch.<br/>
 * 
 * � continue: Faz com que o c�digo existente ap�s essa instru��o n�o seja
 * executado em um loop, indicando a pr�xima intera��o do loop.<br/>
 * 
 * � default: Executar� esse bloco de c�digo se nenhuma das instru��es
 * switch/case for atendida.<br/>
 * 
 * � do: Executa um bloco de c�digo um vez e, em seguida junto com a instru��o
 * while, processa um teste para determinar se o bloco deve ser executado
 * novamente.<br/>
 * 
 * � else: Executa um bloco de c�digo alternativo se uma condi��o if for falsa.<br/>
 * 
 * � for: Usada para executar um loop condicional em um bloco de c�digo.<br/>
 * 
 * � if: Usada para executar um teste l�gico verdadeiro ou falso.<br/>
 * 
 * � instanceof: Determina se um objeto � a instancia de uma classe, superclasse
 * ou interface.<br/>
 * 
 * � return: Faz o fluxo sair de um m�todo sem executar nenhum c�digo que seja
 * ap�s a instru��o (pode retornar uma vari�vel opcionalmente);<br/>
 * 
 * � switch: Indica a vari�vel a ser confrontada com as instru��es case.<br/>
 * 
 * � while: Executa um bloco de c�digo repetidamente, enquanto um certa condi��o
 * for verdadeira.<br/>
 * 
 * 
 * 
 * <h1>Tratamento de Erros:</h1>
 * 
 * � catch: Declara o bloco de c�digo usado para tratar uma execu��o.<br/>
 * 
 * � finally: Bloco de c�digo, geralmente ap�s uma instru��o try-catch, que vai
 * ser executado independente de que fluxo do programa for usado no tratamento
 * de uma exce��o.<br/>
 * 
 * � throw: Usada para passar uma execu��o para o m�todo que chamou o m�todo
 * atual.<br/>
 * 
 * � throws: Indica o m�todo que passar� uma execu��o para o m�todo que o
 * chamou.<br/>
 * 
 * � try: Bloco de c�digo que ser� executado, podendo, por�m, causar uma
 * exce��o.<br/>
 * 
 * � assert: Avalia uma express�o condicional para verificar as alternativas do
 * programador.<br/>
 * 
 * 
 * 
 * <h1>Controle de Pacotes:</h1>
 * 
 * � import: Fala-se que � para importar pacotes ou classes para o c�digo, o que
 * n�o � verdade, veremos mais a frente.<br/>
 * 
 * � package: Especifica a que pacote todas as classes de um arquivo fonte
 * pertence.<br/>
 * 
 * 
 * 
 * <h1>Primitivas:</h1>
 * 
 * � boolean: Verdadeiro ou Falso;<br/>
 * 
 * � byte: Inteiro de 8 bits (com sinal);<br/>
 * 
 * � char: Unidade Unicode (de 16 bits, sem o sinal);<br/>
 * 
 * � double: N�mero de ponto flutuante com 64 bits (com sinal);<br/>
 * 
 * � float: N�mero de ponto flutuante com 32 bits (com sinal);<br/>
 * 
 * � int: N�mero inteiro de 32 bits (com sinal);<br/>
 * 
 * � long: N�mero inteiro de 64 bits (com sinal);<br/>
 * 
 * � short: N�mero inteiro de 16 bits (com sinal);<br/>
 * 
 * 
 * 
 * <h1>Palavras chaves de vari�veis:</h1>
 * 
 * � super: Vari�vel de refer�ncia que diz respeito a superclasse imediata;<br/>
 * 
 * � this: Vari�vel de refer�ncia que diz respeito a instancia atual de um
 * objeto;<br/>
 * 
 * 
 * 
 * <h1>Palavra void para tipos retornados:</h1>
 * 
 * � void: Indica que n�o h� um tipo de retorno para o m�todo.<br/>
 * 
 * 
 * 
 * <h1>Palavras reservadas n�o utilizadas:</h1>
 * 
 * � const: N�o use esta palavra para declarar constantes use public static
 * final;<br/>
 * 
 * � goto: N�o foi implementada na linguagem Java por ser considerada perigosa.<br/>
 * 
 * 
 * @author Saymon
 * 
 */
public class PalavrasReservadas {

	private static Properties palavrasReservadas = new Properties();

	static {
		// Arquivo deve estar na pasta principal do Projeto.
		File file = new File("palavrasReservadas.properties");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			// l� os dados que est�o no arquivo
			palavrasReservadas.load(fis);
			fis.close();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}

	public static String getDescricaoPalavraReservada(String nome) {

		return palavrasReservadas.getProperty(nome);
	}

	public static Set<String> getListaPalavrasReservadas() {

		return palavrasReservadas.stringPropertyNames();
	}

}
