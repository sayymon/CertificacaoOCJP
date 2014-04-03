package br.certificacao.ocjp6.declaracaoInicializacaoEscopo;


/**
 * <h1>Arrays</h1><br/>
 * Arrays podem ser dos tipos (primitivos,Referencia ou arrays de arrays(Matrizes))
 * <br/>
 * <br/>
 * Java verifica as posições a serem acessadas no array. caso seja feita referencia a uma posição invalida é retornada a exceção ArrayIndexOfBounds
 * Arrays são inicializados com os valores default :<br/> 
 * boolean = false;<br/>
 * byte = 0;<br/>
 * short = 0;<br/>
 * int = 0;<br/>
 * long = 0;<br/>
 * float = 0;<br/>
 * double = 0;<br/>
 * char = '\u0000';<br/>
 * Tipo Referencia = null;
 * 
 * @author Saymon
 *
 */
public class Arrays {
	byte[] arrayBytes = new byte[126];
	int[] arrayInteiros = {1,2,3,4,5,6};
	
	public void acessandoPosicaoInvalida() throws ArrayIndexOutOfBoundsException{
		for (byte i = 0; i <= 125; i++) {
			arrayBytes[i] = i;
		}
	}
	
	Double[][] arrayBidimensional = new Double[5][3]; 
	
	
}
