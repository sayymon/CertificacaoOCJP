package br.certificacao.ocjp6.declaracaoInicializacaoEscopo;

/**
 * <h1>Declaração de Classes</h1>
 * 
 * Estrutura para criação da classe a palavra 'class' por obrigatoriedade.<br/>
 * <br/>
 * Elementos entre colchetes são opcionais :<br/>
 * <br/>
 * [modificadores] class NomeClasse<br/>
 * [extends SuperClasse]<br/>
 * [implements Interface1,Interface2, ...]{<br/>
 * [atributos]<br/>
 * [construtores]<br/>
 * [metodos]<br/>
 * [Enumerações]<br/>
 * [Classes Internas]<br/>
 * }<br/>
 * <br/>
 * 
 * <h2>Regras para declaração de uma classe :</h2> <br/>
 * <table border='1'>
 * <tr>
 * <td>*</td>
 * <td>A Classe deve ser Nomeada com um {@link IdentificadoresVálidos}</td>
 * </tr>
 * <tr>
 * <td>*</td>
 * <td>Quando a Classe é <b>public</b> o nome do arquivo .java deve ser o mesmo
 * do nome da classe declarada como <b>public</b></td>
 * </tr>
 * <tr>
 * <td>*</td>
 * <td>A declaração das importações(<b>imports</b>) deve ser antes das
 * declarações das classes</td>
 * <tr>
 * <tr>
 * <td>*</td>
 * <td>A declaração dos pacotes(<b>package</b>) deve ser unica e tem de ser
 * antes das declarações dos imports se houver</td>
 * <tr>
 * <tr>
 * <td>*</td>
 * <td>Para Instanciar um objeto de uma classe é usada palavra reservada
 * <b>new</b> seguida de um construtor valido e acessivel.</td>
 * <tr>
 * </tr>
 * <tr>
 * <td>*</td>
 * <td>Os modificadores de acesso permitidos para classe são public e default,
 * private e protect não funciona. da erro de compilação</td>
 * </tr>
 * <tr>
 * <td>*</td>
 * <td>O modificador abstract impede que a classe seja instaciada
 * {@link ClasseAbstrata}.Se houver algum metodo abstrato na classe a mesma deve
 * ser abstract.</td>
 * </tr>
 * <tr>
 * <td>*</td>
 * <td>O modificador final impede que a classe seja estendida/herdada</td>
 * </tr>
 * </table>
 * 
 * @author Saymon
 * 
 */

public class DeclaraçãoDeClasses extends ClasseAbstrata {

	/**
	 * Quando herdamos de uma classe abstrata {@link ClasseAbstrata} onde existe
	 * um metodo abstrato a primeira classe filha não abstrata tem por obrigação
	 * de implementar o metodo.
	 */
	@Override
	public Object metodoSemCorpo() {
		return null;
	}

}
