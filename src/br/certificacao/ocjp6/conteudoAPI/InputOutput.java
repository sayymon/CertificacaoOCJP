package br.certificacao.ocjp6.conteudoAPI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * <h1>Elementos de IO</h1> <br/>
 * <h2> {@link File}</h2><br/>
 * Representa um arquivo ou um diretório <br/>
 * <b>Métodos para verificação de Propriedades :</b><br/>
 * boolean exists() : Verificar se o Arquivo Existe<br/>
 * boolean isDirectory() : Verificar se o {@link File} é um diretório.<br/>
 * boolean isFile() : Verificar se o {@link File} é um Arquivo.<br/>
 * int length() : Retorna a quantidade de bytes do arquivo<br/>
 * String[] list() : Retorna uma lista contendo os subdiretórios daquele
 * diretório<br/>
 * <br/>
 * <b>Métodos para alteração/criação de arquivos :</b><br/>
 * Todos lançam uma exceção {@link IOException}<br/>
 * boolean createNewFile() : Para Inicializar um arquivo com 0 bytes<br/>
 * boolean mkdir() : Para criar um novo diretório<br/>
 * boolean renameTo(File novoNome) : Para Renomear o Arquivo<br/>
 * <br/>
 * Todos retornam um boolean que representa se a execução do comando foi
 * realizada com sucesso ou não.<br/>
 * <h2>FileWriter(Escrita) e FileReader(Leitura)</h2><br/>
 * Permitem Trabalhar com fluxo de Caracteres para escrever e ler arquivos de
 * texto.<br/>
 * Seus construtores podem receber {@link String} ou {@link File} para designar
 * o arquivo a ser manipulado.<br/>
 * <h3>Principais métodos de {@link FileWriter}</h3><br/>
 * void write(String) : Envia caracteres para o arquivo.(tem que executar o
 * flush e o close) void flush() : Garante a gravação dos caracteres. void
 * close() : Fecha o Arquivo. <br/>
 * <h2> {@link Console}</h2> Classe introduzida a partir do java 6 com o objetivo
 * de facilitar a interação com o terminal de comandos. tanto para a leitura
 * quanto para a escrita de caracteres.<br/>
 * Obtido atráves do método static System.console(); <br/>
 * <h3>Principais métodos :</h3> Console printf(String mensagem,Object...
 * params) : Apresenta no terminal o conteúdo informado String readLine() :
 * Realiza a leitura da linha do console. String readLine(String
 * mensagem,Object... params) : Apresenta uma mensagem na tela e aguarda um
 * retorno String readPassword() : Realiza a leitura da linha do console e não
 * apresenta os caracteres digitados. String readPassword(String
 * mensagem,Object... params) : Apresenta uma mensagem na tela e aguarda um
 * retorno e não apresenta os caracteres digitados.
 * 
 * 
 * <h1> {@link FileOutputStream} e {@link FileInputStream}</h1><br/>
 * <br/>
 * Essas Classe são derivação das classe abstratas {@link OutputStream} e
 * {@link InputStream} especializada na escrita e leitura de bytes em arquivos
 * binários<br/>
 * 
 * Seus construtores aceitam String e objetos do tipo {@link File} para
 * representar um arquivo. <br/>
 * @author Saymon
 * 
 */
public class InputOutput {
	/**
	 * <h2>Exemplo de Criação de um File através de um arquivo e diretório</h2>
	 * 
	 * <pre>
	 * // Criado arquivo teste.txt na pasta raiz do projeto
	 * File arquivo = new File(&quot;teste.txt&quot;);
	 * File diretório = new File(&quot;d:/&quot;);
	 * System.out.println(diretório.isDirectory() ? &quot;File é um diretório&quot;
	 * 		: &quot;File não é um diretório&quot;);
	 * File arquivoEmUmDiretório = new File(diretório, &quot;teste.txt&quot;);
	 * </pre>
	 * 
	 * Apresenta :<br/>
	 * File é um diretório<br/>
	 * Arquivo Existe<br/>
	 * Arquivo não existe<br/>
	 */
	public void exemploFile() {
		File arquivo = new File("teste.txt");
		File diretório = new File("c:/");
		System.out.println(diretório.isDirectory() ? "File é um diretório"
				: "File não é um diretório");
		File arquivoEmUmDiretório = new File(diretório, "teste.txt");

		System.out.println(arquivo.exists() ? "Arquivo Existe"
				: "Arquivo não existe");
		System.out.println(arquivoEmUmDiretório.exists() ? "Arquivo Existe"
				: "Arquivo não existe");
		System.out.println(arquivo.isFile() ? "File é um Arquivo "
				: "File não é um Arquivo ");
		System.out.println("Tamanho em bytes do Arquivo :" + arquivo.length());
		System.err.println("subdiretórios de " + diretório.getPath());
		for (String diretorio : diretório.list()) {
			System.out.println(diretorio);
		}

	}

	/**
	 * <h1>Exemplo alteração Criação de Arquivos e Diretórios</h1>
	 * 
	 * <pre>
	 * File novoArquivo = new File(&quot;c:/testeFileRenomiado/teste.txt&quot;);
	 * try {
	 * 	File novoDiretorio = new File(&quot;c:/testeFile&quot;);
	 * 	if (novoDiretorio.mkdir()) {
	 * 		if (novoDiretorio.renameTo(new File(&quot;c:/testeFileRenomiado&quot;))) {
	 * 			if (!novoArquivo.exists()) {
	 * 				novoArquivo.createNewFile();
	 * 			}
	 * 		}
	 * 	}
	 * } catch (IOException e) {
	 * 	System.err.println(&quot;Falha ao Criar o Arquivo&quot;);
	 * 	e.printStackTrace();
	 * }
	 * 
	 * </pre>
	 * 
	 * Saida : Cria e Renomeia o diretório depois cria o arquivo teste.txt
	 */
	public void exemploAlteracaoCriacaoDeArquivos() {
		File novoArquivo = new File("c:/testeFileRenomiado/teste.txt");
		try {
			File novoDiretorio = new File("c:/testeFile");
			if (novoDiretorio.mkdir()) {
				if (novoDiretorio.renameTo(new File("c:/testeFileRenomiado"))) {

					if (!novoArquivo.exists()) {
						novoArquivo.createNewFile();
					}

				}
			}
		} catch (IOException e) {
			System.err.println("Falha ao Criar o Arquivo");
			e.printStackTrace();
		}

	}

	/**
	 * <h1>Exemplo Escrita e Leitura de Arquivos</h1>
	 * 
	 * <pre>
	 * File arquivo = new File(&quot;teste.txt&quot;);
	 * 
	 * try {
	 * 
	 * 	if (!arquivo.exists()) {
	 * 		// cria um arquivo (vazio)
	 * 		arquivo.createNewFile();
	 * 	}
	 * 
	 * 	// caso seja um diretório, é possível listar seus arquivos e
	 * 	// diretórios
	 * 	File[] arquivos = arquivo.listFiles();
	 * 
	 * 	// escreve no arquivo
	 * 	FileWriter fw = new FileWriter(arquivo, true);
	 * 
	 * 	BufferedWriter bw = new BufferedWriter(fw);
	 * 
	 * 	bw.write(&quot;Texto a ser escrito no txt&quot;);
	 * 
	 * 	bw.newLine();
	 * 
	 * 	bw.close();
	 * 	fw.close();
	 * 
	 * 	// faz a leitura do arquivo
	 * 	FileReader fr = new FileReader(arquivo);
	 * 
	 * 	BufferedReader br = new BufferedReader(fr);
	 * 
	 * 	// equanto houver mais linhas
	 * 	while (br.ready()) {
	 * 		// lê a proxima linha
	 * 		String linha = br.readLine();
	 * 
	 * 		// faz algo com a linha
	 * 		System.out.println(linha);
	 * 	}
	 * 
	 * 	br.close();
	 * 	fr.close();
	 * 
	 * } catch (IOException ex) {
	 * 	ex.printStackTrace();
	 * }
	 * </pre>
	 * 
	 */
	public void exemploEscritaELeituraDeArquivos() {
		File arquivo = new File("teste.txt");

		try {

			if (!arquivo.exists()) {
				// cria um arquivo (vazio)
				arquivo.createNewFile();
			}

			// escreve no arquivo
			FileWriter fw = new FileWriter(arquivo, true);

			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("Texto a ser escrito no txt");

			bw.newLine();

			bw.close();
			fw.close();

			// faz a leitura do arquivo
			FileReader fr = new FileReader(arquivo);

			BufferedReader br = new BufferedReader(fr);

			// equanto houver mais linhas
			while (br.ready()) {
				// lê a proxima linha
				String linha = br.readLine();

				// faz algo com a linha
				System.out.println(linha);
			}

			br.close();
			fr.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

	public static void main(String[] args) {
		InputOutput inputoutput = new InputOutput();
		inputoutput.exemploConsole();
	}

	public void exemploConsole() {
		Console console = System.console();
		if (console == null) {
			return;
		}
		System.out.println("Escreva Alguma Coisa");
		console.readLine();
		System.out.println(console.readLine("Escreva alguma coisa"));
		System.out.println(console.readPassword("Informe uma senha"));

	}

}
