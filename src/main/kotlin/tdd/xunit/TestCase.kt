package tdd.xunit

open class TestCase(val name: String): Test {
    open fun setUp() {}
    open fun tearDown() {}

    override fun countTestCases(): Int = 1

    override fun run(result: TestResult) {
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
    }
}
