object q3 {
  def main(args: Array[String]): Unit = {

    def toUpper(name:String, startIndex:Int, endIndex:Int): String = {
      var modifyName=name
      for(i<-startIndex to endIndex){
        val convertWord=modifyName.charAt(i).toUpper
        modifyName=modifyName.updated(i,convertWord)
      }
      modifyName
    }

    def toLower(name: String, startIndex: Int, endIndex: Int): String = {
      var modifyName = name
      for (i <- startIndex to endIndex) {
        val convertWord = modifyName.charAt(i).toLower
        modifyName = modifyName.updated(i, convertWord)
      }
      modifyName
    }

    def formatName(name:String, startIndex:Int, endIndex:Int, f:(String, Int, Int)=>String):String={
      f(name,startIndex,endIndex)
    }

    println("Enter the name: ")
    var  name = scala.io.StdIn.readLine()

    println("Enter the start index: ")
    var startIndex = scala.io.StdIn.readInt()

    println("Enter the end index: ")
    var endIndex = scala.io.StdIn.readInt()


    val resultU=formatName(name,startIndex,endIndex,toUpper)
    //val resultL=formatName(name,startIndex,endIndex,toLower)

    println(resultU)
    //println(resultL)

  }
}
