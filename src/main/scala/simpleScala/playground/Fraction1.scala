/*
package simpleScala.playground

class Fraction(n:Int,d:Int) {
 private def gcd(a:Int,b:Int):Int={
    if (b==0) a
    else gcd(b,a%b)
  }
 private val g=gcd(n,d)
  val numer=n/g
  val denom=d/g

  // 15, 9
  //  9, 6
  //  6, 3
  //  =0
  //  gcd =3

  def this(n:Int)= this(n,1)
  def this()= this(1)
  def add(that:Fraction):Fraction={
    new Fraction(numer* that.denom + denom*that.numer,
      denom*that.denom)
  }
  def sub(that:Fraction):Fraction={
    new Fraction(numer* that.denom - denom*that.numer,
      denom*that.denom)
  }
  def mult(that:Fraction):Fraction= {
    new Fraction(numer * that.numer,
      denom * that.denom)
  }
  def div(that:Fraction):Fraction={
      new Fraction(numer * that.denom,
        denom * that.numer)
  }
  def isLessThan(that:Fraction)= numer*that.denom < denom*that.numer // is equivalent to the below one.
//    this.numer*that.denom < this.denom*that.numer
  def max(that:Fraction)= {
    if (isLessThan(that)) that
    else this
  }
  println("The Fraction before normalisation is: " +n + "/"  +d)
println("The Fraction after normalisation is: " +numer + "/"  +denom)
}

object Operation extends App{
//  val x=new Fraction(1,2)
//  val y=new Fraction(2,3)
//  val aux=new Fraction(5)
//  val intg=new Fraction()
  val x=new Fraction(3,5)
  val y=new Fraction(5,9)
//  val z=new Fraction(6,15)
//  val res=x.mult(y)
  println(x.isLessThan(y))
  val grtst= x.max(y)
  println(grtst.numer + "/" + grtst.denom)


//  6/15 = 2/5
//  15/45=1/3
//  val z=x.add(y)
//  println(z.numer + "/" + z.denom)
//  val s=y.sub(x)
//  println(s.numer + "/" + s.denom)


}
*/