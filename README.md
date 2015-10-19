# scala-hive-udf

This repository contains code for a simple Hive UDF written in Scala. You need to have following installed and configured,

* Scala
* SBT (>= 0.12 preferably)
 

All you have to do is execute the below command to build the project and obtain the JAR containing the UDF class
```
sbt assembly
```
Upon successful execution, the output JAR will be available in the directory _target/scala-\<version\>_.

The path to _hive-exec.jar_ is hard-coded with the value _/usr/lib/hive/lib/hive-exec.jar_. You can replace it with that of yours by modifying the below line in the file _build.sbt_.
```
unmanagedJars in Compile += file("/usr/lib/hive/lib/hive-exec.jar")
```

I have explained this in a bit more detail [here](https://questforthought.wordpress.com/2015/10/19/building-hive-udfs-using-scala-sbt/)
