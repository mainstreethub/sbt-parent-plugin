import sbt._
import sbt.Keys._

object SbtParentPlugin extends AutoPlugin {

  val mshRepo = "s3://artifacts.mainstreethub.com/maven/"

  override lazy val projectSettings = Seq(
    organization := "com.mainstreethub",
    publishTo := {
      if (isSnapshot.value)
        Some("Mainstreethub Snapshots" at mshRepo + "snapshots")
      else
        Some("Mainstreethub Releases" at mshRepo + "releases")
    },
    resolvers += "Mainstreethub releases" at mshRepo + "releases"
  )
}
