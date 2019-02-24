organization := "com.simple.dsl"

version := "1.0-SNAPSHOT"

scalaVersion := "2.12.7"

enablePlugins(Antlr4Plugin)

antlr4Version in Antlr4 := "4.7.2"

antlr4PackageName in Antlr4 := Some("com.simplytyped")
