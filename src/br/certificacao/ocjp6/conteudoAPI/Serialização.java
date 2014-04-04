package br.certificacao.ocjp6.conteudoAPI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

/**
 * <h1>Serializa��o</h1>
 * 
 * Serializar um objeto, em Java, s� � poss�vel caso sua classe esteja marcada
 * como serializ�vel. Essa marca��o � feita com a simples implementa��o da
 * interface {@link java.io.Serializable} . Essa interface n�o possui m�todos
 * para se implementar e nem atributos. Ainda n�o existiam as anota��es no Java
 * 1.1, vers�o que trouxe pela primeira vez a serializa��o ao Java, e desta
 * maneira a implementa��o da interface era a melhor maneira de marcar uma
 * classe. A heran�a entre classes � naturalmente afetada pela serializa��o. J�
 * que quando uma classe implementa a interface �Serializable�, toda classe que
 * dela estender tamb�m estar� implicitamente marcada como serializ�vel
 * 
 * <h2>{@link ObjectOutputStream} e {@link ObjectInputStream}</h2><br/>
 * <br/>
 * Que s�o utilizadas para escrita e leitura de Objetos Serializados,
 * Serializa��o � a gera��o de um objeto em bytes de forma que o mesmo possa ser
 * restaurado ou desserializado, a desserializa��o s� ocorre quando a vers�o do
 * objeto serializado corresponde a vers�o de classe utilizada na serializa��o. <br/>
 * Seus construtores aceitam {@link OutputStream} e {@link InputStream}
 * respectivamente<br/>
 * <h3>Principais M�todos de {@link ObjectOutputStream}</h3> <br/>
 * void writeObject(Object o) : Responsavel por serializar o Objeto<br/>
 * <h3>Principais M�todos de {@link ObjectInputStream}</h3> <br/>
 * void readObject(Object o) : Responsavel por deserializar o Objeto<br/>
 * 
 * O modificador transient impede que o atributo seja serializado, igual aos
 * atributos est�ticos .
 * 
 * 
 * 
 */
public class Serializa��o implements Serializable {

	private static final long serialVersionUID = 1L;

	public Serializa��o() {
		super();
	}

	public Serializa��o(int id, String nome) {
		setId(id);
		setNome(nome);
	}

	private int id;
	private String nome;
	transient private String atributoNaoSerializavel;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAtributoNaoSerializavel() {
		return atributoNaoSerializavel;
	}

	public void setAtributoNaoSerializavel(String atributoNaoSerializavel) {
		this.atributoNaoSerializavel = atributoNaoSerializavel;
	}

	/**
	 * <h3>Exemplo de serializa��o e deserializa��o</h3>
	 * 
	 * <pre>
	 * Serializa��o serializavel = new Serializa��o(10,
	 * 		"Atributo a ser Serializado e Deserializado");
	 * Serializa��o.serializar("./Serializavel", serializavel);
	 * Serializa��o deserializado = (Serializa��o) Serializa��o
	 * 		.deserializar("./Serializavel");
	 * System.out.println("Id : " + deserializado.getId());
	 * System.out.println("Nome : " + deserializado.getNome());
	 * </pre>
	 * 
	 * Resultado : Cria o arquivo chamado Serializavel e apresenta ->
	 * 
	 * <pre>
	 * Id : 10  
	 * Nome : Atributo a ser Serializado e Deserializado
	 * </pre>
	 * 
	 * 
	 */
	public void exemploSerializarDeserializar() {
		Serializa��o serializavel = new Serializa��o(10,
				"Atributo a ser Serializado e Deserializado");
		Serializa��o.serializar("./Serializavel", serializavel);
		Serializa��o deserializado = (Serializa��o) Serializa��o
				.deserializar("./Serializavel");
		System.out.println("Id : " + deserializado.getId());
		System.out.println("Nome : " + deserializado.getNome());

	}

	public static void serializar(String path, Object obj) {
		FileOutputStream outFile;

		try {
			outFile = new FileOutputStream(path);
			ObjectOutputStream s;
			s = new ObjectOutputStream(outFile);
			s.writeObject(obj);
			s.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static Object deserializar(String path) {
		FileInputStream inFile = null;
		Object o = null;
		try {
			inFile = new FileInputStream(path);
			ObjectInputStream d = new ObjectInputStream(inFile);
			o = d.readObject();
			d.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return o;

	}

	/**
	 * <h3>Exemplo de Atributo transient</h3>
	 * 
	 * <pre>
	 * Serializa��o serializavel = new Serializa��o(11,
	 * 		"Atributo a ser Serializado e Deserializado");
	 * serializavel.setAtributoNaoSerializavel("Teste de Valor");
	 * Serializa��o.serializar("./Serializavel", serializavel);
	 * Serializa��o deserializado = (Serializa��o) Serializa��o
	 * 		.deserializar("./Serializavel");
	 * System.out.println("Id : " + deserializado.getId());
	 * System.out.println("Nome : " + deserializado.getNome());
	 * System.out.println("AtributonaoSerializavel : "
	 * 		+ deserializado.getAtributoNaoSerializavel());
	 * </pre>
	 * 
	 * Resultado : Cria o arquivo chamado Serializavel e apresenta ->
	 * 
	 * <pre>
	 * Id : 11
	 * Nome : Atributo a ser Serializado e Deserializado
	 * AtributonaoSerializavel : null
	 * </pre>
	 * 
	 * 
	 */

	public void exemploAtributoTransiente() {
		Serializa��o serializavel = new Serializa��o(11,
				"Atributo a ser Serializado e Deserializado");
		serializavel.setAtributoNaoSerializavel("Teste de Valor");
		Serializa��o.serializar("./Serializavel", serializavel);
		Serializa��o deserializado = (Serializa��o) Serializa��o
				.deserializar("./Serializavel");
		System.out.println("Id : " + deserializado.getId());
		System.out.println("Nome : " + deserializado.getNome());
		System.out.println("AtributonaoSerializavel : "
				+ deserializado.getAtributoNaoSerializavel());

	}
}
