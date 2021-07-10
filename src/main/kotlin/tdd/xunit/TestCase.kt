package tdd.xunit

open class TestCase(val name: String) {
    open fun setUp() {}
    open fun tearDown() {}

    fun run() {
        setUp()
        val method = this.javaClass.getDeclaredMethod(name)
        method.isAccessible = true
        method.invoke(this)
        tearDown()
    }
}
