package br.certificacao.ocjp6.declaracaoInicializacaoEscopo;

/**
 * <h1>Classes Internas/Inner Classes ou Classes Locais e Classes Anonimas</h1>
 * 
 * @author Saymon
 * 
 */

public class ClassesInternas {

	private String atributoPrivado = "atributoPrivado";
	private static String atributoPrivadoEstatico = "atributoPrivadoEstatico";

	/**
	 * Declarada no corpo de uma classe é um membro da classe e pode ter
	 * qualquer modificador de acesso (incluindo private e protect) e tambem
	 * pode ter o modificador static Quando a classe interna não é static pode
	 * ter acesso aos atributos e metodos de sua classe externa.
	 * 
	 * @author Saymon
	 */

	public class ClasseInterna {

		public void testeDeAcessos() {
			String variavelLocal = atributoPrivado;
			System.out.println(variavelLocal);
		}
		

	}
	
	/**
	 * Exemplo de Criação de Classe Interna não Estatica<br/>
	 * ClassesInternas.ClasseInterna classeInterna = new ClassesInternas().new ClasseInterna();<br/>
	 * @return Object
	 */
	public Object ExemploDeInstanciaClasseInterna() {
		ClassesInternas.ClasseInterna classeInterna = new ClassesInternas().new ClasseInterna();
		return classeInterna;
	}

	/**
	 * Declarada no corpo de uma classe é um membro da classe e pode ter
	 * qualquer modificador de acesso (incluindo private e protect) e tambem
	 * pode ter o modificador static Quando a classe interna é static pode
	 * ter acesso aos atributos e metodos estáticos de sua classe externa.
	 * 
	 * @author Saymon
	 */	
	
	public static class ClasseInternaEstatica {

		public void testeDeAcessos() {
			String variavelLocal = atributoPrivadoEstatico;
			System.out.println("variavelLocal : "+ variavelLocal);
		}

	}	

	/**
	 * Exemplo de Criação de Classe Interna Estatica<br/>
	 * ClassesInternas.ClasseInternaEstatica classeInternaEstatica = new ClassesInternas.ClasseInternaEstatica();
	 * @return Object
	 */
	public Object ExemploDeInstanciaClasseInternaEstatica() {
		ClassesInternas.ClasseInternaEstatica classeInternaEstatica = new ClassesInternas.ClasseInternaEstatica();
		return classeInternaEstatica;
	}	
	
	/**
	 * <h2>Classe Local</h2>
	 * 
	 * Definida no corpo de um bloco(por exemplo,um metodo), não pode ter nenhum
	 * modificador ,sendo privada daquele bloco.<br/>
	 * <br/>
	 * Tem acesso aos atributos e metodos da classe externa
	 * 
	 * @return Object
	 */

	public Object ExemploMetodoComClasseLocal() {
		final String variavelLocal = "variavelLocal";

		class ClasseLocal {
			private String atributoClasseLocal;

			/**
			 * Exemplo de Utilização de Variavel Local concatenado com Atributo
			 * da Classe local mais atributo Privado da Classe externa.
			 * 
			 * @return String = variavelLocal + atributoClasseLocal +
			 *         atributoPrivado;
			 */
			public String getAtributoClasseLocal() {
				return variavelLocal + atributoClasseLocal + atributoPrivado;
			}

			public void setAtributoClasseLocal(String atributoClasseLocal) {
				this.atributoClasseLocal = atributoClasseLocal;
			}

		}

		ClasseLocal classeLocal = new ClasseLocal();
		classeLocal.setAtributoClasseLocal("atributoClasseLocal");
		System.out.println(classeLocal.getAtributoClasseLocal());

		return classeLocal;
	}
	
	
	public Object ExemploClasseAnonima(){
		ClasseAnonima classeAnonima = new ClasseAnonima();
		return classeAnonima;
	}
}
