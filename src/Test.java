
public class Test {

	private static final long n = 150;

	public static void main(String[] args) {
	/*	
		System.out.println("*** Progressão simples");
		Progression pr = new Progression();
		pr.printProgression(n);
		*/
		
		System.out.println("*** Progressão arimetica");
		Progression pa = new ArithProgression();
		pa.printProgression(n);
		

		System.out.println("*** Progressão geometrica");
		Progression pg = new GeomProgression();
		pg.printProgression(n);

		System.out.println("*** Progressão fiboncci");
		Progression pf = new FibonacciProgression();
		pf.printProgression(n);
	}
	
}
