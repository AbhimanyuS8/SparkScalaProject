package sparkUseCase

import java.net.URL

import common._
import org.apache.log4j.Level
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._


object SimpleJoinProcess extends App with mainMethods{
  override val spark: SparkSession =setSparkSession("first Program")
  setLog(Level.ERROR)
  val path = ClassLoader.getSystemResource("file1").getFile
  println(path)
  val df1=spark.read.format("com.databricks.spark.csv")
    .option("delimiter","|").option("header","true").load(path)
  val df2=spark.read.format("com.databricks.spark.csv").option("delimiter","|").option("header","true").load(path)
  val colList=List("col_3","col_2","col_4").map(x=>df2(x))
//    .mkString(",")
  println(colList)
  val jn1= df1.join(df2,df1("col_3")=== df2("col_3"),"left")
//    .drop(colList)


//  val dfList = colList.foldLeft(){ (dr, it)=> df1(it)}

  val jn2= df1.join(df2,Seq("col_3"),"left")
    .drop(df2("col_3"))
  jn2.printSchema()
  jn1.show(false)
  jn2.show(false)
}
