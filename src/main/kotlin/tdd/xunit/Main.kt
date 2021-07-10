package tdd.xunit

import java.lang.RuntimeException

class TestCaseTest(name: String): TestCase(name) {
    lateinit var result: TestResult

    override fun setUp() {
        result = TestResult()
    }

    fun testTemplateMethod() {
        val test = WasRun("testMethod")
        test.run(result)
        assert("setUp testMethod tearDown " == test.log)
    }

    fun testResult() {
        val test = WasRun("testMethod")
        test.run(result)
        assert("1 run, 0 failed" == result.summary())
    }

    fun testFailedResult() {
        val test = WasRun("testBrokenMethod")
        test.run(result)
        assert("1 run, 1 failed" == result.summary())
    }

    fun testFailedResultFormatting() {
        result.testStarted()
        result.testFailed()
        assert("1 run, 1 failed" == result.summary())
    }

    fun testSuite() {
        val suite = TestSuite()
        suite.add(WasRun("testMethod"))
        suite.add(WasRun("testBrokenMethod"))
        val result = TestResult()
        suite.run(result)
        assert("2 run, 1 failed" == result.summary())
    }
}

fun assertThatAssertionIsEnabled() {
    var assertEnabled = false
    try {
        assert(false)
    } catch (e: AssertionError) {
        assertEnabled = true
    }
    if (!assertEnabled) {
        throw RuntimeException("add '-ea' to VM options to enable assertion.")
    }
}

fun main() {
    assertThatAssertionIsEnabled()

    val suite = TestSuite()
    suite.add(TestCaseTest("testTemplateMethod"))
    suite.add(TestCaseTest("testResult"))
    suite.add(TestCaseTest("testFailedResult"))
    suite.add(TestCaseTest("testFailedResultFormatting"))
    suite.add(TestCaseTest("testSuite"))

    val result = TestResult()
    suite.run(result)
    println(result.summary())
}
