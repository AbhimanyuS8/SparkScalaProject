package simpleScala
import scala.util.Properties._
object Learning extends App{


  //OPeration on List
//  val lst= List(1,2,3,"Ashish","Singh","Govind")
//
//  println("Printing 1st " + lst(0)+" Printing 4th "+lst(3))
//
//
//  println(envOrElse("PWD","undefined"))

  val a=List("1","2","3")
  val name= List("ashish","krishna","radhe")


name.map(x=> x.toUpperCase)

  val couples = List(List("Virat", "Anushka"),List("Ram","Sita"),List("Ramesh","Jaya"))

  couples.flatMap(x=>x.map(x=>x.toUpperCase))

  val lol = List(List(1,2), List(3,4),List(5,6),List(7,8))
  lol.flatMap(x=>x)

  val rs= a.reduceLeft((x,y)=>x + y)

  val fl= a.foldLeft(""){(acc,it)=> val df= acc+it
    df }

  println(rs)
  println(fl)

}
