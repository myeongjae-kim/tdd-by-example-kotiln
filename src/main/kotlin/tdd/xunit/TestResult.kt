package tdd.xunit

class TestResult {
    private var runCount = 0
    private var failureCount = 0

    fun testStarted() {
        runCount++
    }

    fun testFailed() {
        failureCount++
    }

    fun summary(): String = "$runCount run, $failureCount failed"

}
