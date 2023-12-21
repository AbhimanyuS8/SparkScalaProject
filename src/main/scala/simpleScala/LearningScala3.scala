package simpleScala

object LearningScala3 extends App{

  val ls= List(1,2,3,4,5,6,7,8,9)
  val map = Map(1->"One" , 2-> "two",3->"three")
 val out= ls.map { e =>

    try {
      map.get(e)
    }
    catch {
      case e: Exception =>
        println("Not Present")
        None
    }
  }

  println(out.filterNot(r=> r==None).map(e=>e.get))


}
