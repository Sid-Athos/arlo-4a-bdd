ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.11"

lazy val root = (project in file("."))
  .settings(
    name := "al-bdd",
  )

libraryDependencies += "io.cucumber" %% "cucumber-scala" % "8.14.1" % Test
libraryDependencies += "io.cucumber" % "cucumber-junit" % "7.11.1" % Test
libraryDependencies += "junit" % "junit" % "4.13.2"
libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test
