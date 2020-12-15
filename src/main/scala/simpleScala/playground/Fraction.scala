package simpleScala.playground

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
  def isLessThan(that:Fraction)= this.numer * that.denom < this.denom*that.numer
//  println("The Fraction before normalisation is: " +n +"/"+d)

  def max(that:Fraction)= {
    if (isLessThan(that)) that
    else this
  }
  println("The Fraction after normalisation is: " +numer +"/"+denom)
}


object Operation extends App {
  val x=new Fraction(3,5)
  val y= new Fraction(5,9)
  val z=new Fraction(6,15)
//  var res=x.mul(y)
println(x isLessThan  y)
  println(x.max(y).numer + "/" +x.max(y).denom)

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