package demo.project.com.frameworkEngine

trait Node [T] {

  def execute:T {

  }

}


trait ConfigNode [T] {

  def load(s:String): T {


}

}
