import Keys._
addCommandAlias("showChapters", "projects")
lazy val commonSettings = Seq(
  organization := "scalaBasic",
  version := "0.1.0",
  scalaVersion := "2.12.3"
)

lazy val chapter1 = (project in file("chapter1"))
  .settings(commonSettings)
  .settings(
    name := "chapter1",
    mainClass in (Compile, run) := Some("scalaBasic.chapter1.Main")
  )