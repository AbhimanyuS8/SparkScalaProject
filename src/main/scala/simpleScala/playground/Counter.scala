package simpleScala.playground

class Counter() {
private var sum=0

  def Inc(by:Int=1): Unit = {
    sum +=by
      }
  def Dec(by:Int=1):Unit={

    //  by +=1 //by is val type, hence it cannot be muted
    sum -=by
  }
}

object Counter {

    val cc = new Counter()

  def IncBy(by:Int): Int ={
    for(i <- 1 to by)
       cc.Inc()
    cc.sum
  }

  def DecBy(by:Int): Int ={
    for(i <- 1 to by)
      cc.Dec()
    cc.sum
  }

// println( IncBy(10))
//  println(DecBy(5))
}