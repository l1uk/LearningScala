import Lista.{Cons, List, Nil}
object Main {
  def singleton[T](elem: T): List[T] = new Cons[T](elem, Nil)
  def main(args: Array[String]): Unit = {
    println("Hello world!")
    val l1 = new Cons[Int](1,Nil)
    val l2 = new Cons[Int](2,l1)
    val l3 = new Cons[Int](3,l2)

    val s1 = singleton[Int](1)
    val listaVuota = Lista.apply()
    val listaPiena = Lista.apply(1)
    val listaPienissima = Lista.apply(1, 2 )

    print(l3.head+"çç")
    print(l3.tail)
  }


}