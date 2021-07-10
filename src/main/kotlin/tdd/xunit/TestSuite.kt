package tdd.xunit

class TestSuite : Test {
    val tests: MutableList<TestCase> = mutableListOf()

    override fun countTestCases(): Int = tests.size

    fun add(test: TestCase) {
        tests.add(test)
    }

    override fun run(result: TestResult) {
        for (test in tests) {
            test.run(result)
        }
    }
}
