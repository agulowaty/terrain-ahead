name := "terrain-ahead-engine"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies +=
  "com.typesafe.akka" %% "akka-actor" % "2.4.9"


lazy val root = (project in file(".")).
  settings(
    name := "engine",
    version := "1.0",
    scalaVersion := "2.11.8"
  )