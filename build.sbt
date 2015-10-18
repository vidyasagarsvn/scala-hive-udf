lazy val commonSettings = Seq(
     organization := "com.scalatest",
     version := "0.1.0",
     scalaVersion := "2.11.7"
)

lazy val root = (project in file(".")).
     settings(commonSettings: _*).
     settings(
        name := "ScalaHiveUDF",
        assemblyJarName in assembly := "scala-hive-udfs.jar",
        assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false, includeDependency = false),
        unmanagedJars in Compile += file("/usr/lib/hive/lib/hive-exec.jar")
     )
