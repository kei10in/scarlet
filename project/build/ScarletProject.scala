import sbt._

class ScarletProject(info: ProjectInfo) extends DefaultProject(info) {
  val scalaTest = "org.scalatest" % "scalatest" % "1.2"
}
