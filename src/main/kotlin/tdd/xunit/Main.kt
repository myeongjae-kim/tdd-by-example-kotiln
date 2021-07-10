package tdd.xunit

class TestCaseTest(name: String): TestCase(name) {
    fun testRunning() {
        val test = WasRun("testMethod")
        assert(test.wasRun == 0)
        test.run()
        assert(test.wasRun == 1)
    }
}

fun main() {
    TestCaseTest("testRunning").run()
}
