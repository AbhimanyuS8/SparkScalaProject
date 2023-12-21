package simpleScala.playground.Advance.PatternMatching

import scala.collection.Map

object AllPatternMatch extends App {


  val num = Range(-10, 10)

  //  num.foreach(println)

  num.foreach { x =>
    x match {
      case 1 => println("One")
      case 2 => println("Two")
      case 3 => println("Three")
      case 4 => println("Four")
      case 5 => println("Five")
      case 6 => println("Six")
      case 0 => println("Zero")
      case _ if (x > 6) => println(s"$x : Number is greater than Six")
      case _ => println(s"$x is Negative")
    }
  }

  def getClassAsString(x: Any): String = x match {
    case s: String => s + " is a String"
    case i: Int => "Int"
    case f: Float => "Float"
    case l: List[_] => "List"
    case p: Person => "Person"
    case true => "true"
    case List(0, _, _) => "Three element List with 0 as first element"
    case List(1, _*) => "a list beginning with one and having n number of elements"
    case m:Map[String,_] => "$x is a Map which has key as String type and Value as Any type"
    case _ => "No Match"

  }
val m = Map(("a"->1))
  case class Person()

  val c = getClassAsString(List("a", "b"))
  val p = getClassAsString(Person)
  println(p)


}
