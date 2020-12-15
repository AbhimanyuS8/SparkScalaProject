package simpleScala.playground

import simpleScala.playground.Counter.{DecBy, IncBy}

object MyCounter {
  def main(args: Array[String]): Unit = {

val o= new Counter()

    println(" Increment by 10 - " + IncBy(10))
    println(" Increment by 10 - " + IncBy(10))
    println(" Decrement by 5 - " + DecBy(5))
  }


}






