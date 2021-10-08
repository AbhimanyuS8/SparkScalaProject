package simpleScala.playground
/*
Contains the following concept---
private member in class
this keyword
operator method
method overloading
implicit conversion- Converting the receiver ex- intToRational


 */
class Fraction(n: Int, d: Int) {


 private def gcd(a:Int,b:Int):Int = {
    if(b==0) a
  else gcd(b,a % b)

  }
 private val g=gcd(n,d)

//  15,9
//  9,6
//  6,3
//  0,3
  val numer: Int = n/g
  val denom: Int = d/g

  def this(n:Int)= this(n,1)
  def this()= this(1)
  def add(that: Fraction): Fraction =
    new Fraction(numer * that.denom + that.numer * denom,
      denom * that.denom)
  def sub(that: Fraction): Fraction =
    new Fraction(numer * that.denom - that.numer * denom,
      denom * that.denom)
  def mul(that: Fraction): Fraction =
    new Fraction(numer * that.numer, denom * that.denom)
  def div(that: Fraction): Fraction =
    new Fraction(numer * that.denom, denom * that.numer)
  def +(that: Fraction): Fraction =
    new Fraction(numer * that.denom + that.numer * denom,
      denom * that.denom)
  def +(that:Int):Fraction= new Fraction(numer*1 + denom*that,denom)
  def -(that: Fraction): Fraction =
    new Fraction(numer * that.denom - that.numer * denom,
      denom * that.denom)
  def -(that:Int):Fraction= new Fraction(numer*1 + denom*that,denom)
  def *(that: Fraction): Fraction =
    new Fraction(numer * that.numer, denom * that.denom)
  def *(that:Int):Fraction= new Fraction(numer*that,denom)
  def /(that: Fraction): Fraction =
    new Fraction(numer * that.denom, denom * that.numer)
  def /(that:Int):Fraction= new Fraction(numer*1 , denom*that)
  def isLessThan(that:Fraction)= this.numer * that.denom < this.denom*that.numer
//  println("The Fraction before normalisation is: " +n +"/"+d)

  def max(that:Fraction)= {
    if (isLessThan(that)) that
    else this
  }

  override def toString: String = numer+"/"+denom
//  println("The Fraction after normalisation is: " +numer +"/"+denom)
}


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