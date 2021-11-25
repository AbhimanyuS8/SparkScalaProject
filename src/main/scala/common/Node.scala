package common

trait Node [T] {

  def execute:T

}


trait ConfigLoad [T] {

  def load(s:String): T

}
