name := "terrain-ahead-engine"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4.9",
  "com.typesafe.akka" %% "akka-http-experimental" % "2.4.9"
)


lazy val root = (project in file(".")).
  settings(
    name := "engine",
    version := "1.0",
    scalaVersion := "2.11.8"
  )