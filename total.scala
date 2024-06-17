object total {
  private def total(copies : Int) : Double = {
    val cPrice : Double = 24.95
    val discount : Double = 0.4
    val discountedPrice : Double = cPrice * (1-discount)
    val sCostFirst50 : Double = 3.0
    val sCostAdditional : Double = 0.75

    val totalBookCost : Double = copies * discountedPrice
    val totalShipping : Double = if(copies <= 50){
      copies * sCostFirst50
    }else{
      (50 * sCostFirst50) + ((copies-50) * (sCostFirst50+sCostAdditional))
    }
    totalBookCost + totalShipping
  }

  def main(args: Array[String]): Unit = {
    println(total(60))
  }
}
