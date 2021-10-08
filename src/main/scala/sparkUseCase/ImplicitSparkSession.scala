package sparkUseCase
import common.mainMethods
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._
// implict variable of type SparkSession is defined in  mainMethods trait

object ImplicitSparkSession extends App with mainMethods {


  callImplicitSpark

  def callImplicitSpark(implicit s:SparkSession): Unit =
  {

    import s.implicits._
    val data=Seq(("Abhimanyu","31"),("Krishna","36"))
    val df=data.toDF("name","age")

    val df1= df.withColumn("Out_col", when(col("name")===lit("Krishna"),"Krishna")
      .otherwise("Abhimanyu"))

    df1.show()

  }
}
