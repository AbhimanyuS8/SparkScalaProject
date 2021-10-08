package sparkUseCase

import common._
import org.apache.spark.sql.functions._
import org.apache.log4j.Level
import org.apache.spark.sql.Column
import sparkUseCase.firstSparkProgram.{setLog, setSparkSession}
object oneToMany extends mainMethods {

  override val spark=setSparkSession("OneToMany")
  setLog(Level.ERROR)

  val df1=spark.read.format("com.databricks.spark.csv").option("delimiter","|").option("header","true").load("C:\\Users\\Vrindavan\\IdeaProjects\\SparkScalaProject\\src\\main\\resources\\file1")
  val df2=spark.read.option("header","true").csv("C:\\Users\\Vrindavan\\IdeaProjects\\SparkScalaProject\\src\\main\\resources\\file2")
  val df11=df1.withColumn("j_col1", concat(lit(",") , col("col_2"),lit(",")))
df1.createOrReplaceTempView("df1_view")


  def sTrim(s: String)={

    val a= s.split(",").map(s=> s.trim).mkString(",")

      a

  }

  val df = (s:String) => {val a= s.split(",").map(s=>s.trim).mkString(",")

  }
val myUDF=udf((s:String) => s.split(",").map(s=>s.trim).mkString(","))
  println("Adding"+ sTrim("s,a,b,c,d, f, g, h,ggg "))
 val df112 = df1.withColumn("joinCol1", myUDF(col("col_2")))
  val df111=df1.withColumn("joinCol",concat(lit(","),myUDF(col("col_2")),lit(",")))
df111.show()
  df111.printSchema()
//df1.select(trim(split(col("col_2"),",")).as("NameArray")).show()

  val df22=df2.withColumn("j_col2",concat(lit(",") , trim(col("col_2")),lit(",")))
 // val joinEXP= df1.col("col_2").contains("," + df2.col("col_2") + ",")
// val joinCond: Column = when(df11.col("j_col1").contains( df22.col("j_col2")),true).otherwise(false)
val joinCond: Column = df11.col("j_col1").contains( df22.col("j_col2"))
//val jnDF=df1.join(df2).filter(joinCond)

//  val jnDF=df11.join(df22,joinCond,"left_outer")
  val  joinCond1: Column = df111.col("joinCol").contains( df22.col("j_col2"))
  val jnDF1=df111.join(df22,joinCond1,"left_outer")
  df11.show()
  df22.show()
jnDF1.show()




}
