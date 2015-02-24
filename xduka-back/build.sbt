import play.PlayScala

javaOptions ++= Seq("-Xmx128M", "-Xmx256M", "-XX:MaxPermSize=128M")


val appName         = "xduka"
val appVersion      = "1.0alfa"


lazy val `xduka` = (project in file(".")).enablePlugins(PlayScala)


val log4j =  "log4j" % "log4j" % "1.2.17"

scalaVersion := "2.11.4"

val xStreamVersion = "1.2.2"

val JPAVersion = "4.3.7.Final"

val MysSQLVersion = "5.1.34"

libraryDependencies ++= Seq(
  javaCore,
  log4j,
  jdbc , anorm , cache , ws,
  javaJpa,
  "junit" % "junit" % "4.11" % "test" exclude("org.hamcrest", "hamcrest-core"),
  "org.hibernate" % "hibernate-entitymanager" % JPAVersion,
  javaJpa.exclude("org.hibernate.javax.persistence", "hibernate-jpa-2.0-api"),
  "com.microsoft.sqlserver"% "sqljdbc4" % "4.0")


unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )