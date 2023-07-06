object q2{
  def main(args: Array[String]): Unit = {

    def findCategory(n: Int): String = n match{
      case x if n<0 =>"Negative number"
      case x if n==0 => "Zero"
      case x if n%2==0 => "Even number"
      case x if n%2==1 => "Odd number"
    }

    println("Enter the number : ")
    var n = scala.io.StdIn.readLine().toInt
    val calculatedCategory = findCategory(n)
    println(calculatedCategory)

  }
}