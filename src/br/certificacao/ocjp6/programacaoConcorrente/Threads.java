package br.certificacao.ocjp6.programacaoConcorrente;

import java.text.NumberFormat;

import javax.sql.rowset.spi.SyncResolver;

/**
 * <h1>Threads</h1> <br/>
 * � a forma de executar codigos em paralelo;<br/>
 * Uma {@link Thread} � implementada em um m�todo run() para que ira ser
 * executado;<br/>
 * O run() deve ser public e deve retornar void e n�o deve lan�ar exce��es;<br/>
 * <b>E pode ser criado de duas maneiras : </b><br/>
 * 1� Atr�ves de uma subClasse de {@link Thread} e sobreescrever o m�todo
 * <code>public void run();</code><br/>
 * 2� Atrav�s de uma classe que implementa a interface {@link Runnable} e
 * implementar o m�todo <code>public void run();</code><br/>
 * <br/>
 * As threads possuem prioridades que varia de 1 a 10, a thread mans tem
 * prioridade 5;<br/>
 * <br/>
 * Onde o scheduler/agendador da JVM d� preferencia para as {@link Thread} de
 * maior prioridade.sendo 10 a prioridade m�xima<br/>
 * A thread herda a prioridade da thread que a instanciou;<br/>
 * Para configurarmos a prioridade de uma thread utiliza-se o m�todo
 * <code>setPriority(int priority)</code><br/>
 * e para sabermos qual � a prioridade de uma thread utiliza-se o m�todo
 * <code>getPriority()</code></code><br/>
 * <br/>
 * <br/>
 * 
 * <h2>Sincroniza��o</h2> <br/>
 * Modificador synchronized pode ser utilizado em m�todos ou blocos de c�digos
 * acessados por uma {@link Thread} de vez thread-safe; Isso serve para garantir
 * a integridade de dados;
 * 
 * <h2>Principais m�todos de Thread</h2>
 * start() -> Registra a Thread no Scheduler da JVM
 * sleep(double) -> Coloca a Thread em estado de espera conforma a quantidade de milissegundos informada.
 * yield() -> Aborta a Thread e da vez para a proxima .
 * join() -> Faz com que a thread aguarde uma determinada thread acabar para continuar executando.
 * @author Saymon
 * 
 */
public class Threads {

	/**
	 * <h1>Exemplo de Cria��o de Threads</h1>
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
	 * <h3>Exemplo de Prioriza��o de Threads</h3>
	 * 
	 * <pre>
	 * ExemploThread et = new ExemploThread();
	 * ExemploRunnable er = new ExemploRunnable();
	 * Thread thread = new Thread(er);
	 * System.out.println(&quot;Teste de Prioriza��o de Threads&quot;);
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
	 * Teste de Prioriza��o de Threads
	 * Executando ExemploRunnable
	 * Executando ExemploThread
	 * </pre>
	 */
	public void exemploPriorizacaoDeThreads() {
		ExemploThread et = new ExemploThread();
		ExemploRunnable er = new ExemploRunnable();
		Thread thread = new Thread(er);
		System.out.println("Teste de Prioriza��o de Threads");
		et.setPriority(Thread.MIN_PRIORITY);
		thread.setPriority(Thread.MAX_PRIORITY);

		et.start();
		thread.start();

	}

	/**
	 * <h3>Exemplo de Sincroniza��o</h3><br/>
	 * Implementei duas classes contas {@link ContaSincronizada} e
	 * {@link ContaNaoSincronizada} onde uma contem synchrnized em todos os
	 * m�todos e a outra n�o . Fiz com que dois bancos um de SP e outro do RJ
	 * realize saques nestas contas ao mesmo tempo; A conta possui de saldo
	 * inicial Resultado deveria ser R$ 85.000,00 para ambas as contas por�m
	 * veja o que pode acontecer com a conta n�o sincronizada.
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
	public void exemploSincroniza��o() throws InterruptedException {
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

		System.out.println("Realizando opera��es nas duas contas");
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
