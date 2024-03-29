package sparkUseCase
import common._
import org.apache.log4j.Level
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._

object firstSparkProgram extends mainMethods {
  override val spark: SparkSession =setSparkSession("first Program")
setLog(Level.ERROR)
  //val spark= SparkSession.builder().appName("first Program").master("local[*]").getOrCreate()
 //val file=spark.read.format("csv").load("E:/IdeaProject/SourceData/csv/emp.txt")
  //file.show()
import spark.implicits._
  val data=Seq(("09-01-2020 10:05:15",15),
    ("10-01-2020 10:00:15",20),
    ("11-01-2020 11:05:15",10),
    ("12-01-2020 09:05:15",25),
    ("13-01-2020 23:15:15",50)).toDF("start_time","add_min")
    .withColumn("dt_time",to_timestamp(col("start_time"),"dd-MM-YYYY HH:MM:SS"))

  data.createOrReplaceTempView("data_t")

  val a= spark.sql("Select start_time,dt_time, dt_time + INTERVAL 2 minutes as dt  from data_t")
/*  data.printSchema()
  data.show()
  a.printSchema()
  a.show()*/

  val empData=Seq(("Ram","Ayodhya","10"),("Shyam","Vrindavan","12"),("Krishna","Mathura",null),("Jaganath","Puri",null))

  val empDF= empData.toDF("name","address","age")
val colLst= empDF.columns
 val rsDF= colLst.foldLeft(empDF)((acc,colmn)=>(acc.withColumn(colmn,when(col(colmn).isNull,lit("NULL"))
   .otherwise(col(colmn)))))
  val jsnDF=empDF.withColumn("value",struct($"*"))
    .withColumn("JsonValue",to_json(struct($"*")))
      .withColumn("value2",to_json(struct("name",colLst.filterNot(c=> c =="name"):_*)))

  empDF.show()
  jsnDF.printSchema()
  jsnDF.show(false)
//  rsDF.show(false)

  spark.close()
}
