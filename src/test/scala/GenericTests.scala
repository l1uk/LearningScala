import A_operators.xor
import B_sqrt_recurs.sqrt
import org.scalatest.funsuite.AnyFunSuite

class GenericTests extends AnyFunSuite{
  test("Testing XOR operator") {
    assert(!xor(x = true, y = true));
    assert(xor(x = true, y = false));
    assert(xor(x = false, y = true));
    assert(!xor(x = false, y = false));
  }
  test("Testing SQRT"){
    assert(sqrt(4) == 2);
    assert(sqrt(16) == 4);
    assert(sqrt(49) == 7);
  }
}
