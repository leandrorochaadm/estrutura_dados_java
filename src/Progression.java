
public abstract class Progression {
	/** Primeiro valor da progress�o. */
	protected long first;
	
	/** Valor atual da progress�o. */
	protected long cur;
	
	/** construtor default. */
	Progression(){
		cur = first = 0;
	}
	
	/**
	 * Reinicializa a progress�o com o valor inicial.
	 * @return valor inicial
	 */
	protected long firstValue() {
	cur = first;
	return cur;
	}
	
	/**
	 * Avan�a a progress�o para o pr�ximo valor.
	 * 
	 * @return pr�ximo valor da progress�o.
	 */
	
	protected abstract long nextValue(); /*{
		return ++cur; //pr�ximo valor default.
	}*/
	
	/**
	 * Imprime os primeiros valores n da progress�o
	 * @param n�mero n de valores a serem impressos
	 */
	public void printProgression(long n) {
		System.out.println(firstValue());
		for (int i = 2; i < n; i++) {
			System.out.println(nextValue());
//			System.out.println(); //termina a linha
		}
	}
	
}
