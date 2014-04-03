package br.certificacao.ocjp6.declaracaoInicializacaoEscopo;

/**
 * <h1>Enumerações</h1> Especifica uma Lista de Constantes separadas por virgula
 * (",") entre chaves("{}") tanto o enum e cada elemento interno deve respeitar
 * as regras dos {@link IdentificadoresVálidos}<br/>
 * <br/>
 * Um enum representa um novo tipo, equivalente às classes e interfaces<br/>
 * <br/>
 * Os Elementos listados no enum são do tipo de definição da Lista. Ex : Os
 * tipos de CANCELADO,ENVIADO,RECEBIDO são StatusPedido<br/>
 * <br/>
 * 
 * @author Saymon
 * 
 */
public class Enumerações {

	public Enumerações() {
		StatusPedido pendente = StatusPedido.PENDENTE;
		StatusPedidoEquivalenteAoEnum pendenteEquivalente = StatusPedidoEquivalenteAoEnum.PENDENTE;
		System.out.println(pendente);
		System.out.println(pendenteEquivalente);
	}

	/**
	 * Um enum pode ser definido internamente ou externamente a uma classe,
	 * inclusive em seu próprio arquivo java. Não pode ser definido dentro de um
	 * metodo como uma classe local<br/>
	 * Um enum pode conter atributos,metodos e construtores Todo enum tem por
	 * default o metodo values() para a obtenção de um array[] contendo seus
	 * elementos.
	 * <br/>
	 * Após a declaração dos valores é opcional a escrita de ponto e virgula quando não a nenhum trecho de codigo abaixo, caso seja inserido atributos contrutores ou metodos se torna obrigatório 
	 */

	public enum StatusPedido {
		PENDENTE, CANCELADO(1, "Cancelado"), ENVIADO(2, "Enviado"), RECEBIDO(3,
				"Recebido");

		private int id;
		private String descricao;

		StatusPedido() {

		}

		StatusPedido(int id, String descricao) {
			this.setId(id);
			this.setDescricao(descricao);
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

	}

}
/**
 * Classe equivalente a gerada pelo compilador quando trata um enum.
 * @author Saymon
 *
 */
class StatusPedidoEquivalenteAoEnum {

	private int id;
	private String descricao;

	static final StatusPedidoEquivalenteAoEnum PENDENTE = new StatusPedidoEquivalenteAoEnum();
	static final StatusPedidoEquivalenteAoEnum CANCELADO = new StatusPedidoEquivalenteAoEnum(1, "Cancelado");
	static final StatusPedidoEquivalenteAoEnum ENVIADO = new StatusPedidoEquivalenteAoEnum(2, "Enviado");
	static final StatusPedidoEquivalenteAoEnum RECEBIDO = new StatusPedidoEquivalenteAoEnum(3, "Recebido");

	StatusPedidoEquivalenteAoEnum() {

	}

	StatusPedidoEquivalenteAoEnum(int id, String descricao) {
		this.setId(id);
		this.setDescricao(descricao);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
