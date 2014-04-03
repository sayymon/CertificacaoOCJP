package br.certificacao.ocjp6.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * 
 * O que precisamos entender mesmo é como são divididas e quando vamos usá-las,
 * elas são divididas em modificadores de acesso, modificadores de classe,
 * método e variável, controle de fluxo, tratamento de erros, controle de
 * pacotes, primitivas, palavras-chaves de variáveis, void para retornos e
 * também as palavras reservadas não utilizadas.<br/>
 * 
 * 
 * 
 * <h1>Modificadores de acesso:</h1>
 * 
 * · private: Faz com que um método ou variável possa ser acessado somente de
 * dentro da própria classe;<br/>
 * 
 * · protected: Faz com que um método ou variável possa ser acessado somente por
 * classes do mesmo pacote ou por subclasses da classe;<br/>
 * 
 * · public: Faz com que uma classe, método ou variável possa ser acessado a
 * partir de qualquer outra classe.<br/>
 * 
 * 
 * 
 * <h1>Modificadores de classe, método e variável:</h1>
 * 
 * · abstract: Usada para declarar uma classe que não pode ser instanciada ou
 * método que deve ser implementado por subclasses concretas;<br/>
 * 
 * · class: Palavra chave para identificar uma classe;<br/>
 * 
 * · extends: Usada para estender uma classe a outra, isto é, indicar para uma
 * superclasse que uma subclasse está estendendo, (herança);<br/>
 * 
 * · final: Vimos no artigo anterior, torna impossível estender uma classe,
 * sobrepor um método ou reiniciar uma variável;<br/>
 * 
 * · implements: Usada para indicar a uma interface que uma classe a
 * implementará;<br/>
 * 
 * · interface: Palavra chave para identificar uma interface;<br/>
 * 
 * · native: Indica que um método foi escrito em uma linguagem que só pode ser
 * usada em uma plataforma, exemplo o C++;<br/>
 * 
 * · new: Usada para instanciar um objeto;<br/>
 * 
 * · static: Indica que o método ou a variável pertence a classe e não a
 * instancia;<br/>
 * 
 * · strictfp: Usada na frente de um método para indicar que os números de ponto
 * flutuantes seguirão regras restritas de ponto flutuante em todas as
 * expressões;<br/>
 * 
 * · synchronized: Indica que um método só pode ser acessado por um seguimento de
 * cada vez,garantindo a integridade de dados;<br/>
 * 
 * · transient: Impede que os campos sejam serializados;<br/>
 * 
 * · volatile: Indica que a variável pode não ficar sincronizada por ser usada
 * em fragmentos.<br/>
 * 
 * 
 * 
 * <h1>Controle de fluxo:</h1>
 * 
 * · break: Faz o fluxo sair do bloco do código onde a palavra foi inserida.<br/>
 * 
 * · case: Executa um bloco de código dependendo da instrução switch.<br/>
 * 
 * · continue: Faz com que o código existente após essa instrução não seja
 * executado em um loop, indicando a próxima interação do loop.<br/>
 * 
 * · default: Executará esse bloco de código se nenhuma das instruções
 * switch/case for atendida.<br/>
 * 
 * · do: Executa um bloco de código um vez e, em seguida junto com a instrução
 * while, processa um teste para determinar se o bloco deve ser executado
 * novamente.<br/>
 * 
 * · else: Executa um bloco de código alternativo se uma condição if for falsa.<br/>
 * 
 * · for: Usada para executar um loop condicional em um bloco de código.<br/>
 * 
 * · if: Usada para executar um teste lógico verdadeiro ou falso.<br/>
 * 
 * · instanceof: Determina se um objeto é a instancia de uma classe, superclasse
 * ou interface.<br/>
 * 
 * · return: Faz o fluxo sair de um método sem executar nenhum código que seja
 * após a instrução (pode retornar uma variável opcionalmente);<br/>
 * 
 * · switch: Indica a variável a ser confrontada com as instruções case.<br/>
 * 
 * · while: Executa um bloco de código repetidamente, enquanto um certa condição
 * for verdadeira.<br/>
 * 
 * 
 * 
 * <h1>Tratamento de Erros:</h1>
 * 
 * · catch: Declara o bloco de código usado para tratar uma execução.<br/>
 * 
 * · finally: Bloco de código, geralmente após uma instrução try-catch, que vai
 * ser executado independente de que fluxo do programa for usado no tratamento
 * de uma exceção.<br/>
 * 
 * · throw: Usada para passar uma execução para o método que chamou o método
 * atual.<br/>
 * 
 * · throws: Indica o método que passará uma execução para o método que o
 * chamou.<br/>
 * 
 * · try: Bloco de código que será executado, podendo, porém, causar uma
 * exceção.<br/>
 * 
 * · assert: Avalia uma expressão condicional para verificar as alternativas do
 * programador.<br/>
 * 
 * 
 * 
 * <h1>Controle de Pacotes:</h1>
 * 
 * · import: Fala-se que é para importar pacotes ou classes para o código, o que
 * não é verdade, veremos mais a frente.<br/>
 * 
 * · package: Especifica a que pacote todas as classes de um arquivo fonte
 * pertence.<br/>
 * 
 * 
 * 
 * <h1>Primitivas:</h1>
 * 
 * · boolean: Verdadeiro ou Falso;<br/>
 * 
 * · byte: Inteiro de 8 bits (com sinal);<br/>
 * 
 * · char: Unidade Unicode (de 16 bits, sem o sinal);<br/>
 * 
 * · double: Número de ponto flutuante com 64 bits (com sinal);<br/>
 * 
 * · float: Número de ponto flutuante com 32 bits (com sinal);<br/>
 * 
 * · int: Número inteiro de 32 bits (com sinal);<br/>
 * 
 * · long: Número inteiro de 64 bits (com sinal);<br/>
 * 
 * · short: Número inteiro de 16 bits (com sinal);<br/>
 * 
 * 
 * 
 * <h1>Palavras chaves de variáveis:</h1>
 * 
 * · super: Variável de referência que diz respeito a superclasse imediata;<br/>
 * 
 * · this: Variável de referência que diz respeito a instancia atual de um
 * objeto;<br/>
 * 
 * 
 * 
 * <h1>Palavra void para tipos retornados:</h1>
 * 
 * · void: Indica que não há um tipo de retorno para o método.<br/>
 * 
 * 
 * 
 * <h1>Palavras reservadas não utilizadas:</h1>
 * 
 * · const: Não use esta palavra para declarar constantes use public static
 * final;<br/>
 * 
 * · goto: Não foi implementada na linguagem Java por ser considerada perigosa.<br/>
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
			// lê os dados que estão no arquivo
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
