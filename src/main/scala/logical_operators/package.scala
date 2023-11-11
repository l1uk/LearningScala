package object logical_operators {
  def not(x: Boolean): Boolean = if (x) false else true

  def and(x: Boolean, y: Boolean): Boolean =
    if (x) if (y) true else false else false

  def or(x: Boolean, y: Boolean): Boolean =
    if (x) true else if (y) true else false

  def xor(x: Boolean, y: Boolean): Boolean = and(or(x, y), not(and(x, y)))
}
