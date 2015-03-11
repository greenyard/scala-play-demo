resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"

resolvers += "SonaType" at "https://oss.sonatype.org/content/groups/public"

// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.3.7")

// web plugins

addSbtPlugin("com.typesafe.sbt" % "sbt-coffeescript" % "1.0.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-less" % "1.0.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-jshint" % "1.0.1")

addSbtPlugin("com.typesafe.sbt" % "sbt-rjs" % "1.0.1")

addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.0.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-mocha" % "1.0.0")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.11.2")