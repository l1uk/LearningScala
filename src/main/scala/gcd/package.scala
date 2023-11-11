import scala.annotation.tailrec

package object gcd {
  @tailrec
  def gcd(a: Int, b: Int): Int = {
    if (a == 0) b else if (b == 0) a else gcd(b, a % b)
  }

}
