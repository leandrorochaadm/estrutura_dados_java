
public class Test {

	private static final long n = 150;

	public static void main(String[] args) {
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

		System.out.println("*** Progress�o fiboncci");
		Progression pf = new FibonacciProgression();
		pf.printProgression(n);
	}
	
}
