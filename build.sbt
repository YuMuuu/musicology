name := "musicology"

version := "0.1"

scalaVersion := "2.13.7"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % "2.6.1",
"org.scalatest" %% "scalatest" % "3.2.10" % "test",
  "com.flowtick" %% "graphs-cats" % "0.8.0"
)