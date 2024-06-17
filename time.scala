object time {
  private def time(): Int = {
    val ep : Int = 8
    val t : Int  = 7
    val d1 : Int = 2
    val d2 : Int = 3
    val d3 : Int = 2

    val t1 : Int = ep * d1
    val t2 : Int = t * d2
    val t3 : Int = ep * d3
    
    t1 + t2 + t3
  }

  def main(args: Array[String]): Unit = {
    println(time())
  }
}
