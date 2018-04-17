lazy val root = (project in file("."))
  .settings(
    sbtPlugin := true,
    version := "0.0.1",
    name := "sbt-parent-plugin",
    organization := "com.mainstreethub",
    scalaVersion := "2.10.4",
    publishMavenStyle := false,
    publishTo := sonatypePublishTo.value,
    addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")
  )