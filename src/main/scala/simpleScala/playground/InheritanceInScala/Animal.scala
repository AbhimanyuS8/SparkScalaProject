package simpleScala.playground.InheritanceInScala


abstract class Animal {
  val creatureType: String

  def eat: Unit
}

class Dog extends Animal {

  val creatureType: String = "Canine"

  def eat: Unit = println("crunch crunch")

}

trait Carnivore {

  def eat(animal:Animal):Unit
}

class Crocodile extends Animal with Carnivore{

   val creatureType: String = "Crocodile"
  def eat = println(s"crush crush")
  def eat(animal:Animal) =println(s"I am a $creatureType and I eat ${animal.creatureType}")

}

object Main2 extends App{

  val croc = new Crocodile()
  croc.eat(new Dog)
}
