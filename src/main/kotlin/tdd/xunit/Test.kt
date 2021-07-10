package tdd.xunit

interface Test {
    fun countTestCases(): Int
    fun run(result: TestResult)
}
