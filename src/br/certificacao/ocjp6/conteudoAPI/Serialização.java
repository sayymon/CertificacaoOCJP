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
 * <h1>Serialização</h1>
 * 
 * Serializar um objeto, em Java, só é possível caso sua classe esteja marcada
 * como serializável. Essa marcação é feita com a simples implementação da
 * interface {@link java.io.Serializable} . Essa interface não possui métodos
 * para se implementar e nem atributos. Ainda não existiam as anotações no Java
 * 1.1, versão que trouxe pela primeira vez a serialização ao Java, e desta
 * maneira a implementação da interface era a melhor maneira de marcar uma
 * classe. A herança entre classes é naturalmente afetada pela serialização. Já
 * que quando uma classe implementa a interface “Serializable”, toda classe que
 * dela estender também estará implicitamente marcada como serializável
 * 
 * <h2>{@link ObjectOutputStream} e {@link ObjectInputStream}</h2><br/>
 * <br/>
 * Que são utilizadas para escrita e leitura de Objetos Serializados,
 * Serialização é a geração de um objeto em bytes de forma que o mesmo possa ser
 * restaurado ou desserializado, a desserialização só ocorre quando a versão do
 * objeto serializado corresponde a versão de classe utilizada na serialização. <br/>
 * Seus construtores aceitam {@link OutputStream} e {@link InputStream}
 * respectivamente<br/>
 * <h3>Principais Métodos de {@link ObjectOutputStream}</h3> <br/>
 * void writeObject(Object o) : Responsavel por serializar o Objeto<br/>
 * <h3>Principais Métodos de {@link ObjectInputStream}</h3> <br/>
 * void readObject(Object o) : Responsavel por deserializar o Objeto<br/>
 * 
 * O modificador transient impede que o atributo seja serializado, igual aos
 * atributos estáticos .
 * 
 * 
 * 
 */
public class Serialização implements Serializable {

	private static final long serialVersionUID = 1L;

	public Serialização() {
		super();
	}

	public Serialização(int id, String nome) {
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
	 * <h3>Exemplo de serialização e deserialização</h3>
	 * 
	 * <pre>
	 * Serialização serializavel = new Serialização(10,
	 * 		"Atributo a ser Serializado e Deserializado");
	 * Serialização.serializar("./Serializavel", serializavel);
	 * Serialização deserializado = (Serialização) Serialização
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
		Serialização serializavel = new Serialização(10,
				"Atributo a ser Serializado e Deserializado");
		Serialização.serializar("./Serializavel", serializavel);
		Serialização deserializado = (Serialização) Serialização
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
	 * Serialização serializavel = new Serialização(11,
	 * 		"Atributo a ser Serializado e Deserializado");
	 * serializavel.setAtributoNaoSerializavel("Teste de Valor");
	 * Serialização.serializar("./Serializavel", serializavel);
	 * Serialização deserializado = (Serialização) Serialização
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
		Serialização serializavel = new Serialização(11,
				"Atributo a ser Serializado e Deserializado");
		serializavel.setAtributoNaoSerializavel("Teste de Valor");
		Serialização.serializar("./Serializavel", serializavel);
		Serialização deserializado = (Serialização) Serialização
				.deserializar("./Serializavel");
		System.out.println("Id : " + deserializado.getId());
		System.out.println("Nome : " + deserializado.getNome());
		System.out.println("AtributonaoSerializavel : "
				+ deserializado.getAtributoNaoSerializavel());

	}
}
