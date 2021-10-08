package simpleScala.playground.Advance

class MultipleImplicitConversion {

}

/*
import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.immutable._
import scala.collection.mutable._
import scala.collection.concurrent._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._



object Result {
  class CustomString(val s: String) {
    // Define method with name findLength to get the length of the string 's'

    def findLength=s.length
  }
  class CustomInt(val number : Int){
    //Define method with name multiply to perform multiplication of the 'number' by 10
    def multiply =number*10
  }

  // Define your implicit functions here.
  implicit def toCustomStr(s:String):CustomString= new CustomString(s)
  implicit def toCustomInt(s:String):CustomInt= new CustomInt(s.toInt)

  // Don't modify the test method.
  def test(var1:String){
    val o1 = var1.findLength
    println(o1)
    val output = var1.multiply
    println(output)
  }

}

object Solution {
  def main(args: Array[String]) {
    val test1 = StdIn.readLine.trim
    Result.test(test1)
  }
}
*/