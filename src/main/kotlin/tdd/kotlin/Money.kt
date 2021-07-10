package tdd.kotlin

abstract class Money(protected val amount: Int) {

    override fun equals(other: Any?): Boolean {
        return (other as Money?)?.amount == amount && javaClass == other?.javaClass
    }

    abstract fun times(multiplier: Int): Money

    companion object {
        fun dollar(amount: Int): Money = Dollar(amount)
        fun franc(amount: Int): Money = Franc(amount)
    }
}
