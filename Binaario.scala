import scala.io.StdIn._

object Binaario {
  def main(args: Array[String]): Unit = {
    println("Escribe un numero")
    var num = readInt()
    print(binario(num))
  }
  
  def binario(num:Int): Int = {
    if(num<2){
      num
    }else {
      num%2 + (10*binario(num/2))
    }
  }
}