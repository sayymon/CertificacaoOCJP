package br.certificacao.ocjp6.declaracaoInicializacaoEscopo;

public class ClasseAnonima{
	ClasseAnonima(){
	final String variavelLocal = "variavelLocal";
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Exemplo de Classe Anonima : " + variavelLocal);
			
		}
	};
	
	Thread t = new Thread(runnable);
	t.start();
	
	}
}