package cap2;

import java.util.Scanner;
 
public class Test {

//	private static final long n = Long.parseLong(System.console().readLine());

	public static void main(String[] args) {
		System.out.println("Digite o n�mero para progress�o");
		//System.out.println(input.nextLong());
		long n = new Scanner(System.in).nextLong();
	/*	
		System.out.println("*** Progress�o simples");
		Progression pr = new Progression();
		pr.printProgression(n);
		*/
		
		System.out.println("*** Progress�o arimetica");
		Progression pa = new ArithProgression();
		pa.printProgression(n);
		

		System.out.println("*** Progress�o geometrica");
		Progression pg = new GeomProgression();
		pg.printProgression(n);

		System.out.println("*** Progress�o Fiboncci");
		Progression pf = new FibonacciProgression();
		pf.printProgression(n);
	}
	
}
