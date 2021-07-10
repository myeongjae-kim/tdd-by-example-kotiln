package tdd.kotlin

abstract class Money(
    protected val amount: Int,
    protected val currency: String,
) {

    override fun equals(other: Any?): Boolean {
        return (other as Money?)?.amount == amount && javaClass == other?.javaClass
    }

    abstract fun times(multiplier: Int): Money
    abstract fun currency(): String

    companion object {
        fun dollar(amount: Int): Money = Dollar(amount, "USD")
        fun franc(amount: Int): Money = Franc(amount, "CHF")
    }
}
