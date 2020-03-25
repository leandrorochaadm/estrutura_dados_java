package cap2;

import java.math.BigDecimal;

public abstract class Progression {
	/** Primeiro valor da progressão. */
	protected BigDecimal first;
	
	/** Valor atual da progressão. */
	protected BigDecimal cur;
	
	/** construtor default. */
	Progression(){
		cur = first =  new BigDecimal(0);
	}
	
	/**
	 * Reinicializa a progressão com o valor inicial.
	 * @return valor inicial
	 */
	protected BigDecimal firstValue() {
	cur = first;
	return cur;
	}
	
	/**
	 * Avança a progressão para o próximo valor.
	 * 
	 * @return próximo valor da progressão.
	 */
	
	protected abstract BigDecimal nextValue(); /*{
		return ++cur; //próximo valor default.
	}*/
	
	/**
	 * Imprime os primeiros valores n da progressão
	 * @param número n de valores a serem impressos
	 */
	public void printProgression(long n) {
		System.out.println(firstValue());
		
		for (long i = 1; i<n ; i++ ) {
			System.out.println(nextValue());
//			System.out.println(); //termina a linha
		}
	}
	
}
