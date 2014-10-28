package br.certificacao.ocjp6.orientacaoobjetos;

/**
 * <h1>Subclasse</h1> <br>
 * � uma nova classe que herda caracter�sticas de sua(s) {@link Classe}(s) ancestral(is)
 * 
 * @author Saymon
 *
 */
public class SubClasse extends Classe {
	public SubClasse() {
		this.atributo = "Subclasse";
		this.metodo();
		super.metodo();
	}
}
