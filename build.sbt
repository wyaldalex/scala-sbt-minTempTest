name := "MinTemperaturesDataset"

version := "1.0"

organization := "com.sundogsoftware"

scalaVersion := "2.12.0"

libraryDependencies ++= Seq(
"org.apache.spark" %% "spark-core" % "2.4.5" % "provided",
"org.apache.spark" %% "spark-sql" % "2.4.5" % "provided",
"org.scalatest" %% "scalatest" % "3.0.0" % "test"
)
