package test.utest
import utest._
import utest.framework.{HTree, Result, Tree}

object DisablePrintTests extends utest.TestSuite{
  override def formatSummary(topLevelName: String, results: HTree[String, Result]) = None
  override def formatColor = false
  def tests = Tests{
    'hello - {
      123
    }
  }
}

