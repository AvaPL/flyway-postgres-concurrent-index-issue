ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.9"

lazy val root = (project in file("."))
  .settings(
    name := "flyway-postgres-concurrent-index-issue"
  )

libraryDependencies += "org.flywaydb" % "flyway-core" % "9.3.1"
libraryDependencies += "com.zaxxer" % "HikariCP" % "5.0.1"
libraryDependencies += "org.postgresql" % "postgresql" % "42.5.0"
