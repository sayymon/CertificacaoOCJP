package br.certificacao.ocjp6.conteudoAPI;

import java.io.Serializable;

/**
 * <h1>Wrapper</h1>
 * 
 * S�o Classes que encapsulam tipos primitivos : <br/>
 * <table border='1'>
 * <tr>
 * <td>Tipo Primitivo</td>
 * <td>Wrapper class</td>
 * </tr>
 * <tr>
 * <td>boolean</td>
 * <td>java.lang.{@link Boolean}</td>
 * </tr>
 * <tr>
 * <td>char</td>
 * <td>java.lang.{@link Character}</td>
 * </tr>
 * <tr>
 * <td>byte</td>
 * <td>java.lang.{@link Byte}</td>
 * </tr>
 * <tr>
 * <td>short</td>
 * <td>java.lang.{@link Short}</td>
 * </tr>
 * <tr>
 * <td>int</td>
 * <td>java.lang.{@link Integer}</td>
 * </tr>
 * <tr>
 * <td>long</td>
 * <td>java.lang.{@link Long}</td>
 * </tr>
 * <tr>
 * <td>float</td>
 * <td>java.lang.{@link Float}</td>
 * </tr>
 * <tr>
 * <td>double</td>
 * <td>java.lang.{@link Double}</td>
 * </tr>
 * </table>
 * <br/>
 * S�o Imut�veis e final;Onde n�o � possivel criar uma subclasse delas e nem
 * mudar o valor encapsulado devido ao final<br/>
 * Tem um construtor correspondente ao tipo primitivo.<br/>
 * Todas as Wrappers tambem tem um construtor que recebe uma {@link String} com
 * excess�o a Character ;<br/>
 * J� sobreescrevem os metodos equals e hashcode possibilitando compara��o de
 * objetos; Implementam as interfaces {@link Comparable} e {@link Serializable},
 * portanto podem ser comparadas e serializadas.<br/>
 * <br/>
 * <h2>Wrappers Numericas</h2><br/>
 * Todas possuem uma super classe em comum que � a {@link Number} sendo elas :
 * BigDecimal, BigInteger, Byte, Double, Float, Integer, Long, and Short. <br/>
 * <br/>
 * Possuem um metodo de convers�o de String para o seu tipo primitivo ->
 * parse[TipoPrimitivo](String) retorna [tipoPrimitivo] E um metodo de convers�o<br/>
 * de String para o seu tipo Wrapper -> valueOf(String) retorna [Wrapper]<br/>
 * <br/>
 * A classe Boolean possui o metodo parseBoolean(String) retorna Boolean <br/>
 * <br/>
 * <h1>AutoBoxing</h1> <br/>
 * Convers�o autom�tica, em tempo de compila��o, entre primitivos e wrapper e
 * vice-versa.<br/>
 * <h2>Unboxing</h2><br/>
 * Convers�o do Wrapper em tipo primitivo.<br/>
 * <h2>Boxing</h2><br/>
 * Convers�o do tipo primitivo em Wrapper.<br/>
 * <br/>
 * <br/>
 * Com o Autoboxing � possivel simular a sobrecarga dos operadores aritm�ticos e
 * incremento para wrapper numericos e Character;<br/>
 * Ex : <br/>
 * Integer wrapperInteger = 10;<br/>
 * wrapperInteger += 10;// � possivel somar sem extrai o tipo primitivo para
 * depois somar !!!<br/>
 * <br/>
 * <br/>
 * 
 * @author Saymon
 * 
 */
public class Wrappers {
	/**
	 * <h3>Exemplo Boolean</h3> String textoBoolean = "true"; <br/>
	 * Boolean wrapperBoleano = Boolean.parseBoolean(textoBoolean); <br/>
	 * boolean primitivoBoleano = Boolean.parseBoolean(textoBoolean); <br/>
	 * primitivoBoleano = wrapperBoleano; // UnBoxing
	 */
	public void exemploBoolean() {
		String textoBoolean = "true";
		Boolean wrapperBoleano = Boolean.parseBoolean(textoBoolean);
		boolean primitivoBoleano = Boolean.parseBoolean(textoBoolean);
		primitivoBoleano = wrapperBoleano; // UnBoxing
	}

	/**
	 * <h3>Exemplo Character</h3> <br/>
	 * Character wrapperCharacter = new Character('a');<br/>
	 * char primitivoChar = wrapperCharacter; //Unboxing<br/>
	 * wrapperCharacter = primitivoChar; //Boxing<br/>
	 * 
	 */
	public void exemploCharacter() {
		Character wrapperCharacter = new Character('a');
		char primitivoChar = wrapperCharacter; // Unboxing
		wrapperCharacter = primitivoChar; // Boxing
	}

	public void exemploByte() {
	}

	/**
	 * <h3>Exemplo Short</h3> <br/>
	 * 
	 * String s = "A";<br/>
	 * short primitivoShort = Short.parseShort(s, 16);<br/>
	 * Short wrapperShort = Short.parseShort(s, 16);<br/>
	 * System.out .println(wrapperShort.shortValue() == primitivoShort ?
	 * "S�o Iguais" : "N�o S�o Iguais");<br/>
	 * 
	 */
	public void exemploShort() {
		String s = "A";
		short primitivoShort = Short.parseShort(s, 16);
		Short wrapperShort = Short.parseShort(s, 16);
		System.out
				.println(wrapperShort.shortValue() == primitivoShort ? "S�o Iguais"
						: "N�o S�o Iguais");
	}

	public void exemploInteger() {
		Integer wrapperInteger = new Integer(25);
		int primitivoInt = wrapperInteger.intValue();
		wrapperInteger = new Integer("25");
		primitivoInt = Integer.parseInt("20");
		primitivoInt = Integer.parseInt("F", 16);// base hexadecimal
	}

	public void exemploLong() {
	}

	public void exemploFloat() {
	}

	public void exemploDouble() {
	}

	/**
	 * <h3>Exemplo AutoBoxing</h3> <br/>
	 * Integer wrapperInteger = 25 ; <br/>
	 * mesma coisa ->Integer wrapperInteger = new Integer(25); int primitivoInt
	 * = wrapperInteger; <br/>
	 * mesma coisa ->int primitivoInt = wrapperInteger.intValue(); <br/>
	 * <b>!!! Cuidado codigo abaixo n�o compila!!!</b> <br/>
	 * Double d = 100; <br/>
	 * mesma coisa -> Double d = new Integer(100); <br/>
	 * <b>Formas certas</b><br/>
	 * Double d = (double) 100; <br/>
	 * ou <br/>
	 * d = 100d;
	 * 
	 */
	public void exemploAutoBoxing() {
		Integer wrapperInteger = 25;
		// mesma coisa ->Integer wrapperInteger = new Integer(25);
		int primitivoInt = wrapperInteger;
		// mesma coisa ->int primitivoInt = wrapperInteger.intValue();
		// !!! Cuidado codigo abaixo n�o compila!!!
		// Double d = 100;// Double d = new Integer(100);
		// Formas certas
		Double d = (double) 100;
		// ou
		d = 100d;
	}

	/**
	 * <h3>Exemplo Pool de Wrapper</h3>
	 * Apartir do JAVA 5 foi criado um Pool onde armazena-se os valores
	 * encapsulados das wrapper Numericas at� o valor 127 que � valor maximo de um
	 * byte, portanto pode ser feita a compara��o com == at� o valor 127 , depois disso deixa de verificar no pool e volta a comparar referencias;
	 * O correto � sempre utilizar o metodo equals para compara��o entre referencias de Objeto. 
	 * 
	 */
	public void exemploPoolDeWrapper() {
		Integer wrapperInteger = 25;
		Integer wrapperInteger2 = 25;
		System.out.println(wrapperInteger == wrapperInteger2 ? "S�o Iguais" : "N�o s�o Iguais" );
		//resultado impresso "S�o Iguais" 
		wrapperInteger = 128;
		wrapperInteger2 = 128;
		System.out.println(wrapperInteger == wrapperInteger2 ? "S�o Iguais" : "N�o s�o Iguais" );
		//resultado impresso "N�o s�o Iguais"
		wrapperInteger = 127;
		wrapperInteger2 = 128;
		System.out.println(wrapperInteger == wrapperInteger2 ? "S�o Iguais" : "N�o s�o Iguais" );
		//resultado impresso "N�o s�o Iguais"	
		wrapperInteger = 128;
		wrapperInteger2 = 128;
		System.out.println(wrapperInteger.equals(wrapperInteger2) ? "S�o Iguais" : "N�o s�o Iguais" );
		//resultado impresso "S�o Iguais"
	
	}

}
