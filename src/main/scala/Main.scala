import operators.xor
object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")
    println("xor(true,true): "+xor(true,true));
    println("xor(true,false): "+xor(true,false));
    println("xor(false,true): " + xor(false, true));
    println("xor(false,false): " + xor(false, false));
  }
}