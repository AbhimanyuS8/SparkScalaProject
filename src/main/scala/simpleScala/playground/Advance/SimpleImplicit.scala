package simpleScala.playground.Advance

object SimpleImplicit extends App {


  implicit def toLength(x:String):Int= x.length
  implicit def int2String(x:Int):String= x.toString

  def rtrn(x:Int)=x
//  def rtrn(x:Int)=x+5
  println(rtrn("Krishna")+5)
  println("Krishna"+ 3 )
  def add(a: Int)(b: Int) : Int = a + b
  println(add(1)_)

def evn(n:Int)={if(n%2==0) true else false}
  val lst=List(1,2,3,4,5,6)

  lst.filter(!evn(_)).foreach(println)

}


