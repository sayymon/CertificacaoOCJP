package br.certificacao.ocjp6.orientacaoobjetos;

/**
 * 
 * <h1>Abstra��o</h1> 
 * 
 * � a habilidade de concentrar nos aspectos essenciais de um
 * contexto qualquer, ignorando caracter�sticas menos importantes ou acidentais.
 * Em modelagem orientada a objetos, uma classe � uma abstra��o de entidades
 * existentes no dom�nio do sistema de software.
 * <br>
 * Por exemplo, imaginamos a abstra��o referente a classe Animais. H� v�rias
 * entidades na classe Animais como Anf�bios, R�pteis e Mam�feros que s�o tamb�m
 * {@link SubClasse}s da classe Animais, onde h� objetos que cont�m cada sub-classe
 * como Ser-humano, Jacar� e outros.
 * 
 * Uma classe abstrata � desenvolvida para representar entidades e conceitos
 * abstratos. A classe abstrata � sempre uma superclasse que n�o possui
 * inst�ncias. Ela define um modelo (template) para uma funcionalidade e fornece
 * uma implementa��o incompleta - a parte gen�rica dessa funcionalidade - que �
 * compartilhada por um grupo de classes derivadas. Cada uma das classes
 * derivadas, completa a funcionalidade da classe abstrata adicionando um
 * comportamento espec�fico.
 * 
 * @author Saymon
 *
 */

public abstract class Abstracao {
	/**
	 * Exemplo de uma abstra��o de um Eletrodomestico.
	 */
    private boolean ligado;
    private int voltagem;
 
    /**
	 * <h3>M�todos abstratos</h3>
	 * 
	 * N�o possuem corpo, da mesma forma que as assinaturas de m�todo de uma
	 * interface.
	 * 
	 * <br>
	 * � frequentemente utilizado para especificar que uma subclasse deve
	 * fornecer uma implementa��o do m�todo. M�todos abstratos s�o usados para
	 * especificar interfaces em algumas linguagens de computador
	 */
    public abstract void metodosAbstratos();
    
    public abstract void ligar();
    public abstract void desligar();
 
    /**
     * <h3>M�todo construtor</h3>
     * 
     * Classes Abstratas tamb�m podem ter m�todos construtores,
     * por�m, n�o podem ser usados para instanciar um objeto diretamente
     */
    public Abstracao(boolean ligado, int voltagem) {
        this.setLigado(ligado);
        this.setVoltagem(voltagem);
    }
 
    /**
     * <h3>M�todo concretos</h3>
     * 
     * Uma classe abstrata pode possuir m�todos n�o abstratos
     */
    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
 
    public int getVoltagem() {
        return this.voltagem;
    }
 
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
 
    public boolean isLigado() {
        return ligado;
    }
	
}
