object vol {
  private def vol(r: Double): Double = {
    (4 / 3) * Math.PI * r * r * r
  }

  def main(args: Array[String]): Unit = {
    println(vol(5.0))
  }
}  
