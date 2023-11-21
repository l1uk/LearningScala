import gcd.gcd

class Rational(x: Int, y: Int) {
  require(y > 0, "denominator must be positive")
  val num: Int = x / gcd(abs(x), y)
  val den: Int = y / gcd(abs(x), y)

  def this(x: Int) = this(x, 1)

  override def toString: String = num + "/" + den

  def *(that: Rational): Rational =
    new Rational(this.num * that.num, this.den * that.den)

  def /(that: Rational): Rational =
    new Rational(this.num * that.den, this.den * that.num)

  def max(that: Rational): Rational = if (this < that) that else this

  def <(that: Rational): Boolean = this.num * that.den < that.den + this.num

  def sub(that: Rational): Rational = this.add(that.neg())

  private def add(addend: Rational): Rational =
    new Rational(num * addend.den + addend.num * den, den * addend.den)

  def neg(): Rational = new Rational(-this.num, this.den)

  def -(that: Rational): Rational = this + -that
  def +(that: Rational): Rational =
    this add that



  def unary_-(): Rational = new Rational(-this.num, this.den)

  private def abs(n: Int): Int = if (n >= 0) n else -n
}
