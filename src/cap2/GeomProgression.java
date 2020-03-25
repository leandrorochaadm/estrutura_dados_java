package cap2;

import java.math.BigDecimal;

/**
 * Geometric Progression
 */
class GeomProgression extends Progression {

  /** Base. */
  protected BigDecimal base;

  // Inherits variables first and cur.

  /** Default constructor setting base 2. */
  GeomProgression() {
    this(new BigDecimal(2));
  }

  /** Parametric constructor providing the base.
   *
   * @param b base of the progression.
   */
  GeomProgression(BigDecimal b) {
    base = b;
    first = new BigDecimal(1);
    cur = first;
  }

  /** Advances the progression by multiplying the base with the current value.
   * 
   * @return next value of the progression
   */
  protected BigDecimal nextValue() {
   cur = cur.multiply(base);
    return cur;
  }

  //  Inherits methods firstValue() and printProgression(int).
}