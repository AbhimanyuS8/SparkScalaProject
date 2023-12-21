package simpleScala.playground

object Operation extends App {
  val x=new Fraction(3,5)
  val y= new Fraction(5,9)
  val z=new Fraction(6,15)
  //  var res=x.mul(y)
  println(x isLessThan  y)
  println(x.max(y).numer + "/" +x.max(y).denom)
  println("x+y= "+ x.+(y))
  println("x+y= "+ (x + y))
  println("x+y= "+ (x-y))
  println("x-y " + x.-(y))
  println(" x add y : " + x.add(y))
  //println("x-y= "+ x-y)
  println("x*y= "+ x*y)
  println("x/y= "+ x/y)

  println("Method overload y * 2 = "+ y * 2) // Here y has method * that accepts Int as an argument
  /* But println("Method overload 2 * y = "+ 2 * y)  will not work bcs 2 doesnot have a method *
  In order to work the above we need to define an implicit conversion from Int to Fraction:
*/
  implicit def intToRational(x: Int) = new Fraction(x, 1)
  println("Implicit comnversion of Int type to fraction Type: 2 * y = "+ (2 * y))
  // println(res.numer + "/" + res.denom)

  //  val aux=new Fraction(3)
  //  val auz=new Fraction()
  //  println(aux.numer + "/" + aux.denom)
  //  println(auz.numer + "/" + auz.denom)

  // println(y.add(z).numer)
  //  println(y.add(z).denom)
  //
  //  println(y.mul(z).numer)
  //  println(y.mul(z).denom)

}
