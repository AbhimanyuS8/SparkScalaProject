object Factorial extends App {


  def factorial(index: Int)={

    def fact(index:Int,acc:Long):Long={
      if(index <=1 ) acc
      else fact(index-1,acc=acc*index)
    }

    fact(index,1)

  }
val valFact= factorial(4)
  printf(s"factorial : $valFact")

}
