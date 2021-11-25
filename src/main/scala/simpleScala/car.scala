package simpleScala
import common._

class LuxuryCars(model :String,Price:BigInt) extends ConfigLoad[Unit] {

   def details(model :String,Price:String):String={

    model
  }

 override def load(S:String):Unit={ println(s"Model: ${model} Price: ${Price}")}

}



object ConfigLoad {

  def apply(m:String,P:BigInt)= new LuxuryCars(m,P)


}

object MainMethod extends App{



    ConfigLoad("XUV",1000000).load("Bought")


}