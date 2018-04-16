// Your profile name of the sonatype account. The default is the same with the organization value
sonatypeProfileName := "com.mainstreethub"

// To sync with Maven central, you need to supply the following information:
publishMavenStyle := true

// License of your choice
licenses := Seq("APL2" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))

// Where is the source code hosted
import xerial.sbt.Sonatype._
sonatypeProjectHosting := Some(GitHubHosting("mainstreethub", "sbt-parent-plugin", "mainstreethub@github.com"))

// or if you want to set these fields manually
//homepage := Some(url("http://www.mainstreethub.com"))
//scmInfo := Some(
//  ScmInfo(
//    url("https://github.com/mainstreethub/sbt-s3-plugin"),
//    "scm:git@github.com:mainstreethub/sbt-parent-plugin.git"
//  )
//)
//developers := List(
//  Developer(id="drew.zoellner", name="drew zoellner", email="drew.zoellner@mainstreethub.com", url=url("http://www.mainstreethub.com"))
//)
