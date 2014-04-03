package br.certificacao.ocjp6.declaracaoInicializacaoEscopo;

/**
 * 
 * <h1>Declara��o de Metodos</h1> Para declara��o utiliza-se a seguinte sintaxe:<br/>
 * [modificadores] [tipo de Retorno] nomeDoMetodo(Lista de Parametros)<br/>
 * [throws Excecao1,Excecao2, ...]{<br/>
 * return [tipo de Retorno, se definido diferente de void]<br/>
 * }<br/>
 * 
 * Podem ser declarados dentro das classes,classes externas,interfaces e
 * enumera��es.<br/>
 * Devem ser nomeados com um {@link IdentificadoresV�lidos}.<br/>
 * Devem sempre definir um tipo de retorno : primitivo,reference,array ou void.
 * no caso do void o comando return se torna opcional.
 * 
 * @author Saymon
 * 
 */

public abstract class Declara��oDeM�todos {

	public void declaracaoMetodo(String parametro) {
		System.out.println(parametro);
	}

	/**
	 * <h2>Sobrecarga de Metodos</h2><br/>
	 * Metodos Sobrecarregados(overload) apresentam o mesmo identificador<br/>
	 * porem possuem lista de parametros obrigat�riamente distintas.<br/>
	 * Obs:Tipos de retorno e exce��es n�o qualificam m�todos para sobrecarga.
	 * 
	 * @param parametro
	 * @return parametro
	 */
	public String sobrecargaMetodo(String parametro) {
		System.out.println(parametro);
		return parametro;
	}

	public String sobrecargaMetodo(int parametro) {
		System.out.println(String.valueOf(parametro));
		return String.valueOf(parametro);
	}

	public String sobrecargaMetodo(float parametro) {
		System.out.println(String.valueOf(parametro));
		return String.valueOf(parametro);
	}

	public String sobrecargaMetodo(byte parametro) {
		System.out.println(String.valueOf(parametro));
		return String.valueOf(parametro);
	}

	/**
	 * <h2>M�todos sobrescritos</h2><br/>
	 * Apresentam o mesmo identificador, a mesma lista de parametros e o mesmo
	 * tipo de retorno que um metodo n�o final de uma superclasse
	 * <br/>
	 * Quando o retorno do metodo original for do tipo reference, pode ser retornada uma subclasse do tipo original.(covariancia) Principal recurso utilizado no Polimorfirmo implantado apartir da vers�o 5 do java
	 */
	@Override
	public String toString() {
		return super.toString();
	}
	
	/**
	 * <h2>Metodos Abstratos</h2><br/>
	 * N�o tem corpo e s� podem ser declarados em uma classe abstrata.
 	 * 
	 */
	public abstract void metodoAbstrato();
	/**
	 * <h2>Metodos Estaticos</h2><br/>
	 * S� podem acessar membros tamb�m static da classe.<br/>
	 * N�o Podem ser abstratos <br/>
	 * N�o podem sobrescrever m�todos n�o estaticos e vice-versa<br/>
	 */
	public static void metodoEstatico(){
		System.out.println("metodoEstatico");
	}
}

