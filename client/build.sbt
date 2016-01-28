name := """kyotoTycoonSample"""

version := "1.0"


organization := "com.github.uryyyyyyy"

crossPaths := false

autoScalaLibrary := false

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

libraryDependencies ++= Seq(
	"junit" % "junit" % "4.12" % "test"
)
