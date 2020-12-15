package simpleScala.playground

class OutOfMemoryException extends Exception
trait customTrait {class NullEncountered extends NullPointerException}

class Crash() extends OutOfMemoryException  with customTrait {

  def outofmemory(): Nothing = {
//    val a= Array.ofDim(Int.MaxValue)
    throw new OutOfMemoryException
  }
  def length(str:String): Nothing ={
    str.length
    throw new NullEncountered
  }

  def division(x:Int,y:Int)=x/y

  def overflow():Int ={
//    1 + overflow()
    throw new Crash()
  }
}

object Exceptions extends App with customTrait {


   //throw new NullPointerException
   //throw new Exception
  val e=new Crash()

  try {
    /* !  doSomething()    */
        e.outofmemory
//        e.length(null)
//        e.division(10,0)
//        e.overflow()
      }
  catch {
    case ex: OutOfMemoryError => println("OutOfMemoryError.. !!!")
    case ex: NullEncountered => println("NullEncountered.. !!!")
    case ex: NullPointerException => println("NullPointerException... !!!")
    case ex: ArithmeticException => println("ArithmeticException... !!!")
    case ex: StackOverflowError =>  println("StackOverflowError... !!!")
    case ex: Crash => println("Your program has crashed")
    case ex: OutOfMemoryException => println("OutOfMemoryException ...!!!")
        }
  finally{
    println("This will finally get executed !!!")
         }
}
