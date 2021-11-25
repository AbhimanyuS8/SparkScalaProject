package simpleScala

object ControlMethodScope {
  val a= new Foo("Abhimanyu","Krishna") ;
  a.b // is accesible as its a member variable of class foo
//  a.c is not accessible from this place
//  a.a is not accessible from this place , it is not a member variable of class Foo
  // a.x is not accessible from this place
  // a.funct is not accessible
//  a.y is not accessible from this place

}


class Foo(a:String, val b:String) {
  private val x="x"
  private def isFoo = true
  private[this] def funct=true
  protected val y="y"

  def checkFoo(other:Foo): Unit ={
     other.x   // is accessible
//    other.funct is not accessible from this place

  }
      }

class subFoo(a:String,b:String) extends Foo(a,b) {

// isFoo is not accessible from this place, it wont compile - private members are not avilable to subclasses
//  funct is not accessible from this place, it wont compile - private members are not avilable to subclasses

  y // protected makes the method available to its subclasses

}



