package object Lista {
  def apply[T](): List[T] = Nil
  def apply[T](x: T): List[T] = new Cons(x: T, Nil)
  def apply[T](x1: T, x2: T): List[T] = new Cons(x1, new Cons(x2,  Nil))
}
