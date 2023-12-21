package simpleScala.playground.InheritanceInScala
class Commuter

abstract class Vehicle(speed:Int) {

  val mph:Int  = speed
  def race()= println("Racing")
  def overspeeding(speedLimit:Int):Boolean

  def this()=this(0)

}

// Abstract Classes cannot be instatiated


class Car(val name:String,speed:Int) extends Vehicle(speed)
{
  override val mph= speed
// overiding is not needed for abstract members of abstract classes
  // override def overspeeding(speedLimit:Int)={
  def overspeeding(speedLimit:Int)={
    mph> speedLimit
  }

  override def race()=println("Racing Car")

}


object Main1 extends App {

  val car= new Car("Maruti",100)

  if(car.overspeeding(80)) println(s"${car.name} Car is overspeeding")

}

