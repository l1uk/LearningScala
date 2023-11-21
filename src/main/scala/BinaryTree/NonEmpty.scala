package BinaryTree

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  override def add(x: Int): IntSet =
    if (x < elem) new NonEmpty(elem, left.add(x), right)
    else if (x > elem) new NonEmpty(elem, left, right.add(x))
    else this

  override def contains(x: Int): Boolean = if (x < elem) left contains x else if (x > elem) right contains x else true

  override def toString: String = "(" + left + elem + right + ")"

  override def union(other: IntSet): IntSet = ((left union right) union other).add(elem)

  override def remove(x: Int): IntSet =
    if (x < elem) left remove x else if (x > elem) right remove x else left union right


  override def intersec(other: IntSet): IntSet =
    if (other contains elem)
      new NonEmpty(elem, left intersec other, right intersec other)
    else
      (left intersec other) union (right intersec other)

  override def max(): IntSet = if (right != Empty) right.max() else this

  override def getValue: Int = elem
}
