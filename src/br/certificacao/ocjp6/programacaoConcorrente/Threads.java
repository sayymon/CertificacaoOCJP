package br.certificacao.ocjp6.programacaoConcorrente;

import java.text.NumberFormat;

import javax.sql.rowset.spi.SyncResolver;

/**
 * <h1>Threads</h1> <br/>
 * É a forma de executar codigos em paralelo;<br/>
 * Uma {@link Thread} é implementada em um método run() para que ira ser
 * executado;<br/>
 * O run() deve ser public e deve retornar void e não deve lançar exceções;<br/>
 * <b>E pode ser criado de duas maneiras : </b><br/>
 * 1ª Atráves de uma subClasse de {@link Thread} e sobreescrever o método
 * <code>public void run();</code><br/>
 * 2ª Através de uma classe que implementa a interface {@link Runnable} e
 * implementar o método <code>public void run();</code><br/>
 * <br/>
 * As threads possuem prioridades que varia de 1 a 10, a thread mans tem
 * prioridade 5;<br/>
 * <br/>
 * Onde o scheduler/agendador da JVM dá preferencia para as {@link Thread} de
 * maior prioridade.sendo 10 a prioridade máxima<br/>
 * A thread herda a prioridade da thread que a instanciou;<br/>
 * Para configurarmos a prioridade de uma thread utiliza-se o método
 * <code>setPriority(int priority)</code><br/>
 * e para sabermos qual é a prioridade de uma thread utiliza-se o método
 * <code>getPriority()</code></code><br/>
 * <br/>
 * <br/>
 * 
 * <h2>Sincronização</h2> <br/>
 * Modificador synchronized pode ser utilizado em métodos ou blocos de códigos
 * acessados por uma {@link Thread} de vez thread-safe; Isso serve para garantir
 * a integridade de dados;
 * 
 * <h2>Principais métodos de Thread</h2>
 * start() -> Registra a Thread no Scheduler da JVM
 * sleep(double) -> Coloca a Thread em estado de espera conforma a quantidade de milissegundos informada.
 * yield() -> Aborta a Thread e da vez para a proxima .
 * join() -> Faz com que a thread aguarde uma determinada thread acabar para continuar executando.
 * @author Saymon
 * 
 */
public class Threads {

	/**
	 * <h1>Exemplo de Criação de Threads</h1>
	 * 
	 * <pre>
	 * ExemploThread et = new ExemploThread();
	 * et.start();
	 * 
	 * ExemploRunnable er = new ExemploRunnable();
	 * Thread thread = new Thread(er);
	 * thread.start();
	 * </pre>
	 */
	public void exemploCriacaoThread() {
		ExemploThread et = new ExemploThread();
		et.start();

		ExemploRunnable er = new ExemploRunnable();
		Thread thread = new Thread(er);
		thread.start();
	}

	/**
	 * <h3>Exemplo de Priorização de Threads</h3>
	 * 
	 * <pre>
	 * ExemploThread et = new ExemploThread();
	 * ExemploRunnable er = new ExemploRunnable();
	 * Thread thread = new Thread(er);
	 * System.out.println(&quot;Teste de Priorização de Threads&quot;);
	 * et.setPriority(Thread.MIN_PRIORITY);
	 * thread.setPriority(Thread.MAX_PRIORITY);
	 * 
	 * et.start();
	 * thread.start();
	 * </pre>
	 * 
	 * <b>Resultado :</b>
	 * 
	 * <pre>
	 * Teste de Priorização de Threads
	 * Executando ExemploRunnable
	 * Executando ExemploThread
	 * </pre>
	 */
	public void exemploPriorizacaoDeThreads() {
		ExemploThread et = new ExemploThread();
		ExemploRunnable er = new ExemploRunnable();
		Thread thread = new Thread(er);
		System.out.println("Teste de Priorização de Threads");
		et.setPriority(Thread.MIN_PRIORITY);
		thread.setPriority(Thread.MAX_PRIORITY);

		et.start();
		thread.start();

	}

	/**
	 * <h3>Exemplo de Sincronização</h3><br/>
	 * Implementei duas classes contas {@link ContaSincronizada} e
	 * {@link ContaNaoSincronizada} onde uma contem synchrnized em todos os
	 * métodos e a outra não . Fiz com que dois bancos um de SP e outro do RJ
	 * realize saques nestas contas ao mesmo tempo; A conta possui de saldo
	 * inicial Resultado deveria ser R$ 85.000,00 para ambas as contas porém
	 * veja o que pode acontecer com a conta não sincronizada.
	 * 
	 * Resultado :
	 * 
	 * <pre>
	 * Saldo da contaSincronizada : R$ 85.000,00
	 * Saldo da contaNaoSincronizada : R$ 85.053,00
	 * </pre>
	 * 
	 * @throws InterruptedException
	 */
	public void exemploSincronização() throws InterruptedException {
		final ContaSincronizada contaSincronizada = new ContaSincronizada();
		final ContaNaoSincronizada contaNaoSincronizada = new ContaNaoSincronizada();

		contaSincronizada.deposito(100000);
		contaNaoSincronizada.deposito(100000);

		Thread bancoSP = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 5000; i++) {
					contaSincronizada.saque(1);
					contaNaoSincronizada.saque(1);
				}

			}
		});

		Thread bancoRJ = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 10000; i++) {
					contaSincronizada.saque(1);
					contaNaoSincronizada.saque(1);
				}

			}
		});

		System.out.println("Realizando operações nas duas contas");
		// Banco de SP vai retirar 50 Reais de ambas as contas
		bancoSP.start();
		// Banco de RJ vai retirar 100 Reais de ambas as contas
		bancoRJ.start();
		bancoRJ.join();
		bancoSP.join();
		NumberFormat formatadorNumerico = NumberFormat.getCurrencyInstance();
		System.out.println("Saldo da contaSincronizada : "
				+ formatadorNumerico.format(contaSincronizada.getSaldo()));
		System.out.println("Saldo da contaNaoSincronizada : "
				+ formatadorNumerico.format(contaNaoSincronizada.getSaldo()));

	}
	
	
	//TODO Rever wait e notify 
}

class ExemploThread extends Thread {
	@Override
	public void run() {
		System.out.println("Executando ExemploThread");
	}
}

class ExemploRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Executando ExemploRunnable");

	}

}

class ContaNaoSincronizada {
	private double saldo = 0;

	public void saque(double valor) {
		this.saldo -= valor;
	}

	public void deposito(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}

}

class ContaSincronizada {
	private double saldo = 0;

	public synchronized void saque(double valor) {
		this.saldo -= valor;
	}

	public synchronized void deposito(double valor) {
		this.saldo += valor;
	}

	public synchronized double getSaldo() {
		return saldo;
	}
}
