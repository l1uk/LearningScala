import factorial.fact_iter

import scala.annotation.tailrec

package object HOF {

  def sum_generated: (Int, Int) => Int =
    gen(((a, b) => a + b), x => x)

  def gen(op: (Int, Int) => Int, f: Int => Int): (Int, Int) => Int = {
    def generate(a: Int, b: Int): Int =
      if (a > b) 0 else op(f(a), generate(a + 1, b))

    generate
  }

  def sumInts: (Int, Int) => Int = sum(x => x)

  def sum(f: Int => Int): (Int, Int) => Int = { //currying
    def sumF(a: Int, b: Int): Int =
      if (a > b) 0 else f(a) + sumF(a + 1, b)

    sumF
  }

  def factorial_HOF(a: Int): Int = {
    product(x => x)(1, a);
  }

  def product(f: Int => Int): (Int, Int) => Int = { //currying
    def prodF(a: Int, b: Int): Int =
      if (a > b) 1 else f(a) * prodF(a + 1, b)

    prodF
  }

  def sumSquares(a: Int, b: Int): Int =
    sum_HOF(x => x * x, a, b)

  def sumFactorials(a: Int, b: Int): Int =
    sum_HOF_tailRec(fact_iter, a, b, 0)

  def sum_HOF(f: Int => Int, a: Int, b: Int): Int = {
    if (a > b) 0 else f(a) + sum_HOF(f, a + 1, b)
  }

  @tailrec
  def sum_HOF_tailRec(f: Int => Int, a: Int, b: Int, c: Int): Int =
    if (a > b) c else sum_HOF_tailRec(f, a + 1, b, c + f(a))

}
