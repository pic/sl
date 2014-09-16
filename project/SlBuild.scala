import sbt._
import sbt.Keys._

object SlBuild extends Build {

  lazy val sl = Project(
    id = "sl",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "sl",
      organization := "org.peach",
      version := "0.0.1",
      scalaVersion := "2.11.2",

      scalacOptions += "-feature",
      scalacOptions += "-deprecation"
    )
  )
}
