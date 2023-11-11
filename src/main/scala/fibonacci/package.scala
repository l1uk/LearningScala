import scala.annotation.tailrec

package object fibonacci {
  def fib(n: Int): Int = {
    if (n == 0) 0 else if (n == 1) 1 else fib(n - 1) + fib(n - 2);
  }

  def fibIter(n: Int): Int = {
    @tailrec
    def calculateNext(x1: Int, x2: Int, counter: Int): Int = {
      if (counter > n) x2
      else calculateNext(x2, x1 + x2, counter + 1)
    }

    if (n == 0) 0 else if (n == 1) 1 else calculateNext(0, 1, 2);

  }
}
