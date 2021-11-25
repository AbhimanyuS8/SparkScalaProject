package demo.project.com.frameworkEngine

import java.util
import scala.collection.JavaConverters._
import com.typesafe.config.{Config, ConfigFactory}

class ConfigDetails {}
case class Database(name:String,db:String,user:String,password:String,host:String) extends ConfigDetails
case class HiveDetails(name:String,db:String,user:String,password:String,host:String) extends ConfigDetails


class DatabaseConfigLoader(val connectionType:String, val confDetailsList: Config) extends ConfigNode[ConfigDetails]  {

 private val details: Map[String, Database] = confDetailsList.getConfigList(connectionType).asScala.map{ config=>
    config.getString("name")-> Database(config.getString("name"),
      config.getString("db"),
      config.getString("user"),
      config.getString("password"),
      config.getString("host")
    )
  }.toMap

 override def load(name:String):ConfigDetails={

   details.get(name).get
 }

}



class FileConfigLoader() {


}

class HiveConfigLoader(val connetionType:String, val confDetailsList: Config) extends ConfigNode[ConfigDetails]  {

  private val details: Map[String, HiveDetails] = confDetailsList.getConfigList(connetionType).asScala.map{ config=>
    config.getString("name")-> HiveDetails(config.getString("name"),
      config.getString("db"),
      config.getString("user"),
      config.getString("password"),
      config.getString("host")
    )
  }.toMap

  override def load(name:String):ConfigDetails={

    details.get(name).get
  }

}
class KafkaConfigLoader{



}

object ConfigLoader {

  def apply(connType:String,filePath:Option[String]=None)= {
    val conType= connType
    val confDetails = configFileResolver.getConfigDetails(filePath)
    conType match {

      case "hive-database" => new DatabaseConfigLoader(conType,confDetails)
      case _ => new HiveConfigLoader(conType,confDetails)



    }


  }
}

object MainMethod extends App{


    ConfigLoader("hive-database").load("saturn23")
    ConfigLoader("").load("")
}