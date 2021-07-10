package tdd.kotlin

open class Money(protected val amount: Int) {

    override fun equals(other: Any?): Boolean {
        return (other as Money?)?.amount == amount && javaClass == other?.javaClass
    }
}
