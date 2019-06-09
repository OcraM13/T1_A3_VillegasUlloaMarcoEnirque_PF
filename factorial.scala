import scala.io.StdIn._

object factorial {
  def main(args: Array[String]): Unit = {
    println("Escribe un numero")
    var num = readInt()
    print(factorial(num))
  }
  
  def factorial(num:Int): Int={
    if(num==0){
      1
    }else{
      num*factorial(num-1)
    }
  }
}