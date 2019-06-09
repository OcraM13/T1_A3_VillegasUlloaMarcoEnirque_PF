import scala.io.StdIn._

object Divisores {
  def main(args: Array[String]): Unit = {
    println("Primer Numero")
    var num1 = readInt()
    println("segundo Numero")
    var num2 = readInt()
    
    divisor(num1,num2)
  }
  
  def divisor(x:Int, y:Int): Unit = {
   var cont = 0
   if(y<1){
    0
    cont = 0
   }
   else{
     if((x % y) == 0){
       cont = cont + 1
       println(cont)
     }
     divisor(x,(y-1))
   }
  }
}