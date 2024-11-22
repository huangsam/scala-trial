ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.5.2"

lazy val root = (project in file("."))
  .settings(
    name := "scala-trial",
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % Test
libraryDependencies += "org.scalamock" %% "scalamock" % "6.0.0" % Test
