import HOF.{factorial_HOF, gen, prod_generated, product, sum, sumFactorials, sumInts, sumSquares, sum_HOF, sum_HOF_tailRec, sum_generated}
import factorial.{fact, fact_iter}
import fibonacci.{fib, fibIter}
import gcd.gcd
import logical_operators.xor
import BinaryTree.Empty
import sqrt.sqrt
import org.scalatest.funsuite.AnyFunSuite

class GenericTests extends AnyFunSuite {
  test("Testing XOR operator") {
    assert(!xor(x = true, y = true))
    assert(xor(x = true, y = false))
    assert(xor(x = false, y = true))
    assert(!xor(x = false, y = false))
  }
  test("Testing SQRT") {
    assert(sqrt(4) == 2)
    assert(sqrt(16) == 4)
    assert(sqrt(49) == 7)
  }
  test("Testing Fibonacci") {
    assert(fib(0) == 0)
    assert(fib(1) == 1)
    assert(fib(40) == 102334155)
    assert(fibIter(0) == 0)
    assert(fibIter(1) == 1)
    assert(fibIter(40) == 102334155)
  }
  test("testing GCD") {
    assert(gcd(1, 1) == 1)
    assert(gcd(10, 5) == 5)
    assert(gcd(1220, 516) == 4)
    assert(gcd(15101887, 3) == 1)
  }
  test("testing Factorial") {
    assert(fact(1) == 1)
    assert(fact(6) == 720)
    assert(fact(8) == 40320)
    assert(fact_iter(1) == 1)
    assert(fact_iter(6) == 720)
    assert(fact_iter(8) == 40320)
  }
  test("testing HOF composition") {
    assert(sumInts(1, 10) == sum_HOF_tailRec((x: Int) => x, 1, 10, 0))
    assert(sum_HOF((x: Int) => x * x, 1, 10) == sum_HOF_tailRec((x: Int) => x * x, 1, 10, 0))
    assert(sumFactorials(1, 10) == sum_HOF_tailRec(fact, 1, 10, 0))
    assert(sum(fact)(1, 10) == sumFactorials(1, 10))
    assert(factorial_HOF(1) == 1)
    assert(factorial_HOF(6) == 720)
    assert(factorial_HOF(8) == 40320)
    assert(sumInts(1, 10) == sum_generated(1, 10))
    assert(product(x => x)(1, 10) == prod_generated(1, 10))

  }
  test("Testing Rational Class") {
    val n1 = new Rational(2)
    val n2 = new Rational(2, 4)
    assert(n1 + n2 < n1)
    assert(n1.max(n2) == n1)
  }
  test("Testing BST and Sets") {
    val a = Empty.add(12)
    val b = a.add(15)
    val c = b.add(7)
    val d = c.add(22).add(5).add(6)
    val e = Empty.add(122)
    val f = e.add(152)
    val g = f.add(72)
    val h = g.add(222).add(12)
    assert(!(h contains 13))
    assert(d contains 12)
    assert(!((d remove 12) contains 12))
    assert((d union h) contains 12)
    assert((Empty intersec a) == Empty)
    assert((Empty remove 12) == Empty)
    assert((d remove 12).contains(5) && (d remove 12).contains(6) && (d remove 12).contains(22))
    assert((d intersec h) contains 12)
  }
}
