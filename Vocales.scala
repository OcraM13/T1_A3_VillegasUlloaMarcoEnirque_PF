import scala.io.StdIn._

object Vocales {
  def main(args: Array[String]): Unit = {
    println("Escribe una palabra")
    var cad = readLine()
    contar(cad)
  }
  
  def contar(cad:String): Unit = {
    var contador = 0
      
    for(pos <- 0 to cad.length()){
      if ((cad.charAt(pos)=='a') || (cad.charAt(pos)=='e') || (cad.charAt(pos)=='i') || (cad.charAt(pos)=='o') || (cad.charAt(pos)=='u')){
        contador = contador +1
      }
    }
    println(contador.toString())
  }
}