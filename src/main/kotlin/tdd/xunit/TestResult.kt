package tdd.xunit

class TestResult {
    private var runCount = 0

    fun testStarted() {
        runCount++
    }

    fun summary(): String = "$runCount run, 0 failed"
}
