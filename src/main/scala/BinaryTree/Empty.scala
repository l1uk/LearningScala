package BinaryTree

//singleton object
object Empty extends IntSet {
  override def add(x: Int): IntSet = new NonEmpty(x, Empty, Empty)

  override def contains(x: Int): Boolean = false

  override def toString: String = "."

  override def union(other: IntSet): IntSet = other

  override def remove(x: Int): IntSet = Empty

  override def intersec(other: IntSet): IntSet = Empty

  override def max(): IntSet = Empty

  override def getValue(): Int = -1
}
