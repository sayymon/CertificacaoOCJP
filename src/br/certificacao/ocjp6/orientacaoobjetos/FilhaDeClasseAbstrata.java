package br.certificacao.ocjp6.orientacaoobjetos;
/**
 * Exemplo de uma classe herdando uma {@link Abstracao}
 * <br>
 * Relação de É-UM : 
 * <br>
 * Ex : Rádio é um Eletrodoméstico
 * <br>
 * @author Saymon
 *
 */
public class FilhaDeClasseAbstrata extends Abstracao {

	//atributos...
		public static final short AM = 1;
	    public static final short FM = 2;
	    private int banda;
	    private float sintonia;
	    private int volume;
	 
	    //metodos do classe FilhaDeClasseAbstrata que seria um Radio...
	 
	 
	 
	    //metodo construtor...
	    public FilhaDeClasseAbstrata(int voltagem) {
	        super(true, voltagem);
	        setBanda(FilhaDeClasseAbstrata.FM);
	        setSintonia(0);
	        setVolume(0);
	    }
	 
	    /**
		 * @return the banda
		 */
		public int getBanda() {
			return banda;
		}
	 
		/**
		 * @param banda the banda to set
		 */
		public void setBanda(int banda) {
			this.banda = banda;
		}
	 
		/**
		 * @return the sintonia
		 */
		public float getSintonia() {
			return sintonia;
		}
	 
		/**
		 * @param sintonia the sintonia to set
		 */
		public void setSintonia(float sintonia) {
			this.sintonia = sintonia;
		}
	 
		/**
		 * @return the volume
		 */
		public int getVolume() {
			return volume;
		}
	 
		/**
		 * @param volume the volume to set
		 */
		public void setVolume(int volume) {
			this.volume = volume;
		}
	 
	 
		/* implementação dos métodos abstratos */
	    public void desligar() {
	        super.setLigado(false);
	        setSintonia(0);
	        setVolume(0);
	    }
	 
	    public void ligar() {
	        super.setLigado(true);
	        setSintonia(88.1f);
	        setVolume(25);
	    }

		@Override
		public void metodosAbstratos() {
			
		}

}
