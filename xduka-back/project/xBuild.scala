import play.PlayImport._
import play.PlayScala
import sbt.Build
import sbt.Keys._
import sbt._



object xBuild extends Build {

  //versions
  val xStreamVersion = "1.2.2"
  val JPAVersion = "4.3.7.Final"
  val scalaxmlVersion = "1.0.3"
  val log4jVersion = "1.2.17"
  val mssqlVersion = "4.0"

  // packages
  lazy val scalaxml = "org.scala-lang.modules" %% "scala-xml" % scalaxmlVersion
  lazy val mssql = "com.microsoft.sqlserver"% "sqljdbc4" % mssqlVersion
  lazy val JPA = "org.hibernate" % "hibernate-entitymanager" % JPAVersion
  lazy val log4j =  "log4j" % "log4j" % log4jVersion




  // Resolvers
  lazy val local = "Local Maven Repository" at "file://" + Path.userHome + "/.m2/repository"
  lazy val typesafe = "Typesafe" at "http://repo.typesafe.com/typesafe/releases"
  lazy val junit = "junit" % "junit" % "4.11" % "test" exclude("org.hamcrest", "hamcrest-core")
  lazy val xdevel = "nexus.xdevel.com.br" at "http://nexus.xdevel.com.br/content/repositories/releases"
  lazy val maven2 = "maven2" at "https://repo1.maven.org/maven2"
  lazy val fwbrasil = "fwbrasil.net" at "http://repo1.maven.org/maven2"






  def commonSettings =
    Seq(
      scalaVersion := "2.11.6",
      version := "1.0alpha",
      organization := "br.com.xduka",
      exportJars := true,
      resolvers ++= Seq(
        xdevel,
        local,
        typesafe,
        maven2,
        fwbrasil
      )
    )  ++  net.virtualvoid.sbt.graph.Plugin.graphSettings

  libraryDependencies ++= Seq( jdbc , anorm , cache , ws  )


  // without new dependencies
  lazy val xDukaOldModel = Project(
    id = "xDukaOldModel",
    base = file("xDukaOldModel"),
    settings = commonSettings ++ Seq(
      libraryDependencies ++= Seq(mssql,JPA,scalaxml))
  )




  // crawler detran
  lazy val xduka = Project(id = "xDuka",
    base = file("."),
    aggregate = Seq(xDukaOldModel),
    dependencies = Seq(xDukaOldModel),
    settings = commonSettings ++ Seq(
      libraryDependencies ++= Seq(log4j))
  ) enablePlugins PlayScala





  unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )

}