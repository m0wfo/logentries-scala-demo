logentries-scala-demo
=====================

Trivial example of log4j integration with Logentries in Scala.

Usage
=====

1) Edit src/main/resources/log4j.xml inserting your Logentries Token, `<param name="Token" value="LOGENTRIES-TOKEN" />`. See the [here](https://github.com/logentries/le_java) for more details.

2) Run `mvn scala:run` from the root of the project to start. The only prerequisites are Maven and Java 6+.
