name := "terrain-ahead-engine"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4.16",
  "com.typesafe.akka" %% "akka-http" % "10.0.1"
)


lazy val root = (project in file(".")).
  settings(
    name := "engine",
    version := "1.0",
    scalaVersion := "2.11.8"
  )