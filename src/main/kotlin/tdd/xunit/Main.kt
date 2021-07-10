package tdd.xunit

import java.lang.RuntimeException

class TestCaseTest(name: String): TestCase(name) {
    fun testTemplateMethod() {
        val test = WasRun("testMethod")
        test.run()
        assert("setUp testMethod tearDown " == test.log)
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
