package simpleScala.playground

// In file Summer.scala
import simpleScala.playground.ChecksumCalculator.calcChecksum
object Summer {
  def main(args: Array[String]) {
    for (arg <- args)
      { println(arg + ": " + calcChecksum(arg)) }
println("This is main program")
  }
}