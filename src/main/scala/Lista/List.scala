package Lista


trait List[+T] {

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
      Nil
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

  private def singleton[T](elem: T): List[T] = new Cons[T](elem, Nil)
  //def prefix(n: Int): List[T] = {
  //if (n >= len) this

  //}
}
