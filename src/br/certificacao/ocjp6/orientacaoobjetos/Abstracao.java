package br.certificacao.ocjp6.orientacaoobjetos;

/**
 * 
 * <h1>Abstração</h1> 
 * 
 * É a habilidade de concentrar nos aspectos essenciais de um
 * contexto qualquer, ignorando características menos importantes ou acidentais.
 * Em modelagem orientada a objetos, uma classe é uma abstração de entidades
 * existentes no domínio do sistema de software.
 * <br>
 * Por exemplo, imaginamos a abstração referente a classe Animais. Há várias
 * entidades na classe Animais como Anfíbios, Répteis e Mamíferos que são também
 * {@link SubClasse}s da classe Animais, onde há objetos que contêm cada sub-classe
 * como Ser-humano, Jacaré e outros.
 * 
 * Uma classe abstrata é desenvolvida para representar entidades e conceitos
 * abstratos. A classe abstrata é sempre uma superclasse que não possui
 * instâncias. Ela define um modelo (template) para uma funcionalidade e fornece
 * uma implementação incompleta - a parte genérica dessa funcionalidade - que é
 * compartilhada por um grupo de classes derivadas. Cada uma das classes
 * derivadas, completa a funcionalidade da classe abstrata adicionando um
 * comportamento específico.
 * 
 * @author Saymon
 *
 */

public abstract class Abstracao {
	/**
	 * Exemplo de uma abstração de um Eletrodomestico.
	 */
    private boolean ligado;
    private int voltagem;
 
    /**
	 * <h3>Métodos abstratos</h3>
	 * 
	 * Não possuem corpo, da mesma forma que as assinaturas de método de uma
	 * interface.
	 * 
	 * <br>
	 * É frequentemente utilizado para especificar que uma subclasse deve
	 * fornecer uma implementação do método. Métodos abstratos são usados para
	 * especificar interfaces em algumas linguagens de computador
	 */
    public abstract void metodosAbstratos();
    
    public abstract void ligar();
    public abstract void desligar();
 
    /**
     * <h3>Método construtor</h3>
     * 
     * Classes Abstratas também podem ter métodos construtores,
     * porém, não podem ser usados para instanciar um objeto diretamente
     */
    public Abstracao(boolean ligado, int voltagem) {
        this.setLigado(ligado);
        this.setVoltagem(voltagem);
    }
 
    /**
     * <h3>Método concretos</h3>
     * 
     * Uma classe abstrata pode possuir métodos não abstratos
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
