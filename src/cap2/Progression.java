package cap2;

import java.math.BigDecimal;

public abstract class Progression {
	/** Primeiro valor da progress�o. */
	protected BigDecimal first;
	
	/** Valor atual da progress�o. */
	protected BigDecimal cur;
	
	/** construtor default. */
	Progression(){
		cur = first =  new BigDecimal(0);
	}
	
	/**
	 * Reinicializa a progress�o com o valor inicial.
	 * @return valor inicial
	 */
	protected BigDecimal firstValue() {
	cur = first;
	return cur;
	}
	
	/**
	 * Avan�a a progress�o para o pr�ximo valor.
	 * 
	 * @return pr�ximo valor da progress�o.
	 */
	
	protected abstract BigDecimal nextValue(); /*{
		return ++cur; //pr�ximo valor default.
	}*/
	
	/**
	 * Imprime os primeiros valores n da progress�o
	 * @param n�mero n de valores a serem impressos
	 */
	public void printProgression(long n) {
		System.out.println(firstValue());
		
		for (long i = 1; i<n ; i++ ) {
			System.out.println(nextValue());
//			System.out.println(); //termina a linha
		}
	}
	
}
