package tdd.xunit

import java.lang.RuntimeException

class TestCaseTest(name: String): TestCase(name) {
    lateinit var test: WasRun

    override fun setUp() {
        test = WasRun("testMethod")
    }

    fun testRunning() {
        test.run()
        assert(test.wasRun == 1)
    }

    fun testSetUp() {
        test.run()
        assert(test.wasSetUp == 1)
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

    TestCaseTest("testRunning").run()
    TestCaseTest("testSetUp").run()
}
