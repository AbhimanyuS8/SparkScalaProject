package simpleScala.playground.Advance.PatternMatching

trait Person {
  def name: String
}

case class Student(name: String, year: Int) extends Person

case class Teacher(name: String, specialty: String) extends Person


object PatternMatch extends App {


  def getPersonDetails(p: Person): String = {
    p match {
      // due to unapply method
      case Student(name, year) => s"$name is a Student of year $year"
      case Teacher(name, whatTheyTeach) => s"$name is a teacher and teaches $whatTheyTeach"

    }

  }

}
