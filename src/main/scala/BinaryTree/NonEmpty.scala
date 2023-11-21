package BinaryTree

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  override def add(x: Int): IntSet =
    if (x < elem) new NonEmpty(elem, left.add(x), right)
    else if (x > elem) new NonEmpty(elem, left, right.add(x))
    else this

  override def contains(x: Int): Boolean = if (x < elem) left contains x else if (x > elem) right contains x else true

  override def toString: String = "(" + left + elem + right + ")"

  override def union(other: IntSet): IntSet = ((left union right) union other).add(elem)

  override def remove(x: Int): IntSet = if (x < elem) new NonEmpty(elem, left remove x, right) else if (x > elem) new NonEmpty(elem, left, right remove x)
  else {
    if (right == Empty && left == Empty)
      Empty
    else if (right == Empty && left != Empty)
      new NonEmpty(left.getValue, Empty, Empty)
    else if (right != Empty && left == Empty)
      new NonEmpty(right.getValue, Empty, Empty)
    else
      new NonEmpty(left.max().getValue, left remove left.max().getValue, right)
  }

  override def intersec(other: IntSet): IntSet = ???

  override def max(): IntSet = if (right != Empty) right.max() else this

  override def getValue: Int = elem
}
