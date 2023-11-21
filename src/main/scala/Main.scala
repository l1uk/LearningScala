import BinaryTree.Empty


object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")
    val a = Empty.add(12)
    val b = a.add(15)
    val c = b.add(7)
    val d = c.add(22).add(5).add(6).add(13).add(14).add(21).add(24).add(3)
    val e = Empty.add(122)
    val f = e.add(152)
    val g = f.add(72)
    val h = g.add(222)

    val sos = Empty.add(5).add(2).add(7).add(9).add(3)

    println(sos)
    println(sos remove 5)
    println("...")
    println(sos intersec d)
    println(d remove 12)
    println((d remove 12) remove 22)
    println(d.max())
    println(h)
    println(d union h)
    println(h contains 12)
    println((d union h) contains 12)
    println((d union h).max())
    //println()
  }
}