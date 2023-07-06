object q1 {
  def main(args: Array[String]): Unit = {

    def interest(a:Double): Double= a match{
      case x if a<=20000 => a/100*2
      case x if a<=200000 => a/100*4
      case x if a<=2000000 => a/100*3.5
      case x if a>2000000 => a/100*6.5

      }

    println("Enter the deposit amount : ")
    var x = scala.io.StdIn.readLine().toDouble
    val calculatedInterest = interest(x)
    println("The interest earned in a year is: " + calculatedInterest)


  }
}