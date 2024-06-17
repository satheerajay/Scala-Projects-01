object tempConvert {
  private def temp(c: Double): Double = {
    c * 1.8000 + 32.00
  }

  def main(args: Array[String]): Unit = {
    println(temp(35.0))
  }
}

