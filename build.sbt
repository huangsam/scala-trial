ThisBuild / version := "0.1.0-SNAPSHOT"

// https://www.scala-lang.org/download/all.html
ThisBuild / scalaVersion := "3.7.1"

lazy val root = (project in file("."))
  .settings(
    name := "scala-trial",
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % Test
libraryDependencies += "org.scalamock" %% "scalamock" % "7.3.2" % Test
