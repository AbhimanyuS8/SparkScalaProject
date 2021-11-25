package demo.project.com.frameworkEngine
import java.io.File

import com.typesafe.config.{Config, ConfigFactory}


object configFileResolver extends App{
  val AppConf=ConfigFactory.parseResources("application.conf")
  val conf=ConfigFactory.parseResources("override.conf").withFallback(AppConf)

  def getConfigDetails(configFile:Option[String]=None): Config ={

    val confFile = {
      configFile.getOrElse("default") match {

        case "default" => conf
        case _ => ConfigFactory.parseFile(new File(configFile.get)).withFallback(conf)
      }
    }

    confFile
  }

  def getConfigList()={}
  println(conf.getString("config.database.name"))
  println(conf.getString("config.file.name"))

  val lst=conf.getList("hive-database")

  println(lst.toString)

}
