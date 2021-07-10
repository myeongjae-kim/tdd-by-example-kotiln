package tdd.kotlin

open class Money(
    protected val amount: Int,
    protected val currency: String,
) {

    override fun equals(other: Any?): Boolean {
        val money = other as Money?
        return money?.amount == amount && money.currency == currency
    }

    fun times(multiplier: Int): Money = Franc(amount * multiplier, currency)
    fun currency(): String = currency

    companion object {
        fun dollar(amount: Int): Money = Dollar(amount, "USD")
        fun franc(amount: Int): Money = Franc(amount, "CHF")
    }
}
