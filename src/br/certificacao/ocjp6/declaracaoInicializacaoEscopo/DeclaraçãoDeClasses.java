package br.certificacao.ocjp6.declaracaoInicializacaoEscopo;

/**
 * <h1>Declara��o de Classes</h1>
 * 
 * Estrutura para cria��o da classe a palavra 'class' por obrigatoriedade.<br/>
 * <br/>
 * Elementos entre colchetes s�o opcionais :<br/>
 * <br/>
 * [modificadores] class NomeClasse<br/>
 * [extends SuperClasse]<br/>
 * [implements Interface1,Interface2, ...]{<br/>
 * [atributos]<br/>
 * [construtores]<br/>
 * [metodos]<br/>
 * [Enumera��es]<br/>
 * [Classes Internas]<br/>
 * }<br/>
 * <br/>
 * 
 * <h2>Regras para declara��o de uma classe :</h2> <br/>
 * <table border='1'>
 * <tr>
 * <td>*</td>
 * <td>A Classe deve ser Nomeada com um {@link IdentificadoresV�lidos}</td>
 * </tr>
 * <tr>
 * <td>*</td>
 * <td>Quando a Classe � <b>public</b> o nome do arquivo .java deve ser o mesmo
 * do nome da classe declarada como <b>public</b></td>
 * </tr>
 * <tr>
 * <td>*</td>
 * <td>A declara��o das importa��es(<b>imports</b>) deve ser antes das
 * declara��es das classes</td>
 * <tr>
 * <tr>
 * <td>*</td>
 * <td>A declara��o dos pacotes(<b>package</b>) deve ser unica e tem de ser
 * antes das declara��es dos imports se houver</td>
 * <tr>
 * <tr>
 * <td>*</td>
 * <td>Para Instanciar um objeto de uma classe � usada palavra reservada
 * <b>new</b> seguida de um construtor valido e acessivel.</td>
 * <tr>
 * </tr>
 * <tr>
 * <td>*</td>
 * <td>Os modificadores de acesso permitidos para classe s�o public e default,
 * private e protect n�o funciona. da erro de compila��o</td>
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

public class Declara��oDeClasses extends ClasseAbstrata {

	/**
	 * Quando herdamos de uma classe abstrata {@link ClasseAbstrata} onde existe
	 * um metodo abstrato a primeira classe filha n�o abstrata tem por obriga��o
	 * de implementar o metodo.
	 */
	@Override
	public Object metodoSemCorpo() {
		return null;
	}

}
