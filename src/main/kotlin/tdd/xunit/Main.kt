package tdd.xunit

import java.lang.RuntimeException

class TestCaseTest(name: String): TestCase(name) {
    fun testTemplateMethod() {
        val test = WasRun("testMethod")
        val result = test.run()
        assert("setUp testMethod tearDown " == test.log)
        assert("1 run, 0 failed" == result.summary())
    }

    fun testFailedResult() {
        val test = WasRun("testBrokenMethod")
        val result = test.run()
        assert("1 run, 1 failed" == result.summary())
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

    TestCaseTest("testTemplateMethod").run()
}
