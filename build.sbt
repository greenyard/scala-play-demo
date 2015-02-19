import AssemblyKeys._

assemblySettings

mainClass in assembly := Some("play.core.server.NettyServer")

fullClasspath in assembly += Attributed.blank(PlayKeys.playPackageAssets.value)

name := """demo"""

version := "latest"

lazy val root = (project in file(".")).enablePlugins(PlayScala, DockerPlugin)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)

libraryDependencies ~= { _ map {
  case m if m.organization == "com.typesafe.play" =>
    m.exclude("commons-logging", "commons-logging").
      exclude("com.typesafe.play", "sbt-link")
  case m => m
}}



// -------------Docker configuration-------------

maintainer in Docker := "fernando.benjamin@zalando.de"


// Add this to let Jenkins overwrite your 
dockerRepository :=  Some(sys.props.getOrElse("JENKINS_REPOSITORY", default="docker-registry.zalando/fbenjamin")) 

dockerBaseImage := "zalando/openjdk:8u40-b09-2"

dockerExposedPorts in Docker := Seq(9000, 9443)
