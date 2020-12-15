package simpleScala.playground

// topics Control Statements

import java.io.File

object FileList extends App{
  val filesHere = (new File("H:/Hadoop/datasets/datasets/")).listFiles

// It lists down all the files name present in the datasets directory
//  for (file <- filesHere)
//    println(file)

  def scalaFiles=
  for {
    file <- filesHere
    // if file.getName.endsWith(".txt")

     } yield file
  // println("Printing Files of txt format")
  //scalaFiles.foreach(println)

  def fileLines(file: java.io.File)=
    scala.io.Source.fromFile(file).getLines

  def grep(pattern: String): Unit =
    for {
      file <- filesHere
      if file.getName.endsWith(".txt")
      line <- fileLines(file)
      if line.trim.matches(pattern)
    } println(file + ": " + line.trim)
  grep(".*Krishna.*")

}
