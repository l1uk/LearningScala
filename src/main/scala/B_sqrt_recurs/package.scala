import scala.annotation.tailrec

package object B_sqrt_recurs {
  //Using Newton's Method
  private val err = 1E-15

  def sqrt(x: Double): Double = computeAndCheckRecursively(x, x)

  @tailrec
  private def computeAndCheckRecursively(x: Double, current_approx: Double): Double =
    if (isAccurate(x, current_approx)) current_approx else computeAndCheckRecursively(x, computeApprox(x, current_approx))

  private def isAccurate(x: Double, current_approx: Double): Boolean = abs(current_approx * current_approx - x) < err

  private def abs(x: Double) = if (x < 0) x * (-1) else x

  private def computeApprox(x: Double, current_approx: Double): Double = (current_approx + x / current_approx) / 2.0
}
