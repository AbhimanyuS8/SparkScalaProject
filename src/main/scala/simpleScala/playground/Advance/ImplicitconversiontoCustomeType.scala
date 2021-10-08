package simpleScala.playground.Advance

class ImplicitconversiontoCustomeType {

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


import Result._

object Result {

  class customString(str:String){
    def isNumeric = str.forall(_.isDigit)

  }
  //  Define class customString which accpets a string
  //  Define a method isNumeric inside this class to check if each digit in the number is of numeric type or not

  // Define a implicit function strToCustomString which accepts a string and returns a object of type CustomString


  // Avoid handling the test method.
  def test(var1:String){
    val output = var1.isNumeric
    println(output)
  }

  implicit def strToCustomString(s: String):customString= new customString(s)

}
object Solution {
  def main(args: Array[String]) {
    val test1 = StdIn.readLine

    Result.test(test1)
  }
}
*/