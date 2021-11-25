package simpleScala.playground
import common._
object Simple extends App {

  val str=""
//  if(str.isEmpty) throw  NotValidHdfsPathException("src/temp.json")
    println("The string is empty")

  println(FileType.AVRO)
  println(FileType.AVRO.toString)

//  if(FileType.AVRO.toString=="AVRO"){ println("It is correct")}
  def enumCheck(fType : FileType.TargetType)= {
    fType match {
      case FileType.AVRO => println("It is AVRO")
      case FileType.JSON => println("It is JSON")
      case FileType.PARQUET => println("It is PARQUET")
    }
  }
    enumCheck(FileType.AVRO)
  enumCheck(FileType.JSON)
  enumCheck(FileType.PARQUET)




}

case class NotValidHdfsPathException(message: String) extends Exception{
  println(s"$message")

  override def toString: String = s"Class: ${getClass.toString} Cause: $getCause $message is not a valid HDFS path"
}



