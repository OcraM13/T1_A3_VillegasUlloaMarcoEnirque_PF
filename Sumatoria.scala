import scala.io.StdIn._

object Sumatoria {
  def main(args: Array[String]): Unit = {
    println("Numero inicial")
    var i = readInt()
    println("Numero final")
    var f = readInt()
    
    println(sumatoria(i,f))
  }
  
  def sumatoria(numI:Int, numF:Int): Int = {
    if(numF==numI){
      numI
    }else{
      numF+sumatoria(numI,numF-1)
    }
  }
}