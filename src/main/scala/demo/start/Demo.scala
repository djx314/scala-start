package demo.start

object Demo {

  def main(arr: Array[String]): Unit = {
    var sum1: Int = 0
    for (i <- 1 to 100) {
      sum1 = sum1 + i
    }

    val sum2 = (1 to 100).sum

    println(sum1)
    println(sum2)
    println(sum1 == sum2)
  }

}
