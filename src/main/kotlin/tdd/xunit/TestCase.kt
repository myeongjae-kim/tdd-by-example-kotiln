package tdd.xunit

open class TestCase(val name: String) {
    open fun setUp() {}
    open fun tearDown() {}

    fun run(): TestResult {
        val result = TestResult()
        result.testStarted()
        setUp()
        try {
            val method = this.javaClass.getDeclaredMethod(name)
            method.isAccessible = true
            method.invoke(this)
        } catch (e: Throwable) {
            result.testFailed()
        }
        tearDown()
        return result
    }
}
