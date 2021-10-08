package Zomato

import common.mainMethods
import org.apache.log4j.Level
import sparkUseCase.oneToMany.{setLog, setSparkSession}
import org.apache.spark.sql.functions._
import org.apache.spark.sql.functions.{lit,when}
import org.apache.log4j.Level
import org.apache.spark.sql.Column
object LocalMain extends mainMethods  {
   setLog(Level.ERROR)
//  val s1= new DataRefinementCountryCode(setSparkSession("Processing Zomato CSV"),args(0))
  // /E:/IdeaProject/SourceData/Kaggle/Zomato/CountryCode.xlsx
//  val s2= new DataRefinementZomato(spark,args(0))
// args(1)= /E:/IdeaProject/SourceData/Kaggle/Zomato/Zomato.csv

  override val spark=setSparkSession("OneToMany")
  setLog(Level.ERROR)

  val df=spark.read.option("header","true").csv("C:\\Users\\Vrindavan\\IdeaProjects\\SparkScalaProject\\src\\main\\resources\\inputFile1")


  df.printSchema()
  df.show()
 /* val df1=df.select("col1","col2")
  val df2=df.select("col3")
    .withColumnRenamed("col3","col1")
//val df_jn=df1.join(df2,df1("col1")===df2("col3"),"left_outer")
//  val df_jn1=df1.join(df2,df1("col1")===df2("col3"),"left_outer").filter(df2("col3").isNotNull ||
//  df1("col1").isNull)
val df_jn1=df1.join(df2,Seq("col1")
//  df1("col1")===df2("col1")
  ,"left_outer")
//  .filter(df2("col1").isNotNull ||
//  df1("col1").isNull)
//    .drop(df2("col1"))

//  df_jn.show()
  df_jn1.show()

  */

}
/***
+----+----+----+
|col1|col2|col3|
+----+----+----+
|   1|   A|   1|
|   2|   B|   2|
|   3|   C|   3|
|   4|   D|null|
|   5|   E|null|
|null|   F|null|
|null|   G|null|
+----+----+----+

 +----+----+
|col1|col2|
+----+----+
|   1|   A|
|   2|   B|
|   3|   C|
|null|   F|
|null|   G|
+----+----+
 *****///

