import gcd.gcd

class Rational(x: Int, y: Int) {
  require(y > 0, "denominator must be positive")
  val num: Int = x / gcd(abs(x), y)
  val den: Int = y / gcd(abs(x), y)

  def this(x: Int) = this(x, 1)

  override def toString: String = num + "/" + den

  def sub(that: Rational): Rational = this.add(that.neg())

  def neg(): Rational = new Rational(-this.num, this.den)

  def add(addend: Rational): Rational =
    new Rational(num * addend.den + addend.num * den, den * addend.den)

  private def abs(n: Int): Int = if (n >= 0) n else -n
}
