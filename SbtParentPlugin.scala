import org.scalastyle.sbt.ScalastylePlugin.autoImport.{scalastyleFailOnWarning, scalastyleConfigUrl}
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
    resolvers += "Mainstreethub Releases" at mshRepo + "releases",
    scalastyleFailOnWarning := true,
    scalastyleConfigUrl := Some(url("https://raw.githubusercontent.com/mainstreethub/sbt-parent-plugin/master/scalastyle-config.xml"))
  )
}
