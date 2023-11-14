import scala.annotation.tailrec

package object sqrt {
  //Using Newton's Method

  def sqrt(x: Double): Double = {
    val err = 1E-15

    @tailrec
    def computeAndCheckRecursively(current_approx: Double): Double =
      if (isAccurate(current_approx)) current_approx else computeAndCheckRecursively(computeApprox(current_approx))

    def isAccurate(current_approx: Double): Boolean = abs(current_approx * current_approx - x) < err

    def computeApprox(current_approx: Double): Double = (current_approx + x / current_approx) / 2.0

    computeAndCheckRecursively(x)
  }

  def abs(x: Double): Double = if (x < 0) x * (-1) else x


}
