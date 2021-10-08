package common

import java.io.File

import com.typesafe.config.ConfigFactory
import common.DbConfig.{applicationConf, getClass}
import org.apache.log4j.Logger


//case class configDetails ( jdbcUrl:String,jdbcUsername:String,jdbcPassword:String,jdbcdriver:String,jdbcTableName:String)
object ReadingConfigDetails extends mainMethods {
  val logger = Logger.getLogger(getClass.getName)

//  ConfigFactory.load(this.getClass().getClassLoader())
//  val applicationConf = ConfigFactory.parseFile(new File("/C/Users/Vrindavan/IdeaProjects/SparkScalaProject/src/main/resources/override.conf"))
// val applicationConf= ConfigFactory.parseResources("/C:/Users/Vrindavan/IdeaProjects/SparkScalaProject/src/main/resources/override.conf")

  val applicationConf = ConfigFactory.parseFile(new File("src\\main\\resources\\override.conf"))
  //  C:\Users\Vrindavan\IdeaProjects\SparkScalaProject\src\main\resources
//  val jUrl =  applicationConf.getString("config.database.jdbcUrl")
  val jUser =  applicationConf.getString("config.database.name")
//  val jPass =  applicationConf.getString("config.database.jdbcPassword")
//  val jD =  applicationConf.getString("config.database.jdbcdriver")
//  val jT =  applicationConf.getString("config.database.jdbcTableName")
//  configDetails(jUrl,jUser,jPass,jD,jT)
//  println("Details are " + configDetails)

 print("printing  " + jUser)
}
