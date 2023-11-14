object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")
    val n1 = new Rational(2)
    val n2 = new Rational(2, 4)
    println(n1.add(n2))
  }
}