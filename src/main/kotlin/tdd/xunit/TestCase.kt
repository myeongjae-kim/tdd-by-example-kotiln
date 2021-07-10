package tdd.xunit

open class TestCase(val name: String) {
    open fun setUp() {

    }

    fun run() {
        setUp()
        val method = this.javaClass.getDeclaredMethod(name)
        method.isAccessible = true
        method.invoke(this)
    }
}
