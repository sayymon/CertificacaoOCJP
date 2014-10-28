package br.certificacao.ocjp6.teste.orientacaoobjetos;

import org.junit.Test;

import br.certificacao.ocjp6.orientacaoobjetos.FilhaDeClasseAbstrata;

public class TesteHerancaAbstracao {

	@Test
	public void test() {
		//Instancia a classe FilhaDeClasseAbstrata
		FilhaDeClasseAbstrata radio1 = new FilhaDeClasseAbstrata(110);
 
        /*
         * chamando os m�todos abstratos implementados
         * dentro de cada classe ( Radio)
         */
 
        radio1.ligar();
        System.out.print("e o R�dio est� ");
        System.out.println(radio1.isLigado() ? "ligado." : "desligado.");		
	}

}
