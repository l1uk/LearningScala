import scala.annotation.tailrec

package object factorial {
  def fact(x: Int): Int = {
    if (x == 0) 1 else x * fact(x - 1);
  }


  def fact_iter(n: Int): Int = calc_iter(1, 1, n);

  @tailrec
  private def calc_iter(product: Int, counter: Int, argument: Int): Int =
    if (counter > argument) product
    else calc_iter(counter * product, counter + 1, argument)

}
