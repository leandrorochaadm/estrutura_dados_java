package cap2;

import java.math.BigDecimal;

/**
 * Arithmetic progression.
 */
class ArithProgression extends Progression {

  /** Increment. */
  protected BigDecimal inc;

  // Inherits variables first and cur.

  /** Default constructor setting a unit increment. */
  ArithProgression() {
    this(new BigDecimal(1));
  }

  /** Parametric constructor providing the increment. */
  ArithProgression(BigDecimal increment) {
    inc = increment; 
  }

  /** Advances the progression by adding the increment to the current value.
   * 
   * @return next value of the progression
   */
  protected BigDecimal nextValue() {
//	System.out.println(cur);
//    System.out.println(inc);
//    System.out.println(cur.add(inc));
    cur = cur.add(inc);
    return cur;
  }

  //  Inherits methods firstValue() and printProgression(int).
}