
object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")
    val l1 = new Cons[Int](1, new Nil[Int])
    //val l1 = List.singleton[Int](1)
    val l2 = new Cons[Int](2, l1)
    val l3 = new Cons[Int](3, l2)
    val l4 = new Cons[Int](4, l3)
    val l5 = new Cons[Int](5, l4)
    println(l5)
    println(l5.prefix(4))
    println(l5.suffix(4))
  }


}