object area {
  private def area(r : Double) : Double = {
    Math.PI * r * r
  }

  def main(args: Array[String]): Unit = {
    println(area(5.0))
  }
}
