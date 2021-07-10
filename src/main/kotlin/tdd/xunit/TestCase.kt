package tdd.xunit

open class TestCase(val name: String) {
    fun run() {
        val method = this.javaClass.getDeclaredMethod(name)
        method.isAccessible = true
        method.invoke(this)
    }
}
