
public abstract class Progression {
	/** Primeiro valor da progressão. */
	protected long first;
	
	/** Valor atual da progressão. */
	protected long cur;
	
	/** construtor default. */
	Progression(){
		cur = first = 0;
	}
	
	/**
	 * Reinicializa a progressão com o valor inicial.
	 * @return valor inicial
	 */
	protected long firstValue() {
	cur = first;
	return cur;
	}
	
	/**
	 * Avança a progressão para o próximo valor.
	 * 
	 * @return próximo valor da progressão.
	 */
	
	protected abstract long nextValue(); /*{
		return ++cur; //próximo valor default.
	}*/
	
	/**
	 * Imprime os primeiros valores n da progressão
	 * @param número n de valores a serem impressos
	 */
	public void printProgression(long n) {
		System.out.println(firstValue());
		for (int i = 2; i < n; i++) {
			System.out.println(nextValue());
//			System.out.println(); //termina a linha
		}
	}
	
}
