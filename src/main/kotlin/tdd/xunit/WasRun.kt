package tdd.xunit

class WasRun(name: String): TestCase(name) {
    var wasRun: Int = 0

    fun testMethod() {
        wasRun = 1
    }
}
