package tdd.xunit

class WasRun(name: String) : TestCase(name) {
    var wasRun: Int = 0
    var wasSetUp: Int = 0
    var log: String = ""

    fun testMethod() {
        wasRun = 1
        log += "testMethod "
    }

    fun testBrokenMethod() {
        throw Exception()
    }

    override fun setUp() {
        wasSetUp = 1
        log += "setUp "
    }

    override fun tearDown() {
        log += "tearDown "
    }
}
