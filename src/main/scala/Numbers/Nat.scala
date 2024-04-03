package Numbers

abstract class Nat {
  def isZero: Boolean
  def predecessor: Nat
  def sucessor: Nat
  def +(that: Nat): Nat
  def -(that: Nat): Nat

}
object Zero extends Nat{

  override def isZero: Boolean = true

  override def predecessor: Nat = throw new NoSuchElementException()

  override def sucessor: Nat = new Succ(Zero)

  override def +(that: Nat): Nat = return that

  override def -(that: Nat): Nat = throw new NoSuchElementException()
}

class Succ(n: Nat) extends Nat{
  override def isZero: Boolean = false

  override def predecessor: Nat = n

  override def sucessor: Nat = new Succ(this)

  override def +(that: Nat): Nat = new Succ(predecessor+that)

  override def -(that: Nat): Nat =if (that == Zero) this else n - that.predecessor
}