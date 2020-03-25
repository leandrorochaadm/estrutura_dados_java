package cap2;

import java.math.BigDecimal;

/**
 * Fibonacci progression.
 */
class FibonacciProgression extends Progression {
  /** Previous value. */
	BigDecimal prev;   
  // Inherits variables first and cur.

  /** Default constructor setting 0 and 1 as the first two values. */
  FibonacciProgression() {
    this(new BigDecimal(1), new BigDecimal(2));
  }
  /** Parametric constructor providing the first and second values.
   *
   * @param value1 first value.
   * @param value2 second value.
   */
  FibonacciProgression(BigDecimal value1, BigDecimal value2) {
      first = value1;
      prev = value2.subtract(value1); // fictitious value preceding the first
  }

  /** Advances the progression by adding the previous value to the current value.
   * 
   * @return next value of the progression
   */
  protected BigDecimal nextValue() {
	BigDecimal temp = prev;
    prev = cur;
    cur = cur.add(temp);
    return cur;
  }
  // Inherits methods firstValue() and printProgression(int).
}