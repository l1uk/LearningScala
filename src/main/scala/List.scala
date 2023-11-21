


trait List[T] {
  def isEmpty: Boolean

  def head: T

  def tail: List[T]

  def len: Int

  def nth(n: Int): T = {
    if (isEmpty)
      throw new IndexOutOfBoundsException(n.toString)
    else if (n == 0)
      this.head
    else
      this.tail.nth(n - 1)
  }

  def prefix(n: Int): List[T] = {
    if (n > len) this
    else if (n == 1) singleton[T](head)
    else
      new Cons(head, tail.prefix(n - 1))
  }

  def suffix(n: Int): List[T] = {
    if (len < n)
      new Nil[T]
    else if (len == n)
      this
    else
      this.tail.suffix(n)
  }

  override def toString: String = {
    if (isEmpty)
      "."
    else
      head + " ; " + tail

  }

  private def singleton[RT](elem: RT): List[RT] = new Cons[RT](elem, new Nil[RT])
  //def prefix(n: Int): List[T] = {
  //if (n >= len) this

  //}
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty: Boolean = false

  override def len: Int = tail.len + 1
}

class Nil[T] extends List[T] {
  override def isEmpty: Boolean = true

  override def head: T = throw new NoSuchElementException("Nil.head")

  override def tail: List[T] = throw new NoSuchElementException("Nil.tail")

  override def len: Int = 0
}