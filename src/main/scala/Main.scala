import org.apache.log4j.LogManager

object Main {

  def main(args: Array[String]) {
    val log = LogManager.getRootLogger()
    log.debug("Hello, Scala world!")
    Thread.sleep(1000)
  }
}
